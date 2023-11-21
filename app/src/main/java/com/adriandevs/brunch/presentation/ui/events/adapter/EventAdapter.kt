package com.adriandevs.brunch.presentation.ui.events.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adriandevs.brunch.databinding.ItemEventBinding
import com.adriandevs.brunch.domain.model.Event

class EventAdapter(
    private val eventList: List<Event>,
    private val listener: EventListener
) : RecyclerView.Adapter<EventViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val binding =
            ItemEventBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EventViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        val item = eventList[position]
        holder.render(item, listener)
    }

    override fun getItemCount(): Int = eventList.size


}