package com.example.android.pokus1.dto

import tomatobean.jsonparser.JsonFormat
import java.io.Serializable

class ArtistReleases : Serializable {

    @JsonFormat(JsonName = "status")
    lateinit var status: String

    @JsonFormat(JsonName = "thumb")
    lateinit var thumb: String

    @JsonFormat(JsonName = "title")
    lateinit var title: String

    @JsonFormat(JsonName = "format")
    lateinit var format: String

    @JsonFormat(JsonName = "label")
    lateinit var label: String

    @JsonFormat(JsonName = "role")
    lateinit var role: String

    @JsonFormat(JsonName = "year")
    lateinit var year: Integer

    @JsonFormat(JsonName = "resource_url")
    lateinit var resourceUrl: String

    @JsonFormat(JsonName = "artist")
    lateinit var artist: String

    @JsonFormat(JsonName = "type")
    lateinit var type: String

    @JsonFormat(JsonName = "id")
    lateinit var id: Integer
}

