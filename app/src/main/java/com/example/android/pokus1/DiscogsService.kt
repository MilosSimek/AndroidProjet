package com.example.android.pokus1

import android.app.IntentService
import android.content.Intent
import android.util.Log
import com.beust.klaxon.Klaxon
import com.example.android.pokus1.dto.ArtistReleases

class DiscogsService : IntentService("DiscogsService") {

    override fun onHandleIntent(workIntent: Intent?) {
        val discogs = Discogs.run("https://api.discogs.com/artists/108713/releases")
        Log.d("Discogs", discogs)
        try {
            val ae = Klaxon().parse<ArtistReleases>(discogs)
            Log.d("Discogs", ae!!.artists.size.toString())
        } catch (e: Exception) {
            Log.d("Discogs", e.message.toString())
        }


    }
}