package com.example.android.pokus1.dto

import tomatobean.jsonparser.JsonFormat
import java.io.Serializable

class Artist : Serializable {

    @JsonFormat(JsonName = "thumb")
    lateinit var thumb: String

    @JsonFormat(JsonName = "title")
    lateinit var title: String

    @JsonFormat(JsonName = "uri")
    lateinit var uri: String

    @JsonFormat(JsonName = "cover_image")
    lateinit var coverImage: String

    @JsonFormat(JsonName = "resource_url")
    lateinit var resourceUrl: String

    @JsonFormat(JsonName = "type")
    lateinit var type: String

    @JsonFormat(JsonName = "id")
    lateinit var id: Integer
}
