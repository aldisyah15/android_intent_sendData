package com.example.mainapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import main.User

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val tvName = findViewById<TextView>(R.id.getName)
        val tvAge = findViewById<TextView>(R.id.getAge)
        val tvEmail = findViewById<TextView>(R.id.getEmail)
        val tvCity = findViewById<TextView>(R.id.getCity)

        val user = intent.getParcelableExtra<User>("EXTRA-USER", User::class.java)


        tvName.text = "Nama: " + user?.name
        tvAge.text = "Umur: " + user?.age
        tvEmail.text = "Email: " + user?.email
        tvCity.text = "city: " + user?.city
    }
}

