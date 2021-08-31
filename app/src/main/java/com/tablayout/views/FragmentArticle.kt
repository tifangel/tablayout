package com.tablayout.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.tablayout.adapters.GalleryAdapter
import com.tablayout.databinding.FragmentArticleBinding
import com.tablayout.utils.ViewModelFragmentFactory
import com.tablayout.viewmodels.ArticleFragmentViewModel

class FragmentArticle(type: String) : Fragment() {

    private lateinit var binding: FragmentArticleBinding
    private val viewModel : ArticleFragmentViewModel by viewModels{ ViewModelFragmentFactory(type) }

    private lateinit var galleryAdapter: GalleryAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentArticleBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.listArticles = viewModel

        setupRecyclerView()

        viewModel.getGallery()

        observeData()
    }

    private fun setupRecyclerView() {
        galleryAdapter = GalleryAdapter()
        binding.recyclerViewGallery.apply {
            adapter = galleryAdapter
        }
    }

    private fun observeData() {
        viewModel.listGallery.observe(viewLifecycleOwner, {
            galleryAdapter.submitList(it)
        })
    }
}