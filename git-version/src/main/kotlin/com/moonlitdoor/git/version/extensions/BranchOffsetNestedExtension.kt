package com.moonlitdoor.git.version.extensions

import org.gradle.internal.impldep.com.google.common.annotations.VisibleForTesting

open class BranchOffsetNestedExtension(var name: String) {

    @VisibleForTesting
    constructor(name: String, offset: Int) : this(name) {
        this.offset = offset
    }

    var offset = 0

}