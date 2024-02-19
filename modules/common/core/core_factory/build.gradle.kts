plugins {
    id(libs.plugins.com.android.library.get().pluginId)
    id(libs.plugins.org.jetbrains.kotlin.android.get().pluginId)
    alias(libs.plugins.ksp)
}
apply<ModuleConfigPlugin>()
android {
    namespace = "ru.mvrlrd.core_factory"
}

dependencies {
    implementation(projects.modules.common.core.coreApi)
    implementation(projects.modules.common.core.coreImpl)

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation(libs.room.runtime)
    ksp(libs.room.ksp.compiler)
    annotationProcessor(libs.room.compiler)
    implementation(libs.room.ktx)
    
    ksp(libs.dagger.ksp.compiler)
    implementation(libs.dagger)
}