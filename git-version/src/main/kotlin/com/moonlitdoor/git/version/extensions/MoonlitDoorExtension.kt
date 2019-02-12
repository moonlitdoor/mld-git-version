package com.moonlitdoor.git.version.extensions

import groovy.lang.Closure
import org.gradle.api.NamedDomainObjectContainer

open class MoonlitDoorExtension {

    companion object {
        const val EXTENSION_NAME = "mld"
    }

    lateinit var offsets: NamedDomainObjectContainer<BranchOffsetNestedExtension>

    @Suppress("unused")
    fun offsets(action: Closure<BranchOffsetNestedExtension>) {
        offsets.configure(action)
    }

}