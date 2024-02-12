package ru.mvrlrd.ultimatecards

import android.app.Application
import android.util.Log
import ru.mvrlrd.core_api.mediator.AppProvider
import ru.mvrlrd.core_api.mediator.AppWithFacade
import ru.mvrlrd.core_api.mediator.ProvidersFacade
import ru.mvrlrd.utils.TAG

class App: Application(), AppWithFacade {
    val appComponent: AppProvider by lazy {
        AppComponent.getAppComponent(this)
    }

    override fun getFacade(): ProvidersFacade {
        return facadeComponent ?: FacadeComponent.init(this).also {
            facadeComponent = it
        }
    }

    override fun onCreate() {
        super.onCreate()
//        appComponent.inject(this)
//        CategoryMediatorStore.deps = appComponent
//
        Log.d(TAG, "onCreate: $appComponent")
    }
    companion object{
        private var facadeComponent: FacadeComponent? = null
    }
}