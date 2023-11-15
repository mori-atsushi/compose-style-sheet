pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "compose-style-sheet"
include(":compose-stylesheet")
include(":compose-stylesheet-core")
include(":compose-stylesheet-theme")
include(":component:compose-stylesheet-text")
include(":component:compose-stylesheet-surface")
include(":sample:android")
