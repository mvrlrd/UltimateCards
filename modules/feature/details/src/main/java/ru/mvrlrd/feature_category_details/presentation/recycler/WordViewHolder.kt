package ru.mvrlrd.feature_category_details.presentation.recycler

import androidx.recyclerview.widget.RecyclerView
import ru.mvrlrd.feature_category_details.databinding.ItemWordBinding
import ru.mvrlrd.feature_category_details.domain.WordItem

class WordViewHolder(
    private val binding: ItemWordBinding,
    private val onItemClickCallback: ((Long) -> Unit)?
) : RecyclerView.ViewHolder(binding.root) {
    private var itemId: Long = -1

    init {
        binding.root.setOnClickListener {
            onItemClickCallback?.invoke(itemId)
        }
    }

    fun bind(wordItem: WordItem) {
        itemId = wordItem.id
        binding.tvWord.text = wordItem.text
    }
}
