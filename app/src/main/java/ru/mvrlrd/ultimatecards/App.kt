package ru.mvrlrd.ultimatecards

import android.app.Application
import android.util.Log
import ru.mvrlrd.utils.TAG

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate: ")
    }
}