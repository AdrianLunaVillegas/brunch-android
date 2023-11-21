package com.adriandevs.brunch.presentation.ui.events.adapter

import androidx.recyclerview.widget.RecyclerView
import com.adriandevs.brunch.databinding.ItemEventBinding
import com.adriandevs.brunch.domain.model.Event

class EventViewHolder(binding: ItemEventBinding) :
    RecyclerView.ViewHolder(binding.root) {
    private val viewBinding = binding

    fun render(
        event: Event,
        listener: EventListener
    ) {
        viewBinding.apply {
            brunchTitle.id = event.id
            brunchDate.text = event.date
            brunchLocation.text = event.location
            var artistText = EmptyString
            event.artists.forEach { artist ->
                artistText += "${artist.name}\n\n"
            }
            textViewArtist.text = artistText
            configTicketButton(
                url = event.buyTicketUrl,
                listener = listener
            )
            configInfoButton(
                url = event.infoUrl,
                listener = listener
            )
        }
    }

    private fun configTicketButton(
        url: String,
        listener: EventListener
    ){
        viewBinding.btnBuy.setOnClickListener {
            listener.onUrlClick(url)
        }

    }
    private fun configInfoButton(
        url: String,
        listener: EventListener
    ){
        viewBinding.btnInfo.setOnClickListener {
            listener.onUrlClick(url)
        }
    }

}

private const val EmptyString = ""