package ru.mvrlrd.ultimatecards

import android.app.Application
import android.util.Log

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        Log.i("App","onCreate()")
    }
}