package ru.mvrlrd.add_category

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import ru.mvrlrd.add_category.databinding.FragmentAddCategoryBinding

class AddCategoryFragment : Fragment() {
    private val iconAdapter = IconAdapter{pos->
        onListItemClick(pos)
    }

    private var _binding: FragmentAddCategoryBinding? = null
    private val binding: FragmentAddCategoryBinding get() = _binding?:throw RuntimeException("FragmentAddCategoryBinding is null")

    private fun onListItemClick(position: Int) {
        Toast.makeText(requireContext(), getIcons()[position].res, Toast.LENGTH_SHORT).show()
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
            IconItem(R.drawable.abstract_shape_04, false),
            IconItem(R.drawable.abstract_shape_05, false),
            IconItem(R.drawable.abstract_shape_10, false),
            IconItem(R.drawable.abstract_shape_11, false),
            IconItem(R.drawable.abstract_shape_13, false),
        )
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            AddCategoryFragment().apply {

            }
    }
}