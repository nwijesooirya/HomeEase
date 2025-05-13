package com.example.homeease

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BookActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_book)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //home Navigation
        val home = findViewById<ImageView>(R.id.img_home)
        home.setOnClickListener {
            val intent = Intent(this, MyhomeActivity::class.java)
            startActivity(intent)
        }

        //Profile Navigation
        val profile = findViewById<ImageView>(R.id.img_profile)
        profile.setOnClickListener {
            val intent = Intent(this, MyProfileActivity::class.java)
            startActivity(intent)
        }

        //Settings Navigation
        val settings = findViewById<ImageView>(R.id.img_settings)
        settings.setOnClickListener {
            val intent = Intent(this, MySettingsActivity::class.java)
            startActivity(intent)
        }
    }
}