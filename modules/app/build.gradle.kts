plugins {
    `kotlin-android`
    id(libs.plugins.com.android.application.get().pluginId)
    alias(libs.plugins.ksp)
}

android {
    namespace = "ru.mvrlrd.ultimatecards"
    compileSdk = ProjectConfig.compileSdk

    defaultConfig {
        applicationId = ProjectConfig.appId
        minSdk = ProjectConfig.minSdk
        targetSdk = ProjectConfig.targetSdk
        versionCode = ProjectConfig.versionCode
        versionName = ProjectConfig.versionName

        testInstrumentationRunner = ProjectConfig.testInstrumentationRunner

        ksp { arg("room.schemaLocation", "$projectDir/schemas") }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile(ProjectConfig.defaultProguardFile),
                ProjectConfig.proguardRulesPro
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation(projects.modules.main)
    implementation(projects.modules.common.utils)
    implementation(projects.modules.common.detailsApi)
    implementation(projects.modules.feature.categories)
    implementation(projects.modules.feature.details)
    implementation(projects.modules.feature.addCategory)
    implementation(projects.modules.network)
    implementation(projects.modules.common.core.coreFactory)
    implementation(projects.modules.common.core.coreApi)

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)

    ksp(libs.dagger.ksp.compiler)
    implementation(libs.dagger)
}