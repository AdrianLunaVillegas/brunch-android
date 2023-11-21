package com.adriandevs.brunch.presentation.ui.events

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.adriandevs.brunch.data.local.artists.EventProvider.eventList
import com.adriandevs.brunch.databinding.ActivityEventBinding
import com.adriandevs.brunch.presentation.ui.events.adapter.EventAdapter
import com.adriandevs.brunch.presentation.ui.events.adapter.EventListener

class EventActivity : AppCompatActivity(), EventListener {

    private lateinit var binding: ActivityEventBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEventBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    override fun onUrlClick(url: String) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(browserIntent)
    }

    private lateinit var eventAdapter: EventAdapter
    fun initRecyclerView() {
        binding.apply {
            eventAdapter = EventAdapter(eventList, this@EventActivity)
            recyclerEvent.layoutManager =
                LinearLayoutManager(this@EventActivity, LinearLayoutManager.VERTICAL, false)
            recyclerEvent.adapter = eventAdapter
        }
    }
}