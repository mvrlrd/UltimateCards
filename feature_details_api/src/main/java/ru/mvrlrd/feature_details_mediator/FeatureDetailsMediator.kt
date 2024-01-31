package ru.mvrlrd.feature_details_mediator

import androidx.fragment.app.FragmentManager

interface FeatureDetailsMediator {
    fun startFeatureDetails(container: Int, fragmentManager: FragmentManager, catId: Long)
}