plugins {
    id(libs.plugins.com.android.library.get().pluginId)
    id(libs.plugins.org.jetbrains.kotlin.android.get().pluginId)
    alias(libs.plugins.ksp)
}
apply<ModuleConfigPlugin>()
android {
    namespace = "ru.mvrlrd.add_category"
}

dependencies {
    implementation(projects.modules.common.core.coreApi)

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    val fragment_version = "1.6.2"
    // Kotlin
    implementation("androidx.fragment:fragment-ktx:$fragment_version")

    ksp(libs.dagger.ksp.compiler)
    implementation(libs.dagger)
}