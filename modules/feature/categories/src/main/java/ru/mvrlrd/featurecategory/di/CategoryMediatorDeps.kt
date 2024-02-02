package ru.mvrlrd.featurecategory.di

import ru.mvrlrd.feature_details_mediator.DetailsMediator

interface CategoryMediatorDeps {
    fun getFeatureDetailsMediator(): DetailsMediator
}