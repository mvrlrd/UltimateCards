package ru.mvrlrd.feature_category_details.di

import dagger.Component
import ru.mvrlrd.feature_category_details.presentation.DetailsFragment

@Component
interface DetailsComponent {

    fun inject(detailsFragment: DetailsFragment)

    companion object{
        fun getDetailsComponent(): DetailsComponent{
            return DaggerDetailsComponent.create()
        }
    }
}