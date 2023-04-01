package com.example.pizzatopia

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SpicyPizzas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.spicy_levels)
    }

    // Classic
    fun classic(view: View){
        val intent = Intent(this, PizzaSize::class.java)
        startActivity(intent)
    }

    // With peperoni
    fun peperoni(view: View){
        val intent = Intent(this, PizzaSize::class.java)
        startActivity(intent)
    }

    // With Jalapeno
    fun jalapeno(view: View){
        val intent = Intent(this, PizzaSize::class.java)
        startActivity(intent)
    }

}