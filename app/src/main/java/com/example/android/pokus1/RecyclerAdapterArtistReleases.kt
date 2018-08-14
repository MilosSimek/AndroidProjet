package com.example.android.pokus1

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView



class RecyclerAdapterArtistReleases : RecyclerView.Adapter<RecyclerAdapterArtistReleases.ViewHolder>() {

    public fun setArtistReleases(data:List<CardInfo>){
        this.data =data
        this.notifyDataSetChanged()
    }

    private var data: List<CardInfo> = ArrayList<CardInfo>()

    //private val artistReleases = arrayOf("Metallica", "Tri Sestry")
    //, "Chapter Two", "Chapter Three", "Chapter Four", "Chapter Five", "Chapter Six", "Chapter Seven", "Chapter Eight")

    //private val albums = arrayOf("Kill em all", "Na Kovarne")
    //, "Item two details", "Item three details", "Item four details", "Item file details", "Item six details", "Item seven details", "Item eight details")

    //private val genres = arrayOf("Rock", "Punk Rock")
            //R.drawable.android_image_2, R.drawable.android_image_3, R.drawable.android_image_4, R.drawable.android_image_5, R.drawable.android_image_6, R.drawable.android_image_7, R.drawable.android_image_8)

   class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var artist: TextView
        var album: TextView
        var genre: TextView

        init {
            artist = itemView.findViewById(R.id.artist) as TextView
            album = itemView.findViewById(R.id.album) as TextView
            genre = itemView.findViewById(R.id.genre) as TextView


        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.releases_layout, viewGroup, false)
        return ViewHolder(v)
    }



    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.artist.text = "ArtistReleases:" + data.get(i).Artist
        viewHolder.album.text = "Album:" +data.get(i).Album
        viewHolder.genre.text = "Genre:" +data.get(i).Genre
    }

    override fun getItemCount(): Int {
        return data.size
    }
}
