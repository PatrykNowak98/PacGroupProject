package com.example.pizzatopia

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class PizzaPie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pizza_pie)
    }

    //Thin Pie
    fun thinPie(view: View){
        val intent = Intent(this, PizzaRecipies::class.java)
        startActivity(intent)
    }

    //Thick Pie
    fun thickPie(view: View){
        val intent = Intent(this, PizzaRecipies::class.java)
        startActivity(intent)
    }
}