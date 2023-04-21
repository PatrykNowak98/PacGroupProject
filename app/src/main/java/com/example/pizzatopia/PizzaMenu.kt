package com.example.pizzatopia

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_MESSAGE="com.example.pizzatopia.MESSAGE"

class PizzaMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pizza_menu)
    }

    //Pizza Pepperoni
    fun surePepperoni(view: View?) {
        //wiadomość dla zmiennej val SELECTFLAVOUR pobierającej dane z bazy danych
        val menu = "pepperoni"
        val intent = Intent(this, PizzaSize::class.java).apply {
            putExtra(EXTRA_MESSAGE, menu)
        }
        startActivity(intent)
    }

    //Pizza Wiejska
    fun sureWiejska(view: View?) {
        val menu = "wiejska"
        val intent = Intent(this, PizzaSize::class.java).apply {
            putExtra(EXTRA_MESSAGE, menu)
        }
        startActivity(intent)
    }

    //Pizza Kebab
    fun sureKebab(view: View?) {
        val menu = "kebab"
        val intent = Intent(this, PizzaSize::class.java).apply {
            putExtra(EXTRA_MESSAGE, menu)
        }
        startActivity(intent)
    }
}