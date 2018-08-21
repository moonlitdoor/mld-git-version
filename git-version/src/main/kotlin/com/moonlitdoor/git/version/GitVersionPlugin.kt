package com.moonlitdoor.git.version

import org.gradle.api.Plugin
import org.gradle.api.Project
import java.util.concurrent.TimeUnit

class GitVersionPlugin : Plugin<Project> {
    override fun apply(target: Project?) {

    }

    private fun getGitVersion(project: Project): String {
        val command = listOf("git", "describe", "--tags")
        val process = ProcessBuilder(command)
                .directory(project.projectDir)
                .redirectOutput(ProcessBuilder.Redirect.PIPE)
                .redirectError(ProcessBuilder.Redirect.PIPE)
                .start()
        process.waitFor(60, TimeUnit.SECONDS)
        return getGitStatus(project, process.inputStream.bufferedReader().readText().trim())
    }

    private fun getGitStatus(project: Project, version: String): String {
        val command = listOf("git", "status", "--porcelain")
        val process = ProcessBuilder(command)
                .directory(project.projectDir)
                .redirectOutput(ProcessBuilder.Redirect.PIPE)
                .redirectError(ProcessBuilder.Redirect.PIPE)
                .start()
        process.waitFor(60, TimeUnit.SECONDS)
        return if (process.inputStream.bufferedReader().readText().trim().isEmpty()) {
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

    private fun getGitCommitCount(project: Project): Long {
        val command = listOf("git", "rev-list", "--count", "HEAD")
        val process = ProcessBuilder(command)
                .directory(project.projectDir)
                .redirectOutput(ProcessBuilder.Redirect.PIPE)
                .redirectError(ProcessBuilder.Redirect.PIPE)
                .start()
        process.waitFor(60, TimeUnit.SECONDS)
        val line = process.inputStream.bufferedReader().readText().trim()
        return if (line.isNotEmpty()) {
            line.toLong() + getGitTagCount(project)
        } else {
            0
        }
    }

    private fun getGitTagCount(project: Project): Long {
        val command = listOf("git", "tag")
        val process = ProcessBuilder(command)
                .directory(project.projectDir)
                .redirectOutput(ProcessBuilder.Redirect.PIPE)
                .redirectError(ProcessBuilder.Redirect.PIPE)
                .start()
        process.waitFor(60, TimeUnit.SECONDS)
        val line = process.inputStream.bufferedReader().readText().trim()
        return if (line.isNotEmpty()) {
            line.split("\n").size.toLong()
        } else {
            0
        }
    }

}