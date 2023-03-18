package com.example.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val Cat = Animal("Абоба", "Я звичайна домашня кішка, яка полюбляє гратися.")
    val Monkey = Animal("Давід", "Я іграшка у вигляді мавпочки.")
    val Hamster = Animal("Доктор Ватсон", "Я джунгарик, який бігає у колесі.")

    fun CatIntent(view: View) {
        val secActivity = Intent(this, AnimalActivity::class.java)
        startActivity(secActivity)
        intent.putExtra("name", Cat.name)
        intent.putExtra("about", Cat.about)
    }

    fun MonkeyIntent(view: View) {
        val secActivity = Intent(this, AnimalActivity::class.java)
        startActivity(secActivity)
        intent.putExtra("name", Monkey.name)
        intent.putExtra("about", Monkey.about)
    }

    fun HamsterIntent(view: View) {
        val secActivity = Intent(this, AnimalActivity::class.java)
        startActivity(secActivity)
        intent.putExtra("name", Hamster.name)
        intent.putExtra("about", Hamster.about)
    }
}