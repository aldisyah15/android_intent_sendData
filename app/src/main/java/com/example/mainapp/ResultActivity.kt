package com.example.mainapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
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
        val tvBtnDial = findViewById<Button>(R.id.btnDial)

        val user = intent.getParcelableExtra<User>("EXTRA-USER", User::class.java)


        tvName.text = "Nama: " + user?.name
        tvAge.text = "Umur: " + user?.age
        tvEmail.text = "Email: " + user?.email
        tvCity.text = "city: " + user?.city

        tvBtnDial.setOnClickListener {
            tvBtnDial.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("tel:08123456789")
                startActivity(intent)
            }

        }

    }
}

