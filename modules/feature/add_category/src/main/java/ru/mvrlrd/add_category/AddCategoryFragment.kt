package ru.mvrlrd.add_category

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import ru.mvrlrd.add_category.databinding.FragmentAddCategoryBinding

class AddCategoryFragment : Fragment() {
    private val iconAdapter = IconAdapter()

    private var _binding: FragmentAddCategoryBinding? = null
    private val binding: FragmentAddCategoryBinding get() = _binding?:throw RuntimeException("FragmentAddCategoryBinding is null")


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
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            AddCategoryFragment().apply {

            }
    }
}