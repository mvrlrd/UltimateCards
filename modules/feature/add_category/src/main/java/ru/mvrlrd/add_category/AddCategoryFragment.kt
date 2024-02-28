package ru.mvrlrd.add_category

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import ru.mvrlrd.add_category.databinding.FragmentAddCategoryBinding

class AddCategoryFragment : Fragment() {
    private val iconAdapter = IconAdapter{pos->
        onListItemClick(pos)
    }

    private var _binding: FragmentAddCategoryBinding? = null
    private val binding: FragmentAddCategoryBinding get() = _binding?:throw RuntimeException("FragmentAddCategoryBinding is null")

    private fun onListItemClick(position: Int) {
        val newList = getIcons() as MutableList
        newList[position] = newList[position].copy(isSelected = true)
        iconAdapter.items = newList
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddCategoryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvIcons.apply {
            adapter = iconAdapter
            layoutManager = GridLayoutManager(requireContext(), 3, GridLayoutManager.VERTICAL, false)
        }
        iconAdapter.items = getIcons()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

   private fun getIcons(): List<IconItem> {
        return listOf(
            IconItem(R.drawable.icon_01, false),
            IconItem(R.drawable.icon_02, false),
            IconItem(R.drawable.icon_03, false),
            IconItem(R.drawable.icon_04, false),
            IconItem(R.drawable.icon_05, false),

            IconItem(R.drawable.icon_06, false),
            IconItem(R.drawable.icon_07, false),
            IconItem(R.drawable.icon_08, false),
            IconItem(R.drawable.icon_09, false),
            IconItem(R.drawable.icon_10, false),

            IconItem(R.drawable.icon_11, false),
            IconItem(R.drawable.icon_12, false),
            IconItem(R.drawable.icon_13, false),
            IconItem(R.drawable.icon_14, false),
            IconItem(R.drawable.icon_15, false),

            IconItem(R.drawable.icon_16, false),
            IconItem(R.drawable.icon_17, false),
            IconItem(R.drawable.icon_18, false),
            IconItem(R.drawable.icon_19, false),
            IconItem(R.drawable.icon_20, false),

            IconItem(R.drawable.icon_21, false),
            IconItem(R.drawable.icon_22, false),
            IconItem(R.drawable.icon_23, false),
            IconItem(R.drawable.icon_24, false),
            IconItem(R.drawable.icon_25, false),

            IconItem(R.drawable.icon_26, false),
            IconItem(R.drawable.icon_27, false),
            IconItem(R.drawable.icon_28, false),

        )
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            AddCategoryFragment().apply {

            }
    }
}