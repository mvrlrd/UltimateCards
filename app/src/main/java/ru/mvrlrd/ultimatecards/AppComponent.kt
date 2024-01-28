package ru.mvrlrd.ultimatecards

import android.content.Context
import dagger.BindsInstance
import dagger.Component

@Component
interface AppComponent {

    fun inject(app: App)
    @Component.Factory
    interface Factory{
        fun create(@BindsInstance context: Context): AppComponent
    }

    companion object{
        fun getAppComponent(context: Context): AppComponent{
            return DaggerAppComponent.factory().create(context)
        }
    }
}