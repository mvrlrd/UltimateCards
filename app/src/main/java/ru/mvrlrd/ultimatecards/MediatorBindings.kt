package ru.mvrlrd.ultimatecards

import dagger.Binds
import dagger.Module
import ru.mvrlrd.feature_category_details.FeatureDetailsMediatorImpl
import ru.mvrlrd.feature_details_mediator.FeatureDetailsMediator

@Module
interface MediatorBindings {
    @Binds
    fun bindsDetailsMediator(detailsMediatorImpl: FeatureDetailsMediatorImpl): FeatureDetailsMediator
}