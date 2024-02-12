package ru.mvrlrd.featurecategory.di.domain_modules

import dagger.Binds
import dagger.Module
import ru.mvrlrd.featurecategory.domain.api.FetchAllCategoriesUseCase
import ru.mvrlrd.featurecategory.domain.api.RemoveCategoryUseCase
import ru.mvrlrd.featurecategory.domain.impl.FetchAllCategoriesUseCaseImpl
import ru.mvrlrd.featurecategory.domain.impl.RemoveCategoryUseCaseImpl

@Module
interface CategoryDomainModule {

    @Binds
    fun bindsFetchAllCategoriesUseCase(fetchAllCategoriesUseCaseImpl: FetchAllCategoriesUseCaseImpl): FetchAllCategoriesUseCase

    @Binds
    fun bindsRemoveCategoryUseCase(removeCategoryUseCaseImpl: RemoveCategoryUseCaseImpl): RemoveCategoryUseCase
}