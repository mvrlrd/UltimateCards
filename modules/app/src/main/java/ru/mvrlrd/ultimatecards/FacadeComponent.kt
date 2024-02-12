package ru.mvrlrd.ultimatecards

import android.app.Application
import dagger.Component
import ru.mvrlrd.core_api.database.DatabaseProvider
import ru.mvrlrd.core_api.mediator.AppProvider
import ru.mvrlrd.core_api.mediator.ProvidersFacade
import ru.mvrlrd.core_factory.CoreProvidersFactory

@Component(
    dependencies = [AppProvider::class, DatabaseProvider::class],
    modules = [MediatorBindings::class]
)
interface FacadeComponent: ProvidersFacade {

    companion object{
        fun init(application: Application): FacadeComponent =
            DaggerFacadeComponent.builder()
                .appProvider(AppComponent.getAppComponent(application))
                .databaseProvider(CoreProvidersFactory.createDatabaseBuilder(AppComponent.getAppComponent(application)))
                .build()
    }

}