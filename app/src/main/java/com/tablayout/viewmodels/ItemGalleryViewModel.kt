package com.tablayout.viewmodels

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.tablayout.model.Photo

class ItemGalleryViewModel(photo: Photo): ViewModel() {
    var imageUrl:ObservableField<String?> = ObservableField(photo.url)
    var title:ObservableField<String?> = ObservableField(photo.author)
}