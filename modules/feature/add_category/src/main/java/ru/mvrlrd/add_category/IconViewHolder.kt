package ru.mvrlrd.add_category

import androidx.recyclerview.widget.RecyclerView
import coil.load
import ru.mvrlrd.add_category.databinding.ItemIconBinding

class IconViewHolder(private val binding: ItemIconBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Int){
        binding.iconImageView.load(item)
    }
}