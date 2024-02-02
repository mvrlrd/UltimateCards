package ru.mvrlrd.featurecategory.di

import kotlin.properties.Delegates

interface CategoryDepsProvider {
    val deps: CategoryMediatorDeps
    companion object: CategoryDepsProvider by CategoryMediatorStore
}

object CategoryMediatorStore: CategoryDepsProvider{
    override var deps: CategoryMediatorDeps by Delegates.notNull()
}