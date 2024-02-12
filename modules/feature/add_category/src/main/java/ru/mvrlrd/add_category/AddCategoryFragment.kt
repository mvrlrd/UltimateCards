package ru.mvrlrd.add_category

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.mvrlrd.add_category.databinding.FragmentAddCategoryBinding

private const val CATEGORY_ID = "categoryId"

class AddCategoryFragment : Fragment() {
    private var categoryId: Long? = null
    private var _binding: FragmentAddCategoryBinding? = null
    private val binding: FragmentAddCategoryBinding get() = _binding?:throw RuntimeException("FragmentAddCategoryBinding is null")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            categoryId = it.getLong(CATEGORY_ID)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddCategoryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance(categoryId: Long) =
            AddCategoryFragment().apply {
                arguments = Bundle().apply {
                    putLong(CATEGORY_ID, categoryId)
                }
            }
    }
}