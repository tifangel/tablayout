package com.tablayout.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.tablayout.viewmodels.ArticleFragmentViewModel

class ViewModelFragmentFactory(private val params: Any): ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass == ArticleFragmentViewModel::class.java){
            return ArticleFragmentViewModel(params as String) as T
        }
        return super.create(modelClass)
    }
}