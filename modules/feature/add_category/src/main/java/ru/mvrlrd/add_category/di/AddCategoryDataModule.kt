package ru.mvrlrd.add_category.di

import dagger.Binds
import dagger.Module
import ru.mvrlrd.add_category.data.AddCategoryRepositoryImpl
import ru.mvrlrd.add_category.data.CategoriesDb
import ru.mvrlrd.add_category.data.LocalDataSource
import ru.mvrlrd.add_category.domain.AddCategoryRepository

@Module
interface AddCategoryDataModule {
    @Binds
    fun bindsLocalDataSource(categoriesDb: CategoriesDb): LocalDataSource
    @Binds
    fun binds(addCategoryRepositoryImpl: AddCategoryRepositoryImpl):AddCategoryRepository
}