package com.tablayout.viewmodels

import androidx.lifecycle.ViewModel

class ArticleFragmentViewModel(var type: String) : ViewModel() {

    var articletext : String = type
}