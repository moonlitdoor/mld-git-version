package com.moonlitdoor.git.version

import com.moonlitdoor.git.version.extensions.BranchOffsetNestedExtension
import com.moonlitdoor.git.version.extensions.MoonlitDoorExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

@Suppress("Unused")
class GitVersionConfigPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.extensions.create(MoonlitDoorExtension.EXTENSION_NAME, MoonlitDoorExtension::class.java).offsets = project.container(BranchOffsetNestedExtension::class.java)
    }

}
