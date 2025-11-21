package com.example.petcare

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity_02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main02)

        findViewById<View>(R.id.signup).setOnClickListener {
            val intent = Intent(this, MainActivity_03::class.java)
            startActivity(intent)
            }

        findViewById<View>(R.id.login).setOnClickListener {
            val intent = Intent(this, MainActivity_04::class.java)
            startActivity(intent)
        }
    }
}