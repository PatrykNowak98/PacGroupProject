package com.example.pizzatopia

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class PizzaMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pizza_menu)
    }

    //Pizza Diavola
    fun sureDiavola(view: View?) {
        val intent = Intent(this, SpicyPizzas::class.java)
        startActivity(intent)
    }

    //Pizza Prosciutto e funghi
    fun sureEFungi(view: View?) {
        val intent = Intent(this, PizzaSize::class.java)
        startActivity(intent)
    }

    //Pizza Capricciosa
    fun sureCapri(view: View?) {
        val intent = Intent(this, PizzaSize::class.java)
        startActivity(intent)
    }
}