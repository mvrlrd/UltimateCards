package ru.mvrlrd.featurecategory.presentation.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import ru.mvrlrd.featurecategory.databinding.ItemCategoryBinding
import ru.mvrlrd.featurecategory.domain.Category
import javax.inject.Inject

class CategoryAdapter@Inject constructor(): ListAdapter<Category, CategoryViewHolder>(CategoryItemDiffCallBack()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return CategoryViewHolder(ItemCategoryBinding.inflate(inflater, parent, false))
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}