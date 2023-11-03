package com.adriandevs.brunch.domain.model

data class Artist(
    val name: String,
    val event: ArtistEvent
)

data class ArtistEvent(
    val id: Int,
    val date: String,
    val address: String,
    val url: String
)