package ru.mvrlrd.feature_category_details.presentation

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import ru.mvrlrd.feature_category_details.databinding.FragmentDetailsBinding
import ru.mvrlrd.feature_category_details.di.DetailsComponent
import ru.mvrlrd.feature_category_details.domain.WordItem
import ru.mvrlrd.feature_category_details.presentation.recycler.WordAdapter
import javax.inject.Inject
import kotlin.random.Random

private const val CATEGORY_ID = "category_id"
class DetailsFragment : Fragment() {
    private var _binding: FragmentDetailsBinding? = null
    private val binding: FragmentDetailsBinding get()=_binding?:throw RuntimeException("FragmentDetailsBinding = null")
    private var categoryId: Long = -1

    private val detailsComponent: DetailsComponent by lazy {
        DetailsComponent.getDetailsComponent()
    }

    @Inject
    lateinit var wordAdapter: WordAdapter

    override fun onAttach(context: Context) {
        detailsComponent.inject(this)
        super.onAttach(context)
    }

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
        Log.d("TAG", "onCreateView: layoutInflater ${layoutInflater}\nconr:${container} ")
        _binding = FragmentDetailsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvWord.text = categoryId.toString()
        binding.rvWords.apply {
            adapter = wordAdapter
        }
        viewLifecycleOwner.lifecycleScope.launch {
            delay(20)
            wordAdapter.submitList(createMockListOfWords())
        }
    }
    private fun createMockListOfWords(): List<WordItem>{
        //получаю из базы для данной категории слова и их переводы
        val countOfWords = Random.nextInt(30)
        val wordItems = mutableListOf<WordItem>()
        repeat(countOfWords){
            val countOfTranslations = Random.nextInt(4)
            val words = mutableListOf<String>()
            repeat(countOfTranslations){
                val word = "перевод $it"
                words.add(word)
            }
            val wordItem = WordItem(0, "word$it", words)
            wordItems.add(wordItem)
        }
        return wordItems
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

        @JvmStatic
        fun newInstance(categoryId: Long) =
            DetailsFragment().apply {
                arguments = Bundle().apply {
                    putLong(CATEGORY_ID, categoryId)
                }
            }
    }
}