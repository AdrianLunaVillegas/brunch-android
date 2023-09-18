package com.adriandevs.brunch.presentation.ui.artists

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adriandevs.brunch.databinding.ActivityArtistBinding
import com.adriandevs.brunch.databinding.ItemEventBinding

class ArtistActivity : AppCompatActivity() {

    private lateinit var binding : ActivityArtistBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArtistBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}