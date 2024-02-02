package ru.mvrlrd.ultimatecards

import dagger.Binds
import dagger.Module
import ru.mvrlrd.feature_category_details.DetailsMediatorImpl
import ru.mvrlrd.feature_details_mediator.DetailsMediator

@Module
interface MediatorBindings {
    @Binds
    fun bindsDetailsMediator(detailsMediatorImpl: DetailsMediatorImpl): DetailsMediator
}