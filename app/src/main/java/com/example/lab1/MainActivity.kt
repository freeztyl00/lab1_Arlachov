package com.example.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    val Cat = Animal("Абоба", "Я звичайна домашня кішка, я люблю гратися.")
    val Monkey = Animal("Давід", "Я іграшка у вигляді мавпочки.")
    val Hamster = Animal("Доктор Ватсон", "Я джунгарик, який бігає у колесі.")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun CatIntent(view: View)
    {
        val intent = Intent(this, AnimalActivity::class.java)
        startActivity(intent)
        intent.putExtra("name", Cat.name)
        intent.putExtra("about", Cat.about)
    }

    fun MonkeyIntent(view: View)
    {
        val intent = Intent(this, AnimalActivity::class.java)
        startActivity(intent)
        intent.putExtra("name", Monkey.name)
        intent.putExtra("about", Monkey.about)
    }

    fun HamsterIntent(view: View)
    {
        val intent = Intent(this, AnimalActivity::class.java)
        startActivity(intent)
        intent.putExtra("name", Hamster.name)
        intent.putExtra("about", Hamster.about)
    }
}