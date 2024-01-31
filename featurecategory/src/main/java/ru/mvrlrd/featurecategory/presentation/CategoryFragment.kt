package ru.mvrlrd.featurecategory.presentation

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.launch
import ru.mvrlrd.feature_category_details.DetailsFragment
import ru.mvrlrd.featurecategory.databinding.FragmentCategoryBinding
import ru.mvrlrd.featurecategory.di.FeatureCategoryComponent
import ru.mvrlrd.featurecategory.domain.api.FetchAllCategoriesUseCase
import ru.mvrlrd.featurecategory.presentation.recycler.CategoryAdapter
import javax.inject.Inject

class CategoryFragment : Fragment() {
    private var _binding: FragmentCategoryBinding? = null
    private val binding: FragmentCategoryBinding get() = _binding?: throw RuntimeException("FragmentCategoryBinding = null")


    private val featureCategoryComponent: FeatureCategoryComponent by lazy {
        FeatureCategoryComponent.getFeatureCategoryComponent()
    }

    @Inject
    lateinit var categoryAdapter: CategoryAdapter
    @Inject
    lateinit var fetchAllCategoryUseCase: FetchAllCategoriesUseCase
    var cont :ViewGroup? = null

    override fun onAttach(context: Context) {
        featureCategoryComponent.inject(this@CategoryFragment)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        cont = container
        _binding = FragmentCategoryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recycler.apply {
            adapter = categoryAdapter

        }

        categoryAdapter.onItemClickCallback = {catId->
            Log.d("TAG", "onViewCreated: $catId ")
            requireActivity().supportFragmentManager.commit {
                replace(cont!!.id,DetailsFragment.newInstance(catId.toString()))
               addToBackStack(null)
            }
        }

        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED){
                fetchAllCategoryUseCase.fetchAllCategories().collect{
                    categoryAdapter.submitList(it)
                }
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}