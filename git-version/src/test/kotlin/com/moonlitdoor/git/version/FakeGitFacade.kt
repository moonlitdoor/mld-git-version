package com.moonlitdoor.git.version

import java.io.File

open class FakeGitFacade : GitFacade() {
    override fun runCommand(projectDir: File, vararg command: String): String {
        val v = command.joinToString("")
        return when (v) {
            "gitrev-list--countHEAD" -> "20"
            "gittag" -> "0.1.0\n0.0.4\n0.0.3\n0.0.2\n0.0.1\n0.0.0"
            "gitdescribe--tags" -> getTag()
            "gitstatus--porcelain" -> getStatus()
            "gitrev-parse--abbrev-refHEAD" -> "master"
            else -> ""
        }
    }

    open fun getTag(): String = "0.0.0"

    open fun getStatus(): String = ""
}