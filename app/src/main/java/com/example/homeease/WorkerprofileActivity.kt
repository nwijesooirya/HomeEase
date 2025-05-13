package com.example.homeease

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WorkerprofileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_workerprofile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //back from mike wilson profile
        val mikeb = findViewById<ImageView>(R.id.img_backmike)
        mikeb.setOnClickListener {
            val intent = Intent(this, MyhomeActivity::class.java)
            startActivity(intent)
        }
        //Booking section
        findViewById<Button>(R.id.btn_booking).setOnClickListener {
            val intent = Intent(this, BookActivity::class.java)
            startActivity(intent)
        }
    }
}