package ru.mvrlrd.core_impl

import dagger.Component
import ru.mvrlrd.core_api.database.CategoryDao
import ru.mvrlrd.core_api.database.DatabaseProvider
import ru.mvrlrd.core_api.mediator.AppProvider
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [AppProvider::class],
    modules = [DataBaseModule::class]
)
interface DataBaseComponent : DatabaseProvider