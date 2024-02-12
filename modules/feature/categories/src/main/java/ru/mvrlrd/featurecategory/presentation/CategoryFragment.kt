package ru.mvrlrd.featurecategory.presentation

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.launch
import ru.mvrlrd.core_api.mediator.AddCategoryMediator
import ru.mvrlrd.core_api.mediator.AppWithFacade
import ru.mvrlrd.featurecategory.databinding.FragmentCategoryBinding
import ru.mvrlrd.featurecategory.di.FeatureCategoryComponent
import ru.mvrlrd.featurecategory.domain.api.FetchAllCategoriesUseCase
import ru.mvrlrd.featurecategory.presentation.recycler.CategoryAdapter
import javax.inject.Inject

class CategoryFragment : Fragment() {
    private var _binding: FragmentCategoryBinding? = null
    private val binding: FragmentCategoryBinding get() = _binding?: throw RuntimeException("FragmentCategoryBinding = null")


    private val featureCategoryComponent: FeatureCategoryComponent by lazy {
        FeatureCategoryComponent.getFeatureCategoryComponent(
            (requireActivity().application as AppWithFacade).getFacade()
        )
    }

//    @Inject
//    lateinit var detailsMediator: DetailsMediator

    @Inject
    lateinit var categoryAdapter: CategoryAdapter
    @Inject
    lateinit var fetchAllCategoryUseCase: FetchAllCategoriesUseCase
    @Inject
    lateinit var addCategoryMediator: AddCategoryMediator
    var _container :ViewGroup? = null
//    @Inject
//    lateinit var searchTranslationsUseCase: SearchTranslationsUseCase

    override fun onAttach(context: Context) {
        featureCategoryComponent.inject(this@CategoryFragment)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _container = container
        _binding = FragmentCategoryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fabAddCategory.setOnClickListener {
            addCategoryMediator.startAddCategoryFragment(_container!!.id,requireActivity().supportFragmentManager)
        }

        binding.recycler.apply {
            adapter = categoryAdapter

        }

//        categoryAdapter.onItemClickCallback = { catId ->
//            Log.d("TAG", "onViewCreated: $catId ")
//            detailsMediator.startDetailsFragment(_container!!.id, requireActivity().supportFragmentManager, catId)
//        }


        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED) {
                Log.d("TAG", "_____onViewCreated: ____helllloooo")
                fetchAllCategoryUseCase.fetchAllCategories().collect {
                    Log.d("TAG", "_____onViewCreated: ${it.size}")
                    categoryAdapter.submitList(it)
                }

//             searchTranslationsUseCase.searchTranslation("root")
//                  .forEach {
//                  Log.d("TAG", "_____onViewCreated: ____${it.text}")
//              }

            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}