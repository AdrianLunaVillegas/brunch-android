package com.adriandevs.brunch.presentation.ui.events

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adriandevs.brunch.databinding.ActivityEventBinding
import com.adriandevs.brunch.databinding.ItemEventBinding

class EventActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEventBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEventBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}