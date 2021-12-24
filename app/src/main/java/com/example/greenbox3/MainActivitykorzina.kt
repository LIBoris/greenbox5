package com.example.greenbox3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivitykorzina : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activitykorzina)
        val component50 = findViewById<ImageView>(R.id.imageView36)

        component50.setOnClickListener {
            startActivity(Intent(this, MainActivityprofile::class.java))
        }

        val component51 = findViewById<ImageView>(R.id.imageView28)

        component51.setOnClickListener {
            startActivity(Intent(this, MainActivitykorzina::class.java))
        }
        val component52 = findViewById<ImageView>(R.id.imageView26)

        component52.setOnClickListener {
            startActivity(Intent(this, MainActivitymenu::class.java))
        }
    }
}