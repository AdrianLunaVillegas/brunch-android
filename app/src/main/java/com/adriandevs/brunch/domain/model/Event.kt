package com.adriandevs.brunch.domain.model

@immutable
data class Event(
    val id: Int,
    val date: String,
    val location: String,
    val artists: List<Artist>,
    val infoUrl: String,
    val buyTicketUrl: String
)

