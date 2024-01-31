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
include(":app")
include(":main")
include(":utils")
include(":featurecategory")
include(":feature_category_details")
include(":feature_details_api")
