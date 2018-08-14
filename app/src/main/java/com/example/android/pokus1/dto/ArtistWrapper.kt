package com.example.android.pokus1.dto

import tomatobean.jsonparser.JsonFormat
import java.io.Serializable

class ArtistWrapper : Serializable {


    @JsonFormat(JsonName = "results")
    lateinit var artists : Array<Artist>
}