package com.example.homeease

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SigninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signin)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<TextView>(R.id.tv_nothave).setOnClickListener {
            val intent = Intent(this, SignupActivity2::class.java)
            startActivity(intent)
        }

        // ✅ Correct placement of button click listener
        findViewById<Button>(R.id.btn_signin).setOnClickListener {
            val intent = Intent(this, MyhomeActivity::class.java)
            startActivity(intent)
        }
    }
}