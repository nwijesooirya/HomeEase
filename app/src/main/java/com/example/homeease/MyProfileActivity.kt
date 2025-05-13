package com.example.homeease

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MyProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_my_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //settings Navigation
        val settings = findViewById<ImageView>(R.id.img_settings)
        settings.setOnClickListener {
            val intent = Intent(this, MySettingsActivity::class.java)
            startActivity(intent)
        }

        //home Navigation
        val home = findViewById<ImageView>(R.id.img_home)
        home.setOnClickListener {
            val intent = Intent(this, MyhomeActivity::class.java)
            startActivity(intent)
        }

        //Bookings Navigation
        val booking = findViewById<ImageView>(R.id.img_bookingP)
        booking.setOnClickListener {
            val intent = Intent(this, BookActivity::class.java)
            startActivity(intent)
        }

        //sign out button
        findViewById<Button>(R.id.btn_signout).setOnClickListener {
            val intent = Intent(this, SigninActivity::class.java)
            startActivity(intent)
        }

        //payment navigation
        findViewById<TextView>(R.id.tv_payments).setOnClickListener {
            val intent = Intent(this, PaymentActivity::class.java)
            startActivity(intent)
        }
    }
}