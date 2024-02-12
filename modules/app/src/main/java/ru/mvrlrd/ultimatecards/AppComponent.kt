package ru.mvrlrd.ultimatecards


import android.app.Application
import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.mvrlrd.core_api.mediator.AppProvider
import javax.inject.Singleton

@Singleton
@Component
interface AppComponent: AppProvider {


    @Component.Factory
    interface Factory{
        fun create(@BindsInstance context: Context): AppProvider

    }

    companion object {
        private var appComponent: AppProvider? = null
        fun getAppComponent(application: Application): AppProvider {
            return appComponent ?: DaggerAppComponent
                .factory().create(application)
        }
    }

}