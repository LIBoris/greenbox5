package com.example.greenbox3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivitylogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activitylogin)
        val component45 = findViewById<ImageView>(R.id.imageView29)

        component45.setOnClickListener{
            startActivity(Intent(this,MainActivitypochta::class.java))
        }
    }
}