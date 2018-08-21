import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    `maven-publish`
    id("com.gradle.plugin-publish") version "0.10.0"
}

gradlePlugin {
    (plugins) {
        "git-version" {
            id = "com.moonlitdoor.git-version"
            implementationClass = "com.moonlitdoor.git.version.GitVersionPlugin"
        }
    }
}

pluginBundle {
    website = "https://www.moonlitdoor.com"
    vcsUrl = "https://github.com/moonlitdoor/mld-git-version"
    description = "A Gradle plugin that sets various properties available for use as the version based on the git repository."
    (plugins) {
        "git-version" {
            displayName = "Git Version Plugin"
            tags = listOf("git", "version", "android", "java")
        }
    }
}