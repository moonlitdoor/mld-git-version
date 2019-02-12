package com.moonlitdoor.git.version

import com.moonlitdoor.git.version.extensions.BranchOffsetNestedExtension
import com.moonlitdoor.git.version.extensions.MoonlitDoorExtension
import org.gradle.kotlin.dsl.get
import org.junit.Assert.assertEquals
import org.junit.Test


open class GitVersionPluginTest {

    @Test
    fun testGitBranchName() {
        val plugin = GitVersionPlugin()
        val project = FakeProject()
        plugin.git = FakeGitFacade()
        plugin.apply(project)

        assertEquals("master", project.extensions[GitVersionPlugin.GIT_BRANCH_NAME])
    }

    @Test
    fun testGitCommitCount() {
        val plugin = GitVersionPlugin()
        val project = FakeProject()
        plugin.git = FakeGitFacade()
        plugin.apply(project)

        assertEquals(20L, project.extensions[GitVersionPlugin.GIT_COMMIT_COUNT])
    }

    @Test
    fun testGitCommitCountBranchAlphaAlphaOffset1000() {
        val plugin = GitVersionPlugin()
        val project = FakeProject()
        project.extensions.create(MoonlitDoorExtension.EXTENSION_NAME, MoonlitDoorExtension::class.java).offsets.add(BranchOffsetNestedExtension("alpha", 1_000))
        plugin.git = object : FakeGitFacade() {
            override fun getBranch(): String = "alpha"
        }
        plugin.apply(project)

        assertEquals(1020L, project.extensions[GitVersionPlugin.GIT_COMMIT_COUNT])
    }

    @Test
    fun testGitCommitCountBranchMasterAlphaOffset1000() {
        val plugin = GitVersionPlugin()
        val project = FakeProject()
        project.extensions.create(MoonlitDoorExtension.EXTENSION_NAME, MoonlitDoorExtension::class.java).offsets.add(BranchOffsetNestedExtension("alpha").also {
            it.offset = 1_000
        })
        plugin.git = FakeGitFacade()
        plugin.apply(project)

        assertEquals(20L, project.extensions[GitVersionPlugin.GIT_COMMIT_COUNT])
    }

    @Test
    fun testGitTagCount() {
        val plugin = GitVersionPlugin()
        val project = FakeProject()
        plugin.git = FakeGitFacade()
        plugin.apply(project)

        assertEquals(6L, project.extensions[GitVersionPlugin.GIT_TAG_COUNT])
    }

    @Test
    fun testGitCommitAndTagCount() {
        val plugin = GitVersionPlugin()
        val project = FakeProject()
        plugin.git = FakeGitFacade()
        plugin.apply(project)

        assertEquals(26L, project.extensions[GitVersionPlugin.GIT_COMMIT_AND_TAG_COUNT])
    }

    @Test
    fun testGitVersion_0_0_0() {
        val plugin = GitVersionPlugin()
        val project = FakeProject()
        plugin.git = FakeGitFacade()
        plugin.apply(project)

        assertEquals("0.0.0", project.extensions[GitVersionPlugin.GIT_VERSION])
    }

    @Test
    fun testGitVersion_0_0_0_RC1() {
        val plugin = GitVersionPlugin()
        val project = FakeProject()
        plugin.git = object : FakeGitFacade() {
            override fun getTag() = "0.0.0-RC1"
        }
        plugin.apply(project)

        assertEquals("0.0.0-RC1", project.extensions[GitVersionPlugin.GIT_VERSION])
    }

    @Test
    fun testGitVersion_v0_0_0_RC1() {
        val plugin = GitVersionPlugin()
        val project = FakeProject()
        plugin.git = object : FakeGitFacade() {
            override fun getTag() = "v0.0.0-RC1"
        }
        plugin.apply(project)

        assertEquals("v0.0.0-RC1", project.extensions[GitVersionPlugin.GIT_VERSION])
    }

    @Test
    fun testGitVersion_v0_0_0_RC1_1_SNAPSHOT() {
        val plugin = GitVersionPlugin()
        val project = FakeProject()
        plugin.git = object : FakeGitFacade() {
            override fun getTag() = "v0.0.0-RC1"
            override fun getStatus() = "dirty"
        }
        plugin.apply(project)

        assertEquals("v0.0.0-RC1-1-SNAPSHOT", project.extensions[GitVersionPlugin.GIT_VERSION])
    }

    @Test
    fun testGitVersion_v0_0_0_RC1_1_gs4f2f5w() {
        val plugin = GitVersionPlugin()
        val project = FakeProject()
        plugin.git = object : FakeGitFacade() {
            override fun getTag() = "v0.0.0-RC1-1-gs4f2f5w"
        }
        plugin.apply(project)

        assertEquals("v0.0.0-RC1-1-gs4f2f5w", project.extensions[GitVersionPlugin.GIT_VERSION])
    }

    @Test
    fun testGitVersion_v0_0_0_RC1_2_SNAPSHOT() {
        val plugin = GitVersionPlugin()
        val project = FakeProject()
        plugin.git = object : FakeGitFacade() {
            override fun getTag() = "v0.0.0-RC1-1-gs4f2f5w"
            override fun getStatus() = "dirty"
        }
        plugin.apply(project)

        assertEquals("v0.0.0-RC1-2-SNAPSHOT", project.extensions[GitVersionPlugin.GIT_VERSION])
    }

    @Test
    fun testGitVersion_0_0_0_1_SNAPSHOT() {
        val plugin = GitVersionPlugin()
        val project = FakeProject()
        plugin.git = object : FakeGitFacade() {
            override fun getStatus() = "dirty"
        }
        plugin.apply(project)

        assertEquals("0.0.0-1-SNAPSHOT", project.extensions[GitVersionPlugin.GIT_VERSION])
    }

}