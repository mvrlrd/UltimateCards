plugins {
    id(libs.plugins.com.android.library.get().pluginId)
    id(libs.plugins.org.jetbrains.kotlin.android.get().pluginId)
    alias(libs.plugins.ksp)
    `kotlin-kapt`
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

    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)

    ksp(libs.dagger.ksp.compiler)
    implementation(libs.dagger)

    implementation(libs.androidx.fragment.ktx)
    implementation(libs.jakewharton.kotlinx.serialization.converter)
}