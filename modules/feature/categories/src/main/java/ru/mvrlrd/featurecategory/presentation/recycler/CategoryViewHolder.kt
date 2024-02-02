package ru.mvrlrd.featurecategory.presentation.recycler

import androidx.recyclerview.widget.RecyclerView
import ru.mvrlrd.featurecategory.databinding.ItemCategoryBinding
import ru.mvrlrd.featurecategory.domain.Category

class CategoryViewHolder(
    private val binding: ItemCategoryBinding,
    private val onItemClickCallback: ((Long) -> Unit)?
) : RecyclerView.ViewHolder(binding.root) {
    private var itemId : Long = -1L
    init {
        binding.root.setOnClickListener {
            onItemClickCallback?.invoke(itemId)
        }
    }
    fun bind(category: Category) {
        itemId = category.id
        binding.tvCategoryName.text = category.name
    }
}