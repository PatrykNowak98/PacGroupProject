package com.example.pizzatopia

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class PizzaSize : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pizza_size)
    }

    //Small size
    fun smallPizza(view: View){
        val intent = Intent(this, PizzaPie::class.java)
        startActivity(intent)
    }

    //Medium size
    fun mediumPizza(view: View){
        val intent = Intent(this, PizzaPie::class.java)
        startActivity(intent)
    }

    //Big size
    fun bigPizza(view: View){
        val intent = Intent(this, PizzaPie::class.java)
        startActivity(intent)
    }
}