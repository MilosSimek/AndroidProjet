package com.example.android.pokus1.dto

import com.beust.klaxon.Json

class ArtistReleases{

   @Json(name = "releases")
   public var artists : Array<Artist> = arrayOf<Artist>()

}