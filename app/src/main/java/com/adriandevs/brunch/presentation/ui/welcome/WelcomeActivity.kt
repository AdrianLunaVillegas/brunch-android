package com.adriandevs.brunch.presentation.ui.welcome

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adriandevs.brunch.databinding.ActivityWelcomeBinding
import com.adriandevs.brunch.presentation.ui.events.EventActivity

class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        configButton()
    }

    private fun configButton() {
        binding.apply {
            btnArtists.setOnClickListener {
                launchActivity(EventActivity::class.java)
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
