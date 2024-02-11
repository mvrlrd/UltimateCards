package ru.mvrlrd.featurecategory.presentation.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import ru.mvrlrd.core.Category
import ru.mvrlrd.featurecategory.databinding.ItemCategoryBinding
import javax.inject.Inject

class CategoryAdapter@Inject constructor(): ListAdapter<Category, CategoryViewHolder>(CategoryItemDiffCallBack()) {
    var onItemClickCallback: ((Long)->Unit)? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return CategoryViewHolder(ItemCategoryBinding.inflate(inflater, parent, false), onItemClickCallback)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}