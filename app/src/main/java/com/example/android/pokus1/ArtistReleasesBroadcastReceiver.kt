package com.example.android.pokus1

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class ArtistReleasesBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d("Test", intent!!.getSerializableExtra("data").toString())
    }
// TODO Presunout do aktivity

}