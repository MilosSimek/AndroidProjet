package com.example.android.pokus1
import android.app.IntentService
import android.content.Intent
import android.os.Bundle
import android.util.Log

import com.example.android.pokus1.dto.ArtistReleases
import tomatobean.jsonparser.parseJson

class DiscogsService : IntentService("DiscogsService") {

    override fun onHandleIntent(workIntent: Intent?) {
        val discogs = Discogs.run("https://api.discogs.com/artists/108713/releases")
        Log.d("Discogs", discogs)
        try {
            val ae = discogs.parseJson(ArtistReleases::class)
           // val ae = Klaxon().parse<ArtistReleases>(discogs)
            Log.d("Discogs", ae!!.artists.size.toString())

            val intent = Intent("YourIntentAction")
            intent.putExtra("Data", ae)
            sendBroadcast(intent)


        } catch (e: Exception) {
            Log.d("Discogs", e.message.toString())
        }


    }
}