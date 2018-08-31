package com.moonlitdoor.git.version

import java.io.File
import java.util.concurrent.TimeUnit

open class GitFacade {

    open fun runCommand(projectDir: File, vararg command: String): String {
        val process = ProcessBuilder(*command)
                .directory(projectDir)
                .redirectOutput(ProcessBuilder.Redirect.PIPE)
                .redirectError(ProcessBuilder.Redirect.PIPE)
                .start()
        process.waitFor(60, TimeUnit.SECONDS)
        return process.inputStream.bufferedReader().readText().trim()
    }
}