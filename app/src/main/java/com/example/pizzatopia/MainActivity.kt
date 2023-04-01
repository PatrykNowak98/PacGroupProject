package com.example.pizzatopia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animatedText: TextView = findViewById(R.id.animatedText)
        val text = "Stwórz własną pizzę!"
        val duration = 200L
        val delay = 1000L

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, PizzaMenu::class.java)
            startActivity(intent)
        }

        fun animateText() {
            var i = 0
            Handler().postDelayed(object : Runnable {
                override fun run() {
                    if (i <= text.length) {
                        animatedText.text = text.substring(0, i)
                        i++
                        Handler().postDelayed(this, duration)
                    } else {
                        i = 0
                        Handler().postDelayed(this, delay)
                    }
                }
            }, delay)
        }
        animateText()
    }
}