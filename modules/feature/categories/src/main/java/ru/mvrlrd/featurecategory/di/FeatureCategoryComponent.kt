package ru.mvrlrd.featurecategory.di

import android.content.Context
import dagger.Component
import ru.mvrlrd.db.di.DataBaseModule
import ru.mvrlrd.featurecategory.di.data_modules.CategoryDataModule
import ru.mvrlrd.featurecategory.di.domain_modules.CategoryDomainModule
import ru.mvrlrd.featurecategory.presentation.CategoryFragment
import ru.mvrlrd.network.di.NetworkDataModule
import ru.mvrlrd.network.di.NetworkDomainModule
import ru.mvrlrd.network.di.RetrofitModule
import javax.inject.Named

@Component(
    dependencies = [CategoryMediatorDeps::class],
    modules = [CategoryDomainModule::class,
        CategoryDataModule::class,
        RetrofitModule::class,
    NetworkDataModule::class,
    NetworkDomainModule::class,
    DataBaseModule::class] // исправить это
)
interface FeatureCategoryComponent {
    fun inject(categoryFragment: CategoryFragment)

    companion object {
        fun getFeatureCategoryComponent(mediators: CategoryMediatorDeps): FeatureCategoryComponent{
            return DaggerFeatureCategoryComponent.builder().categoryMediatorDeps(mediators).build()
        }
    }
}