package com.adriandevs.brunch.data.local.artists

import com.adriandevs.brunch.domain.model.Event

object EventProvider {
    val eventList = listOf<Event>(
        Event(
            id = 19,
            date = "2, Septiembre 2023",
            location = "Plaza Mayor   15:00 - 23:00",
            artists = ArtistProvider.getArtistsById(19),
            infoUrl = "https://barcelona.brunchelectronik.com/",
            buyTicketUrl = "https://barcelona.brunchelectronik.com/"
        ),
        Event(
            id = 20,
            date = "10, Octubre 2023",
            location = "Parc del Fórum    12:00 - 21:00",
            artists = ArtistProvider.getArtistsById(20),
            infoUrl = "https://barcelona.brunchelectronik.com/",
            buyTicketUrl = "https://barcelona.brunchelectronik.com/"
        ),
        Event(
            id = 21,
            date = "2, Diciembre 2023",
            location = "Florida, 00:00 - 07:00",
            artists = ArtistProvider.getArtistsById(21),
            infoUrl = "https://barcelona.brunchelectronik.com/",
            buyTicketUrl = "https://barcelona.brunchelectronik.com/"
        )
    )
}