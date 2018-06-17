package com.example.android.pokus1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val CardInfo = CardInfo("Tri Sestry", "Na kovarne", "Rock", 2018, 4, true, 2000  )
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
