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

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation(libs.androidx.fragment.ktx)
    implementation(libs.de.hdodenhof.circleimageview)
    implementation(libs.coil)

    ksp(libs.dagger.ksp.compiler)
    implementation(libs.dagger)
}