package ru.mvrlrd.ultimatecards

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.mvrlrd.featurecategory.di.CategoryMediatorDeps

@Component(modules = [MediatorBindings::class])
interface AppComponent: CategoryMediatorDeps {

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