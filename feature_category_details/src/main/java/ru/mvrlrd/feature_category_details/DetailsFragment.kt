package ru.mvrlrd.feature_category_details

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import ru.mvrlrd.feature_category_details.databinding.FragmentDetailsBinding

private const val CATEGORY_ID = "param1"


class DetailsFragment : Fragment() {
    private var _binding: FragmentDetailsBinding? = null
    private val binding: FragmentDetailsBinding get()=_binding?:throw RuntimeException("FragmentDetailsBinding = null")
//    private val args by navArgs<>()
    private var categoryId: String? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("TAG", "onAttach: details ")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            categoryId = it.getString(CATEGORY_ID)
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
        binding.tvWord.text = categoryId?:"lalala"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String) =
            DetailsFragment().apply {
                arguments = Bundle().apply {
                    putString(CATEGORY_ID, param1)
                }
            }
    }
}