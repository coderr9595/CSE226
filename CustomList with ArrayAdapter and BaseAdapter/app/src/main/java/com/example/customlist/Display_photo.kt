package com.example.customlist

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Display_photo : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_photo)
        val name = intent.getStringExtra("name")
        val description = intent.getStringExtra("description")
        val imageResId = intent.getIntExtra("imageResId", 0)

        val nameTextView = findViewById<TextView>(R.id.nameTextView)
        val descriptionTextView = findViewById<TextView>(R.id.descriptionTextView)
        val imageView = findViewById<ImageView>(R.id.imageView)

        nameTextView.text = name
        descriptionTextView.text = description
        imageView.setImageResource(imageResId)
    }
}