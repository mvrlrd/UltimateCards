plugins {
    id(libs.plugins.com.android.library.get().pluginId)
    id(libs.plugins.org.jetbrains.kotlin.android.get().pluginId)
    alias(libs.plugins.ksp)
    id("kotlin-kapt")
    alias(libs.plugins.androidx.navigation.safeargs)
}
apply<ModuleConfigPlugin>()
android {
    namespace = "ru.mvrlrd.featurecategory"
}

dependencies {
    implementation(projects.modules.common.core.coreApi)
    implementation(projects.modules.network)
    implementation(projects.modules.common.detailsApi)

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation("androidx.navigation:navigation-fragment-ktx:2.7.7")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.7")

    ksp(libs.dagger.ksp.compiler)
    implementation(libs.dagger)

    val fragment_version = "1.6.2"
    // Kotlin
    implementation("androidx.fragment:fragment-ktx:$fragment_version")
    implementation("com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:1.0.0")




}