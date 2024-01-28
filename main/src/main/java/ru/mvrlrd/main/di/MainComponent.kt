package ru.mvrlrd.main.di

import dagger.Component
import ru.mvrlrd.main.MainActivity

@Component
interface MainComponent {
    fun inject(mainActivity: MainActivity)

    companion object{
        fun getMainComponent():MainComponent{
            return DaggerMainComponent.create()
        }
    }
}