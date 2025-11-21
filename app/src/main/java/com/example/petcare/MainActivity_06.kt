package com.example.petcare

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity_06 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main06)

        findViewById<View>(R.id.backtohome).setOnClickListener {
            val intent = Intent(this, MainActivity_05::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.book).setOnClickListener {
            val intent = Intent(this, MainActivity_09::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.book1).setOnClickListener {
            val intent = Intent(this, MainActivity_09::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.book2).setOnClickListener {
            val intent = Intent(this, MainActivity_09::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.book3).setOnClickListener {
            val intent = Intent(this, MainActivity_09::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.book4).setOnClickListener {
            val intent = Intent(this, MainActivity_09::class.java)
            startActivity(intent)
        }
    }
}