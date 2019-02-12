import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    `maven-publish`
    id("com.gradle.plugin-publish") version "0.10.0"
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}

dependencies {
    testImplementation("junit:junit:4.12")
}

gradlePlugin {
    plugins {
        register("git-version") {
            id = "com.moonlitdoor.git-version"
            implementationClass = "com.moonlitdoor.git.version.GitVersionPlugin"
        }
        register("git-version-config") {
            id = "com.moonlitdoor.git-version-config"
            implementationClass = "com.moonlitdoor.git.version.GitVersionConfigPlugin"
        }
    }
}

pluginBundle {
    website = "https://github.com/moonlitdoor/mld-git-version"
    vcsUrl = "https://github.com/moonlitdoor/mld-git-version"
    description = "A Gradle plugin that sets various properties available for use as the version based on the git repository."
    (plugins) {
        "git-version" {
            displayName = "Git Version Plugin"
            tags = listOf("git", "version", "android", "java")
        }
        "git-version-config" {
            displayName = "Git Version Plugin Configuration"
            tags = listOf("git", "version", "android", "java")
        }
    }
}