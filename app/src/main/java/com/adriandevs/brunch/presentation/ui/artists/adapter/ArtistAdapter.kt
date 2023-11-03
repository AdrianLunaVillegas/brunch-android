package com.adriandevs.brunch.presentation.ui.artists.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adriandevs.brunch.databinding.ItemArtistBinding
import com.adriandevs.brunch.domain.model.Artist

class ArtistAdapter(
    private val artistList: List<Artist>,
    private val listener: ArtistListener
) : RecyclerView.Adapter<ArtistViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistViewHolder {
        val binding =
            ItemArtistBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ArtistViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ArtistViewHolder, position: Int) {
        val item = artistList[position]
        holder.render(item, listener)
    }

    override fun getItemCount(): Int = artistList.size


}