package com.example.mainapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val tvName = findViewById<TextView>(R.id.getName)
        val tvAge = findViewById<TextView>(R.id.getAge)

        val name = intent.getStringExtra("EXTRA_NAME")
        val age = intent.getIntExtra("EXTRA_AGE", 0)

        tvName.text = "Nama: " + name
        tvAge.text = "Umur: " + age
    }
}

