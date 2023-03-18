package com.example.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class AnimalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)
        showInfo()
    }
    val Name = intent.getStringExtra("name")
    val About = intent.getStringExtra("about")
    fun showInfo()
    {
        val showName = findViewById<TextView>(R.id.textName)
        showName.text = Name
        val showAbout = findViewById<TextView>(R.id.textAbout)
        showAbout.text = About
    }
}