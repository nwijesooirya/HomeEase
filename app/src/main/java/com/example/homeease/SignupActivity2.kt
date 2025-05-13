package com.example.homeease

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignupActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // ✅ Correct placement of button click listener
        findViewById<Button>(R.id.btn_signup).setOnClickListener {
            val intent = Intent(this, SigninActivity::class.java)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.tv_already).setOnClickListener {
            val intent = Intent(this, SigninActivity::class.java)
            startActivity(intent)
        }

    }
}