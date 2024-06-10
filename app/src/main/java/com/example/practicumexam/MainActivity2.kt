package com.example.practicumexam

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val dayInput = findViewById<EditText>(R.id.dayInput)
        val submitButton = findViewById<Button>(R.id.submitButton)

        submitButton.setOnClickListener {
            val day = dayInput.text.toString().trim()

            if (day.equals("monday", ignoreCase = true)) {
                val intent = Intent(this, MainActivity3::class.java)
                intent.putExtra("day", day)
                startActivity(intent)
            }
        }
    }
}

