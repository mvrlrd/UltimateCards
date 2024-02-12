package ru.mvrlrd.featurecategory.di

import android.content.Context
import ru.mvrlrd.feature_details_mediator.DetailsMediator

interface CategoryMediatorDeps {
    fun getFeatureDetailsMediator(): DetailsMediator
    fun provideContext(): Context
}