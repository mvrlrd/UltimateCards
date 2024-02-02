package ru.mvrlrd.feature_details_mediator

import androidx.fragment.app.FragmentManager

interface DetailsMediator {
    fun startDetailsFragment(container: Int, fragmentManager: FragmentManager, catId: Long)
}