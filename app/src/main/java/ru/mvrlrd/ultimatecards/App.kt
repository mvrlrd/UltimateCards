package ru.mvrlrd.ultimatecards

import android.app.Application
import android.util.Log
import ru.mvrlrd.utils.TAG

class App: Application() {
    val appComponent: AppComponent by lazy {
        AppComponent.getAppComponent(this)
    }

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)
        Log.d(TAG, "onCreate: $appComponent")
    }
}