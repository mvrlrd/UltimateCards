package ru.mvrlrd.featurecategory.di

import ru.mvrlrd.feature_details_mediator.FeatureDetailsMediator

interface MediatorDeps {
    fun getFeatureDetailsMediator(): FeatureDetailsMediator
}