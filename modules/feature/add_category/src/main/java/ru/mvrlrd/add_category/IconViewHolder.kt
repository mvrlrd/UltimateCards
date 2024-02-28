package ru.mvrlrd.add_category

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import coil.load
import ru.mvrlrd.add_category.databinding.ItemIconBinding

class IconViewHolder(private val binding: ItemIconBinding,
                     private val onItemClicked: (position: Int) -> Unit
) : RecyclerView.ViewHolder(binding.root), View.OnClickListener {
     init {
            binding.iconImageView.setOnClickListener(this)
        }

    override fun onClick(v: View?) {
        val position = adapterPosition
        onItemClicked(position)
    }

    fun bind(item: IconItem){
        binding.iconImageView.load(item.res)
        binding.iconImageView.isSelected = item.isSelected
    }
}