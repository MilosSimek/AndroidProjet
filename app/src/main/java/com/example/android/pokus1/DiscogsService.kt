package com.example.android.pokus1

import android.app.IntentService
import android.content.Intent
import android.util.Log
import com.example.android.pokus1.dto.ArtistReleases
import com.example.android.pokus1.dto.ArtistReleasesWrapper
import tomatobean.jsonparser.parseJson

class DiscogsService : IntentService("DiscogsService") {

    override fun onHandleIntent(workIntent: Intent?) {
        val discogs = Discogs.run("https://api.discogs.com/artistReleases/108713/releases")
        Log.d("Discogs", discogs)
        try {
            val ae = discogs.parseJson(ArtistReleasesWrapper::class)
            // val ae = Klaxon().parse<ArtistReleasesWrapper>(discogs)
            Log.d("Discogs", ae!!.artistReleases.size.toString())

            val data:ArrayList<CardInfo> = ArrayList()
            for (item: ArtistReleases in ae.artistReleases) {
                data.add(CardInfo(item.title, "", "", 2000, 5, true, 2))
            }

            val intent = Intent()
            intent.setAction("DiscogsAction")
            intent.putExtra("DATA", ae)
            sendBroadcast(intent)

        } catch (e: Exception) {
            Log.d("Discogs", e.message.toString())
        }


    }
}