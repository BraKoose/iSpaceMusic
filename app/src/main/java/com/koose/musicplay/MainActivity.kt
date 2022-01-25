package com.koose.musicplay

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class  MainActivity : AppCompatActivity() {
    private lateinit var playbutton: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //first i am going to create MediaPlayer object
        val mediaplayer:MediaPlayer = MediaPlayer.create(this, R.raw.music)

        //now lets create our play button event
        playbutton.setOnClickListener {
            if (!mediaplayer.isPlaying){
                mediaplayer.start()

                playbutton.setImageResource(R.drawable.ic_baseline_play_circle_outline_24)
            }else{
                //the media player
            }
        }



    }
}