package com.moonlitdoor.git.version

import com.moonlitdoor.git.version.extensions.BranchOffsetNestedExtension
import com.moonlitdoor.git.version.extensions.MoonlitDoorExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.internal.impldep.com.google.common.annotations.VisibleForTesting
import java.io.File

@Suppress("Unused")
class GitVersionPlugin : Plugin<Project> {

    @VisibleForTesting
    internal var git = GitFacade()

    override fun apply(project: Project) {

        if (project.extensions.findByType(MoonlitDoorExtension::class.java) == null) {
            project.extensions.create(MoonlitDoorExtension.EXTENSION_NAME, MoonlitDoorExtension::class.java).offsets = project.container(BranchOffsetNestedExtension::class.java)
        }

        var gitCommitCount = getGitCommitCount(project.projectDir)
        val gitTagCount = getGitTagCount(project.projectDir)
        val gitBranchName = getGitBranchName(project.projectDir)
        val gitVersion = getGitVersion(project.projectDir)

        project.extensions.getByType(MoonlitDoorExtension::class.java).offsets.find { Regex(it.name).matches(gitBranchName) || Regex(it.name).matches(gitVersion) }?.let {
            gitCommitCount += it.offset
        }
        project.extensions.add(GIT_COMMIT_COUNT, gitCommitCount)
        project.extensions.add(GIT_TAG_COUNT, gitTagCount)
        project.extensions.add(GIT_COMMIT_AND_TAG_COUNT, gitCommitCount + gitTagCount)
        project.extensions.add(GIT_VERSION, gitVersion)
        project.extensions.add(GIT_BRANCH_NAME, gitBranchName)
    }

    private fun getGitVersion(projectDir: File): String {
        val output = git.runCommand(projectDir, "git", "describe", "--tags")
        return getGitStatus(projectDir, output)
    }

    private fun getGitStatus(projectDir: File, version: String): String {
        val output = git.runCommand(projectDir, "git", "status", "--porcelain")
        return if (output.isEmpty()) {
            version
        } else {
            if (version.contains("-g")) {
                val withOutHash = version.subSequence(0, version.indexOf("-g"))
                val withOutCommitCount = withOutHash.substring(0, withOutHash.lastIndexOf("-") + 1)
                val commitCount = withOutHash.substring(withOutHash.lastIndexOf("-") + 1)
                "$withOutCommitCount${commitCount.toInt().inc()}-SNAPSHOT"
            } else "$version-1-SNAPSHOT"
        }
    }

    private fun getGitCommitCount(projectDir: File): Long {
        val output = git.runCommand(projectDir, "git", "rev-list", "--count", "HEAD")
        return if (output.isNotEmpty()) {
            output.toLong()
        } else {
            0
        }
    }

    private fun getGitTagCount(projectDir: File): Long {
        val output = git.runCommand(projectDir, "git", "tag")
        return if (output.isNotEmpty()) {
            output.split("\n").size.toLong()
        } else {
            0
        }
    }

    private fun getGitBranchName(projectDir: File): String {
        return git.runCommand(projectDir, "git", "rev-parse", "--abbrev-ref", "HEAD")
    }

    companion object {
        const val GIT_COMMIT_COUNT = "gitCommitCount"
        const val GIT_TAG_COUNT = "gitTagCount"
        const val GIT_COMMIT_AND_TAG_COUNT = "gitCommitAndTagCount"
        const val GIT_VERSION = "gitVersion"
        const val GIT_BRANCH_NAME = "gitBranchName"
    }

}
