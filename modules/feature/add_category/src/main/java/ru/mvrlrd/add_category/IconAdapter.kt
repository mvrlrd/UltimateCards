package ru.mvrlrd.add_category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.mvrlrd.add_category.databinding.ItemIconBinding

class IconAdapter : RecyclerView.Adapter<IconViewHolder>() {
    private val items = listOf(
        R.drawable.abstract_shape_04,
        R.drawable.abstract_shape_05,
        R.drawable.abstract_shape_10,
        R.drawable.abstract_shape_11,
        R.drawable.abstract_shape_13
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IconViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return IconViewHolder(
            ItemIconBinding.inflate(inflater, parent, false)
        )
    }

    override fun onBindViewHolder(holder: IconViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}