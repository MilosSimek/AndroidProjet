package com.example.android.pokus1

import android.os.AsyncTask.execute
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException




class Discogs {

    companion object {


    fun run(url: String): String {
        var client = OkHttpClient()
        val request = Request.Builder()
                .url(url)
                .header("Authorization", "Discogs token=eUbApxhiBeGKQzECkSnzkYqdjsVZXFjRfDCOBthw")
                .build()

        val response = client.newCall(request).execute()
        return response.body()!!.string()
    }
    }
}