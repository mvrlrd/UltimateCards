package ru.mvrlrd.feature_category_details.presentation.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import ru.mvrlrd.feature_category_details.databinding.ItemWordBinding
import ru.mvrlrd.feature_category_details.domain.WordItem
import javax.inject.Inject

class WordAdapter@Inject constructor(): ListAdapter<WordItem, WordViewHolder>(WordItemDiffCallback()) {
    var onItemClickCallback: ((Long)->Unit)? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return WordViewHolder(ItemWordBinding.inflate(inflater, parent, false), onItemClickCallback)
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}