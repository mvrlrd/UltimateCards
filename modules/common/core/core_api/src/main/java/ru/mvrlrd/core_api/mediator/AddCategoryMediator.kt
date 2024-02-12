package ru.mvrlrd.core_api.mediator

import androidx.annotation.IdRes
import androidx.fragment.app.FragmentManager

interface AddCategoryMediator {
    fun startAddCategoryFragment(@IdRes containerId: Int, fragmentManager: FragmentManager)
}