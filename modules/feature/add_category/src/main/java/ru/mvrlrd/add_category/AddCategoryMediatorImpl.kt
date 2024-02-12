package ru.mvrlrd.add_category

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import ru.mvrlrd.core_api.mediator.AddCategoryMediator
import javax.inject.Inject

class AddCategoryMediatorImpl@Inject constructor(): AddCategoryMediator {
    override fun startAddCategoryFragment(containerId: Int, fragmentManager: FragmentManager) {
        fragmentManager.commit {
            replace(containerId, AddCategoryFragment.newInstance())
            addToBackStack(null)
        }
    }
}