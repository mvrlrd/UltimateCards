package ru.mvrlrd.featurecategory.presentation.recycler

import androidx.recyclerview.widget.RecyclerView
import ru.mvrlrd.featurecategory.databinding.ItemCategoryBinding
import ru.mvrlrd.featurecategory.domain.Category

class CategoryViewHolder(private val binding: ItemCategoryBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(category: Category){
        binding.tvCategoryName.text = category.name
    }
}