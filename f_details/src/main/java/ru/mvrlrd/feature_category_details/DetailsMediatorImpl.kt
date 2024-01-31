package ru.mvrlrd.feature_category_details

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import ru.mvrlrd.feature_category_details.presentation.DetailsFragment
import ru.mvrlrd.feature_details_mediator.DetailsMediator
import javax.inject.Inject

class DetailsMediatorImpl@Inject constructor() : DetailsMediator{
    override fun startDetailsFragment(container: Int, fragmentManager: FragmentManager, catId: Long) {
        fragmentManager.commit {
            replace(container, DetailsFragment.newInstance(catId))
            setReorderingAllowed(true)
            addToBackStack(null)
        }
    }
}