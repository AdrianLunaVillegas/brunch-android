package com.adriandevs.brunch.presentation.ui.artists.adapter

import androidx.recyclerview.widget.RecyclerView
import com.adriandevs.brunch.databinding.ItemArtistBinding
import com.adriandevs.brunch.domain.model.Artist

class ArtistViewHolder(binding: ItemArtistBinding) :
    RecyclerView.ViewHolder(binding.root) {
    private val viewBinding = binding
    fun render(
        artist: Artist,
        listener: ArtistListener
    ) {
        viewBinding.apply {
            tVArtistName.text = artist.name
            configButtonBuy(
                url = artist.event.url,
                listener = listener
            )

        }

    }

    private fun configButtonBuy(
        url: String,
        listener: ArtistListener
    ){
        viewBinding.btnBuy.setOnClickListener {
            listener.onUrlClick(url)
        }
    }

}
