package ru.mvrlrd.featurecategory.di

import dagger.Component
import ru.mvrlrd.featurecategory.di.data_modules.CategoryDataModule
import ru.mvrlrd.featurecategory.di.domain_modules.CategoryDomainModule
import ru.mvrlrd.featurecategory.presentation.CategoryFragment

@Component(
    dependencies = [CategoryMediatorDeps::class],
    modules = [CategoryDomainModule::class,
        CategoryDataModule::class]
)
interface FeatureCategoryComponent {
    fun inject(categoryFragment: CategoryFragment)

    companion object {
        fun getFeatureCategoryComponent(mediators: CategoryMediatorDeps): FeatureCategoryComponent{
            return DaggerFeatureCategoryComponent.builder().categoryMediatorDeps(mediators).build()
        }
    }
}