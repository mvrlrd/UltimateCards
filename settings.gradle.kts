pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "UltimateCards"
include(":modules:app")
include(":modules:main")
include(":modules:common:utils")
include(":modules:feature:categories")
include(":modules:feature:details")
include(":modules:common:details_api")
include(":modules:network")
include(":modules:common:core:core_impl")
include(":modules:common:core:core_factory")
include(":modules:common:core:core_api")
include(":modules:feature:add_category")
