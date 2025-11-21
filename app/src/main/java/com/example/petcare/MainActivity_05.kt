package com.example.petcare

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity_05 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main05)

        findViewById<View>(R.id.icon).setOnClickListener {
            val intent = Intent(this, MainActivity_08::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.bookappo).setOnClickListener {
            val intent = Intent(this, MainActivity_06::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.addpet).setOnClickListener {
            val intent = Intent(this, MainActivity_07::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.yourpets).setOnClickListener {
            val intent = Intent(this, MainActivity_10::class.java)
            startActivity(intent)
        }
    }
}