package com.example.petcare

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity_03 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main03)

        findViewById<View>(R.id.signup1).setOnClickListener {
            startActivity(Intent(this, MainActivity_04::class.java))
        }
    }
}
