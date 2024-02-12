package ru.mvrlrd.core_factory

import ru.mvrlrd.core_api.database.DatabaseProvider
import ru.mvrlrd.core_api.mediator.AppProvider
import ru.mvrlrd.core_impl.DaggerDataBaseComponent

object CoreProvidersFactory {
    fun createDatabaseBuilder(appProvider: AppProvider): DatabaseProvider{
        return DaggerDataBaseComponent.builder().appProvider(appProvider).build()
    }
}