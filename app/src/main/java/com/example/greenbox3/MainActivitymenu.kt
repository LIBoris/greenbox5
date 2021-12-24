package com.example.greenbox3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivitymenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activitymenu)
        val component45 = findViewById<ImageView>(R.id.imageView30)

        component45.setOnClickListener {
            startActivity(Intent(this, MainActivitysandwichi::class.java))
        }
        val component46 = findViewById<ImageView>(R.id.imageView31)

        component46.setOnClickListener {
            startActivity(Intent(this, MainActivitysalats::class.java))
        }
        val component47 = findViewById<ImageView>(R.id.imageView32)

        component47.setOnClickListener {
            startActivity(Intent(this, MainActivitypizza::class.java))
        }
        val component48 = findViewById<ImageView>(R.id.imageView33)

        component48.setOnClickListener {
            startActivity(Intent(this, MainActivitykonwertiki::class.java))
        }
        val component49 = findViewById<ImageView>(R.id.imageView34)

        component49.setOnClickListener {
            startActivity(Intent(this, MainActivitydrugoe::class.java))
        }
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