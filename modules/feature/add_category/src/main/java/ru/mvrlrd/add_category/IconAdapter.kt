package ru.mvrlrd.add_category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.mvrlrd.add_category.databinding.ItemIconBinding
import kotlin.properties.Delegates

class IconAdapter(
    private val onClickCallback: ((Int) -> Unit)
) : RecyclerView.Adapter<IconViewHolder>() {
    var items: List<IconItem> by Delegates.observable(emptyList()) { prop, old, new ->
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IconViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return IconViewHolder(
            ItemIconBinding.inflate(inflater, parent, false), onClickCallback
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