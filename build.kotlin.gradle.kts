plugins {
    id("com.moonlitdoor.git-version") version "0.0.7"
}

tasks.register("demo") {
    doLast {
        println("gitVersion='$gitVersion'")
        println("gitCommitCount='$gitCommitCount'")
        println("gitTagCount='$gitTagCount'")
        println("gitCommitAndTagCount='$gitCommitAndTagCount'")
        println("gitBranchName='$gitBranchName'")
    }
}
