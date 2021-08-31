package com.tablayout.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tablayout.model.Photo
import com.tablayout.networks.ApiService
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.launch

class ArticleFragmentViewModel(var type: String) : ViewModel() {

    var articletext : String = type

    private val restApi = ApiService.getInstance()
    var listGallery: MutableLiveData<MutableList<Photo>> = MutableLiveData()

    fun getGallery() {
        viewModelScope.launch {
            try {
                val result = restApi.getPhotos()
                listGallery.postValue(result)
            } catch (throwable: Throwable) {
                if (throwable !is CancellationException) {

                }
            }
        }
    }
}