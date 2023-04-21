package com.example.pizzatopia

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_MESSAGE_3="com.example.pizzatopia.MESSAGE_3"
class PizzaPie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pizza_pie)
    }

    //Thin Pie
    fun thinPie(view: View){
        //wiadomość dla zmiennej val SELECTFLAVOUR pobierającej dane z bazy danych
        val menu=intent.getStringExtra(EXTRA_MESSAGE)
        //wiadomość dla zmiennej val SELECTSIZE pobierającej dane z bazy danych
        val size=intent.getStringExtra(EXTRA_MESSAGE_2)
        //wiadomość dla zmiennej val SELECTPIE pobierającej dane z bazy danych
        val pie = "thin"
        val intent = Intent(this, PizzaRecipies::class.java).apply {
            putExtra(EXTRA_MESSAGE, menu)
            putExtra(EXTRA_MESSAGE_2, size)
            putExtra(EXTRA_MESSAGE_3, pie)
        }
        startActivity(intent)

    }

    //Thick Pie
    fun thickPie(view: View){
        val menu=intent.getStringExtra(EXTRA_MESSAGE)
        val size=intent.getStringExtra(EXTRA_MESSAGE_2)
        val pie = "thick"
        val intent = Intent(this, PizzaRecipies::class.java).apply {
            putExtra(EXTRA_MESSAGE, menu)
            putExtra(EXTRA_MESSAGE_2, size)
            putExtra(EXTRA_MESSAGE_3, pie)
        }
        startActivity(intent)

    }
}