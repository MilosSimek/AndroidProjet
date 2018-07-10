package com.example.android.pokus1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.view.Menu
import android.view.MenuItem
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.example.android.pokus1.R

class MainActivity : AppCompatActivity() {

    var recyclerView: RecyclerView? = null
    var layoutManager: RecyclerView.LayoutManager? = null
    var adapter: RecyclerView.Adapter<*>? = null
    var recycler: RecyclerAdapter = RecyclerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val toolbar = findViewById(R.id.toolbar) as Toolbar
        //setSupportActionBar(toolbar)

        val intent = Intent(this, DiscogsService::class.java)
        startService(intent)

        recyclerView = findViewById(R.id.recycler_view) as RecyclerView

        layoutManager = LinearLayoutManager(this)
        recyclerView?.layoutManager = layoutManager
        val card = CardInfo("Metallica", "Kill em all", "Rock", 1988, 5, true, 10)
        val card2 = CardInfo("Metallica", "Kill em all", "Rock", 1988, 5, true, 10)
        adapter = recycler
        recycler.SetData(listOf(card, card2, card))
        recyclerView?.adapter = adapter

    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
       // menuInflater.inflate(R.menu.menu_card_demo, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
       // val id = item.itemId


//        return if (id == R.id.action_settings) {
//            true
//        }  else

        Log.d("example", "cokoli")
           return super.onOptionsItemSelected(item)

    }
}
