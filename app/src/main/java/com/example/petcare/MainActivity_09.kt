package com.example.petcare

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity_09 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main09)

        findViewById<View>(R.id.back_to_home).setOnClickListener {
            val intent = Intent(this, MainActivity_05::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.payments).setOnClickListener {
            val intent = Intent(this, MainActivity_11::class.java)
            startActivity(intent)
        }
    }
}