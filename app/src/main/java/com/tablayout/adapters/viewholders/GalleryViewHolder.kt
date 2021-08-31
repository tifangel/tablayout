package com.tablayout.adapters.viewholders

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tablayout.databinding.ItemGalleryBinding
import com.tablayout.model.Photo
import com.tablayout.viewmodels.ItemGalleryViewModel

class GalleryViewHolder(private val binding: ItemGalleryBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(photo: Photo) {
        binding.photo = ItemGalleryViewModel(photo)
        binding.executePendingBindings()
    }

    companion object {
        fun from(parent: ViewGroup): GalleryViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val binding: ItemGalleryBinding = ItemGalleryBinding.inflate(inflater, parent, false)
            return GalleryViewHolder(binding)
        }
    }
}