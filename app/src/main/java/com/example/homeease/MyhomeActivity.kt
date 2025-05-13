package com.example.homeease

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MyhomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_myhome)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //user profile
        val user = findViewById<ImageView>(R.id.img_pphoto)
        user.setOnClickListener {
            val intent = Intent(this, MyProfileActivity::class.java)
            startActivity(intent)
        }


        //mike profile
        val mike = findViewById<ImageView>(R.id.img_ex4)
        mike.setOnClickListener {
            val intent = Intent(this, WorkerprofileActivity::class.java)
            startActivity(intent)
        }

        //settings Navigation
        val settings = findViewById<ImageView>(R.id.img_settings)
        settings.setOnClickListener {
            val intent = Intent(this, MySettingsActivity::class.java)
            startActivity(intent)
        }

        //Profile Navigation
        val profile = findViewById<ImageView>(R.id.img_profile)
        profile.setOnClickListener {
            val intent = Intent(this, MyProfileActivity::class.java)
            startActivity(intent)
        }

        //Bookings Navigation
        val booking = findViewById<ImageView>(R.id.img_bookings)
        booking.setOnClickListener {
            val intent = Intent(this, BookActivity::class.java)
            startActivity(intent)
        }

    }
}