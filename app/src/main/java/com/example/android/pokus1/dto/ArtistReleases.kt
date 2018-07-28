package com.example.android.pokus1.dto

import tomatobean.jsonparser.JsonFormat
import java.io.Serializable

class ArtistReleases : Serializable{

   @JsonFormat(JsonName = "releases")
   lateinit var artists : Array<Artist>

}