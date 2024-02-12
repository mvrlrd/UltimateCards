package ru.mvrlrd.ultimatecards

import dagger.Binds
import dagger.Module
import ru.mvrlrd.add_category.AddCategoryMediatorImpl
import ru.mvrlrd.core_api.mediator.AddCategoryMediator

@Module
interface MediatorBindings {
//    @Binds
//    fun bindsDetailsMediator(detailsMediatorImpl: DetailsMediatorImpl): DetailsMediator

    @Binds
    fun bindsAddCategoryMediator(addCategoryMediatorImpl: AddCategoryMediatorImpl): AddCategoryMediator

}