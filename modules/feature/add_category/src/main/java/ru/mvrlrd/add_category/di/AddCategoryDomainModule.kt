package ru.mvrlrd.add_category.di

import dagger.Binds
import dagger.Module
import ru.mvrlrd.add_category.domain.AddCategoryUseCaseImpl
import ru.mvrlrd.add_category.domain.api.AddCategoryUseCase

@Module
interface AddCategoryDomainModule {
    @Binds
    fun bindsAddCategoryUseCase(addCategoryUseCaseImpl: AddCategoryUseCaseImpl): AddCategoryUseCase
}