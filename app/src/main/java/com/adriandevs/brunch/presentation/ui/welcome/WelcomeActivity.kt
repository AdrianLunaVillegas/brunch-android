package com.adriandevs.brunch.presentation.ui.welcome

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adriandevs.brunch.data.local.artists.EventProvider
import com.adriandevs.brunch.databinding.ActivityWelcomeBinding
import com.adriandevs.brunch.presentation.ui.artists.ArtistActivity
import com.adriandevs.brunch.presentation.ui.events.EventActivity

class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        EventProvider.eventList//  This is how we access the list of events/ Así accedemos a la lista de eventos
        configButton()
    }

    private fun configButton() {
        binding.apply {
            btnArtists.setOnClickListener {
                launchActivity(ArtistActivity::class.java)
            }

            btnEvents.setOnClickListener {
                launchActivity(EventActivity::class.java)
            }
        }
    }

    private fun AppCompatActivity.intent(activity: Class<*>): Intent {
        return Intent(this, activity)
    }

    private fun Activity.launchActivity(activity: Class<*>) {
        val intent = intent(activity)
        startActivity(intent)
    }

}
