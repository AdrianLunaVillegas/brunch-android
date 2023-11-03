package com.adriandevs.brunch.data.local.artists

import com.adriandevs.brunch.domain.model.Artist
import com.adriandevs.brunch.domain.model.ArtistEvent

object ArtistProvider {
    val artistList = listOf(
        Artist(
            name = "Ilario Alicante",
            event = getArtistFirstEvent(),
        ),
        Artist(
            name = "Baum",
            event = getArtistFirstEvent(),
        ),
        Artist(
            name = "Marco Faraone",
            event = getArtistSecondEvent(),
        ),
        Artist(
            name = "Paco Osuna",
            event = getArtistSecondEvent(),
        ),
        Artist(
            name = "Andres Campo",
            event = getArtistFirstEvent(),
        ),
        Artist(
            name = "Nina Kravitz",
            event = getArtistFirstEvent(),
        ),
        Artist(
            name = "Nico Moreno",
            event = getArtistSecondEvent(),
        ),
        Artist(
            name = "Dexphase",
            event = getArtistThirdEvent(),
        ),
        Artist(
            name = "Daniela Da Silva",
            event = getArtistThirdEvent()
        )
    )

    fun getArtistsById(id: Int): List<Artist> {
        //la funcion recibe por parametro un Int(entero) y retorna una Lista. return... etc filtra
        // en la lista y compara si el entero pasado por parametro es igual al id del evento.
        return artistList.filter { artist -> artist.event.id == id }
    }

    private fun getArtistFirstEvent() = ArtistEvent(
        id = 19,
        date = "2, Septiembre",
        address = "Plaza Mayor",
        url = "https://barcelona.brunchelectronik.com/"
    )

    private fun getArtistSecondEvent() = ArtistEvent(
        id = 20,
        date = "10, Octubre",
        address = "Plaza Mayor",
        url = "http.VentaTicketsPepito.com"
    )

    private fun getArtistThirdEvent() = ArtistEvent(
        id = 21,
        date = "2, Diciembre",
        address = "Florida",
        url = "https://barcelona.brunchelectronik.com/"
    )
}

