package com.example.android.pokus1.dto

import com.beust.klaxon.Json

class Artist {

    @Json(name = "status")
    var status: String = ""

    @Json(name = "thumb")
    var thumb: String = ""

    @Json(name = "title")
    lateinit var title: String

    @Json(name = "format")
    var format: String = ""

    @Json(name = "label")
    var label: String = ""

    @Json(name = "role")
    var role: String = ""

    @Json(name = "year")
    var year: Int = 0

    @Json(name = "resource_url")
    var resource_url: String = ""

    @Json(name = "artist")
    var artist: String = ""

    @Json(name = "type")
    var type: String = ""

    @Json(name = "id")
    var id: Int = 0
}

