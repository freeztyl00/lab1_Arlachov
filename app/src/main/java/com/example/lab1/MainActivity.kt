package com.example.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCat = findViewById<Button>(R.id.button_cat)
        buttonCat.setOnClickListener {
            CatIntent()
        }
        val buttonMonkey = findViewById<Button>(R.id.button_monkey)
        buttonMonkey.setOnClickListener {
            MonkeyIntent()
        }
        val buttonHamster = findViewById<Button>(R.id.button_hamster)
        buttonHamster.setOnClickListener {
            HamsterIntent()
        }
    }

    val Cat = Animal("Абоба", "Я домашня кішка, яка полюбляє гратися.")
    val Monkey = Animal("Давід", "Я іграшка у вигляді мавпочки.")
    val Hamster = Animal("Доктор Ватсон", "Я джунгарик, який бігає у колесі.")
    fun CatIntent() {
        val secActivity = Intent(this, AnimalActivity::class.java).also{
            it.putExtra("name", Cat.name)
            it.putExtra("about", Cat.about)
            startActivity(it)
        }
    }

    fun MonkeyIntent() {
        val secActivity = Intent(this, AnimalActivity::class.java).also{
            it.putExtra("name", Monkey.name)
            it.putExtra("about", Monkey.about)
            startActivity(it)
        }
    }

    fun HamsterIntent() {
        val secActivity = Intent(this, AnimalActivity::class.java).also{
            it.putExtra("name", Hamster.name)
            it.putExtra("about", Hamster.about)
            startActivity(it)
        }
    }
}