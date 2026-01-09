package com.example.mainapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val editName = findViewById<EditText>(R.id.edtName)
        val editAge = findViewById<EditText>(R.id.edtAge)
        val BtnSend = findViewById<Button>(R.id.BtnSend)

        BtnSend.setOnClickListener {
            val name = editName.text.toString()
            val age = editAge.text.toString().toInt()

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("EXTRA_NAME", name)
            intent.putExtra("EXTRA_AGE", age)

            startActivity(intent)
        }

    }
}