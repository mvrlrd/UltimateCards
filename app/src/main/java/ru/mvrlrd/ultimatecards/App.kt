package ru.mvrlrd.ultimatecards

import android.app.Application
import android.util.Log
import ru.mvrlrd.featurecategory.di.MediatorStore
import ru.mvrlrd.utils.TAG

class App: Application() {
    val appComponent: AppComponent by lazy {
        AppComponent.getAppComponent(this)
    }

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)
        MediatorStore.deps = appComponent

        Log.d(TAG, "onCreate: $appComponent")
    }
}