package com.tablayout.utils

import androidx.recyclerview.widget.DiffUtil
import com.tablayout.model.Photo

object AdapterCallback {

    val DiffGalleryCallback = object : DiffUtil.ItemCallback<Photo>() {

        override fun areItemsTheSame(oldItem: Photo, newItem: Photo): Boolean {
            return oldItem.url == newItem.url
        }

        override fun areContentsTheSame(oldItem: Photo, newItem: Photo): Boolean {
            return oldItem == newItem
        }

    }

}