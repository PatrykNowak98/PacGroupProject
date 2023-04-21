package com.example.pizzatopia

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_MESSAGE_2="com.example.pizzatopia.MESSAGE_2"
class PizzaSize : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pizza_size)
    }

    //Small size
    fun smallPizza(view: View){
        //wiadomość dla zmiennej val SELECTFLAVOUR pobierającej dane z bazy danych
        val menu=intent.getStringExtra(EXTRA_MESSAGE)
        //wiadomość dla zmiennej val SELECTSIZE pobierającej dane z bazy danych
        val size = "small"
        val intent = Intent(this, PizzaPie::class.java).apply {
            putExtra(EXTRA_MESSAGE, menu)
            putExtra(EXTRA_MESSAGE_2, size)
        }
        startActivity(intent)

    }

    //Medium size
    fun mediumPizza(view: View){
        val menu=intent.getStringExtra(EXTRA_MESSAGE)
        val size = "medium"
        val intent = Intent(this, PizzaPie::class.java).apply {
            putExtra(EXTRA_MESSAGE, menu)
            putExtra(EXTRA_MESSAGE_2, size)
        }
        startActivity(intent)

    }
    //Big size
    fun bigPizza(view: View){
        val menu=intent.getStringExtra(EXTRA_MESSAGE)
        val size = "big"
        val intent = Intent(this, PizzaPie::class.java).apply {
            putExtra(EXTRA_MESSAGE, menu)
            putExtra(EXTRA_MESSAGE_2, size)
        }
        startActivity(intent)

    }

}