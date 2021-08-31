package com.tablayout.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.tablayout.adapters.viewholders.GalleryViewHolder
import com.tablayout.model.Photo
import com.tablayout.utils.AdapterCallback

class GalleryAdapter(): ListAdapter<Photo, GalleryViewHolder>(AdapterCallback.DiffGalleryCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        return GalleryViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        val model = getItem(position)
        holder.bind(model)
    }

}