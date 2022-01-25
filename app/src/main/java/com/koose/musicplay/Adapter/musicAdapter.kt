package com.koose.musicplay.Adapter

import android.content.Context
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.koose.musicplay.Model.Music

class musicAdapter(var arrayList:ArrayList<Music> ) : BaseAdapter() {

    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return arrayList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position:Int, convertView: View?, parent: ViewGroup?): View {
        val context = parent?.context
        var rowView: View? =convertView
        var mediaPlayer: MediaPlayer? = null

        val inflate:LayoutInflater=context?.getSystemService(
            Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater
        )
    }

}