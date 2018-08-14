package com.example.android.pokus1.dto

import tomatobean.jsonparser.JsonFormat
import java.io.Serializable

class ArtistReleasesWrapper : Serializable{

   @JsonFormat(JsonName = "releases")
   lateinit var artistReleases : Array<ArtistReleases>

}