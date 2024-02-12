package ru.mvrlrd.featurecategory.presentation.recycler

import androidx.recyclerview.widget.DiffUtil
import ru.mvrlrd.core_api.dto.Category
import javax.inject.Inject

class CategoryItemDiffCallBack @Inject constructor(): DiffUtil.ItemCallback<Category>() {
    override fun areItemsTheSame(oldItem: Category, newItem: Category): Boolean =
        oldItem.id == newItem.id


    override fun areContentsTheSame(oldItem: Category, newItem: Category): Boolean =
        oldItem == newItem
}