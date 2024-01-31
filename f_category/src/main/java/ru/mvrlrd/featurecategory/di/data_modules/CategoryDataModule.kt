package ru.mvrlrd.featurecategory.di.data_modules

import dagger.Binds
import dagger.Module
import ru.mvrlrd.featurecategory.data.CategoryRepositoryImpl
import ru.mvrlrd.featurecategory.data.LocalDataSource
import ru.mvrlrd.featurecategory.data.MockDataSource
import ru.mvrlrd.featurecategory.domain.CategoryRepository

@Module
interface CategoryDataModule {
    @Binds
    fun bindsLocalDataSource(mockDataSource: MockDataSource): LocalDataSource

    @Binds
    fun bindsCategoryRepository(categoryRepositoryImpl: CategoryRepositoryImpl): CategoryRepository
}