import java.io.ByteArrayOutputStream

allprojects {
    group = "com.moonlitdoor.git-version"
    version = getGitVersionName()

    repositories {
        jcenter()
    }

}

fun getGitVersionName(): String {
    val stdout = ByteArrayOutputStream()
    exec {
        commandLine = listOf("git", "describe", "--tags")
        standardOutput = stdout
    }
    return getGitStatus(stdout.toString().trim())
}

fun getGitStatus(version: String): String {
    val stdout = ByteArrayOutputStream()
    exec {
        commandLine = listOf("git", "status", "--porcelain")
        standardOutput = stdout
    }

    return if (stdout.toString().trim().isNotEmpty()) {
        if (version.contains("-g")) {
            val withOutHash = version.subSequence(0, version.indexOf("-g"))
            val withOutCommitCount = withOutHash.substring(0, withOutHash.lastIndexOf("-") + 1)
            val commitCount = withOutHash.substring(withOutHash.lastIndexOf("-") + 1)
            "$withOutCommitCount${commitCount.toInt().inc()}-SNAPSHOT"
        } else "$version-1-SNAPSHOT"
    } else {
        version
    }
}
