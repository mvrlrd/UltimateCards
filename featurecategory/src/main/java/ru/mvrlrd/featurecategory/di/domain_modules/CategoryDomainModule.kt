package ru.mvrlrd.featurecategory.di.domain_modules

import dagger.Binds
import dagger.Module
import ru.mvrlrd.featurecategory.domain.api.AddCategoryUseCase
import ru.mvrlrd.featurecategory.domain.api.FetchAllCategoriesUseCase
import ru.mvrlrd.featurecategory.domain.api.FetchCategoryUseCase
import ru.mvrlrd.featurecategory.domain.api.RemoveCategoryUseCase
import ru.mvrlrd.featurecategory.domain.impl.AddCategoryUseCaseImpl
import ru.mvrlrd.featurecategory.domain.impl.FetchAllCategoriesUseCaseImpl
import ru.mvrlrd.featurecategory.domain.impl.FetchCategoryUseCaseImpl
import ru.mvrlrd.featurecategory.domain.impl.RemoveCategoryUseCaseImpl

@Module
interface CategoryDomainModule {
    @Binds
    fun bindsAddCategoryUseCase(addCategoryUseCaseImpl: AddCategoryUseCaseImpl): AddCategoryUseCase
    @Binds
    fun bindsFetchAllCategoriesUseCase(fetchAllCategoriesUseCaseImpl: FetchAllCategoriesUseCaseImpl): FetchAllCategoriesUseCase
    @Binds
    fun bindsFetchCategoryUseCase(fetchCategoryUseCaseImpl: FetchCategoryUseCaseImpl): FetchCategoryUseCase
    @Binds
    fun bindsRemoveCategoryUseCase(removeCategoryUseCaseImpl: RemoveCategoryUseCaseImpl): RemoveCategoryUseCase
}