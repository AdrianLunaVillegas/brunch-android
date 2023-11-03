package com.adriandevs.brunch.presentation.ui.artists

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.adriandevs.brunch.data.local.artists.ArtistProvider.artistList
import com.adriandevs.brunch.databinding.ActivityArtistBinding
import com.adriandevs.brunch.presentation.ui.artists.adapter.ArtistAdapter
import com.adriandevs.brunch.presentation.ui.artists.adapter.ArtistListener

class ArtistActivity : AppCompatActivity(), ArtistListener {

    private lateinit var binding: ActivityArtistBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArtistBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    override fun onUrlClick(url: String) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(browserIntent)
    }

    private lateinit var artistAdapter: ArtistAdapter
    fun initRecyclerView() {
        binding.apply {
            artistAdapter = ArtistAdapter(artistList, this@ArtistActivity)
            recyclerARTIST.layoutManager =
                LinearLayoutManager(this@ArtistActivity, LinearLayoutManager.VERTICAL, false)
            recyclerARTIST.adapter = artistAdapter
        }
    }
}