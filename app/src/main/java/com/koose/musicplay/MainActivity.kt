package com.koose.musicplay

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class  MainActivity : AppCompatActivity() {
    private var playbutton: ImageButton = findViewById(R.id.play_btn)
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}