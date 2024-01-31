package ru.mvrlrd.feature_category_details

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import ru.mvrlrd.feature_details_mediator.FeatureDetailsMediator
import javax.inject.Inject

class FeatureDetailsMediatorImpl@Inject constructor() : FeatureDetailsMediator{
    override fun startFeatureDetails(container: Int, fragmentManager: FragmentManager, catId: Long) {
        fragmentManager.commit {
            replace( container,DetailsFragment.newInstance(catId.toString()))
            setReorderingAllowed(true)
        }
    }
}