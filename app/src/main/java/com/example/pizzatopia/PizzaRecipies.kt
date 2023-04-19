package com.example.pizzatopia

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PizzaRecipies : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pizza_recipies)

        // Pobierz referencję do textView z widoku
        val textView = findViewById<TextView>(R.id.textView)

        // Tworzymy instancję SQLiteHelper
        val dbHelper = SQLiteHelper(this)
        // Wywołujemy funkcję getRecipe() z podanymi smakiem i ostrością
        val SELECTFLAVOUR = "pepperoni"
        val SELECTSPICY = "wasabi"
        val recipe = dbHelper.getRecipe(SELECTFLAVOUR, SELECTSPICY)
        // Wyświetlamy wynik w textView
        textView.text = recipe
    }
}
