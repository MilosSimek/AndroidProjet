package com.example.android.pokus1

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.example.android.pokus1.dto.ArtistReleases
import com.example.android.pokus1.dto.ArtistReleasesWrapper


class MainActivity : AppCompatActivity() {

    var recyclerView: RecyclerView? = null
    var layoutManager: RecyclerView.LayoutManager? = null
    var adapter: RecyclerView.Adapter<*>? = null
    var recyclerArtistReleases: RecyclerAdapterArtistReleases = RecyclerAdapterArtistReleases()
    var mReceiver: ArtistReleasesBroadcastReceiver? = null


      /*  fun update(cardInfoArray: ArrayList<CardInfo>){
            recyclerArtistReleases.setArtistReleases(cardInfoArray)
            recyclerArtistReleases.notifyDataSetChanged()
        }*/


    var broadcastReceiver: BroadcastReceiver = object : BroadcastReceiver() {
       override fun onReceive(context: Context, intent: Intent) {
            //val data = ((ArtistReleasesWrapper) (intent.getSerializableExtra("DATA")))
           var data = intent.extras.get("DATA") as ArtistReleasesWrapper
           Log.d("Message", "AAAA")
           var cards = ArrayList<CardInfo>()
           for (item: ArtistReleases in data.artistReleases) {
               cards.add(CardInfo(item.artist, "", "", item.year as Int, 0, true, 0))
           }
           recyclerArtistReleases.setArtistReleases(cards)
           recyclerArtistReleases.notifyDataSetChanged()
          // recyclerView!!.refreshDrawableState()
            /*val datapassed = intent.getIntExtra("DATAPASSED", 0)
            val s = intent.action!!.toString()
            val s1 = intent.getStringExtra("DATAPASSED")*/
        }
    }

    override  fun onStart(){
        super.onStart()
        val intentFilter = IntentFilter()
        intentFilter.addAction("DiscogsAction")
        registerReceiver(broadcastReceiver,intentFilter)
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(broadcastReceiver)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val toolbar = findViewById(R.id.toolbar) as Toolbar
        //setSupportActionBar(toolbar)
        mReceiver = ArtistReleasesBroadcastReceiver()
        registerReceiver(mReceiver, IntentFilter("YourIntentAction"))
        val intent = Intent(this, DiscogsService::class.java)
        startService(intent)

        recyclerView = findViewById(R.id.recycler_view) as RecyclerView

        layoutManager = LinearLayoutManager(this)
        recyclerView?.layoutManager = layoutManager
        val card = CardInfo("Metallica", "Kill em all", "Rock", 1988, 5, true, 10)
        val card2 = CardInfo("Metallica", "Kill em all", "Rock", 1988, 5, true, 10)
        adapter = recyclerArtistReleases
        recyclerArtistReleases.setArtistReleases(listOf(card, card2, card))
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
