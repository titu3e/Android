package com.example.dailymotionplayer.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.dailymotionplayer.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoUrlInput = findViewById<EditText>(R.id.videoUrlInput)
        val playButton = findViewById<Button>(R.id.playButton)

        playButton.setOnClickListener {
            val url = videoUrlInput.text.toString()
            val intent = Intent(this, VideoPlayerActivity::class.java)
            intent.putExtra("video_url", url)
            startActivity(intent)
        }
    }
}