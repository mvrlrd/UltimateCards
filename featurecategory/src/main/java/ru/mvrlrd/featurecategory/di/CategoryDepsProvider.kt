package ru.mvrlrd.featurecategory.di

import kotlin.properties.Delegates

interface CategoryDepsProvider {
    val deps: MediatorDeps
    companion object: CategoryDepsProvider by MediatorStore
}

object MediatorStore: CategoryDepsProvider{
    override var deps: MediatorDeps by Delegates.notNull()
}