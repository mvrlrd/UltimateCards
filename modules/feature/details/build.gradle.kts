plugins {
    id(libs.plugins.com.android.library.get().pluginId)
    id(libs.plugins.org.jetbrains.kotlin.android.get().pluginId)
    alias(libs.plugins.ksp)
    alias(libs.plugins.androidx.navigation.safeargs)
    `kotlin-kapt`
}
apply<ModuleConfigPlugin>()
android {
    namespace = "ru.mvrlrd.feature_category_details"
}

dependencies {
    implementation(projects.modules.common.detailsApi)

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation(libs.androidx.fragment.ktx)

    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)

    ksp(libs.dagger.ksp.compiler)
    implementation(libs.dagger)
}