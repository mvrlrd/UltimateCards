package ru.mvrlrd.feature_category_details.presentation.recycler

import androidx.recyclerview.widget.DiffUtil
import ru.mvrlrd.feature_category_details.domain.WordItem
import javax.inject.Inject

class WordItemDiffCallback @Inject constructor(): DiffUtil.ItemCallback<WordItem>() {
    override fun areItemsTheSame(oldItem: WordItem, newItem: WordItem): Boolean =
        oldItem.id == newItem.id


    override fun areContentsTheSame(oldItem: WordItem, newItem: WordItem): Boolean =
        oldItem == newItem
}