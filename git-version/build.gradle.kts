import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    `maven-publish`
}

gradlePlugin {
    (plugins) {
        "git-version" {
            id = "git-version"
            implementationClass = "com.moonlitdoor.git.version.GitVersionPlugin"
        }
    }
}

publishing {
    repositories {
        //        maven(url = "build/repository")
    }
}