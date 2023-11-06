package com.adriandevs.brunch.domain.model

@immutable
data class Artist(
    val name: String,
    val event: ArtistEvent
)

annotation class immutable
@immutable
data class ArtistEvent(
    val id: Int,
    val date: String,
    val address: String,
    val url: String
)