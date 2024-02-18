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


    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    val dagger_version = "2.48"
    implementation ("com.google.dagger:dagger:$dagger_version")
    ksp ("com.google.dagger:dagger-compiler:$dagger_version") // Dagger compiler

}