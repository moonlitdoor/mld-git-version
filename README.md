# mld-git-version

A Gradle plugin that sets various properties available for use as the version based on the git repository. 


[![Travis (.com) branch](https://img.shields.io/travis/com/moonlitdoor/mld-git-version/master.svg?style=for-the-badge)](https://travis-ci.com/moonlitdoor/mld-git-version)
[![Version](https://img.shields.io/github/release/moonlitdoor/mld-git-version.svg?style=for-the-badge)](https://github.com/moonlitdoor/mld-git-version/releases)
[![GitHub](https://img.shields.io/github/license/mashape/apistatus.svg?style=for-the-badge)](https://opensource.org/licenses/MIT)


[Published to Gradle Plugins](https://plugins.gradle.org/plugin/com.moonlitdoor.git-version)

## Description

After applying the plugin, it will expose 5 properties based on the git repository:
* `gitVersion` The current version based on the most recent tag on the current git branch. Examples:
  * `HEAD` is tagged as `v1.0.0` and the `git status` is clean, the value would be `v1.0.0`.
  * `HEAD` is tagged as `v1.0.0` and the `git status` is not clean, the value would be `v1.0.0-1-SNAPSHOT`.
  * `HEAD^` is tagged as `v1.0.0`, the `git status` is clean, and commit hash of `HEAD` is `1a4440f73d7c91b53dacc072e1eab03516477c94` the value would be `v1.0.0-1-g1a4440f7`.
  * `HEAD^` is tagged as `v1.0.0`, the `git status` is not clean, and commit hash of `HEAD` is `1a4440f73d7c91b53dacc072e1eab03516477c94` the value would be `v1.0.0-2-SNAPSHOT`.
* `gitCommitCount` The number of commits on the current git branch.
* `gitTagCount` The number of tags on the current git branch.
* `gitCommitAndTagCount` The number of commits and tags on the current git branch.
* `gitBranchName` The current git branch.

## Usage

#### [Groovy](./build.groovy.gradle) 

```groovy
plugins {
    id "com.moonlitdoor.git-version" version "0.0.7"
}

task demo {
    doLast {
        println "gitVersion='$gitVersion'"
        println "gitCommitCount='$gitCommitCount'"
        println "gitTagCount='$gitTagCount'"
        println "gitCommitAndTagCount='$gitCommitAndTagCount'"
        println "gitBranchName='$gitBranchName'"
    }
}
```

```
$ gradlew -b build.groovy.gradle demo

> Task :demo
gitVersion='0.0.5-5-SNAPSHOT'
gitCommitCount='17'
gitTagCount='5'
gitCommitAndTagCount='22'
gitBranchName='master-1-SNAPSHOT'

BUILD SUCCESSFUL in 0s
1 actionable task: 1 executed
```

#### [Kotlin](./build.kotlin.gradle.kts)

```kotlin
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
```

```
$ gradlew -b build.kotlin.gradle.kts demo

> Task :demo
gitVersion='0.0.5-5-SNAPSHOT'
gitCommitCount='17'
gitTagCount='5'
gitCommitAndTagCount='22'
gitBranchName='master-1-SNAPSHOT'

BUILD SUCCESSFUL in 0s
1 actionable task: 1 executed

```

#### [Master Builds](https://jitpack.io/private#moonlitdoor/mld-git-version/master-SNAPSHOT)

```groovy
	allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
```

```groovy
	dependencies {
    	        implementation 'com.github.moonlitdoor:mld-git-version:master-SNAPSHOT'
    	}
```
 
## Issue Tracking
Want to file a bug? Want to suggest an idea? Add an [issue](https://github.com/moonlitdoor/mld-git-version/issues).

## License
All Moonlit Door Software is licensed under the [MIT License](./LICENSE).

## Contributing
Please see [CONTRIBUTING.md](./CONTRIBUTING.md) for details of how to build and contribute to the project.