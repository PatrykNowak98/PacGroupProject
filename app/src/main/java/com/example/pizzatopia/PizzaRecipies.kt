package com.example.pizzatopia

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class PizzaRecipies : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pizza_recipies)

        // Pobierz referencję do textView z widoku
        val textView = findViewById<TextView>(R.id.textView)

        // Tworzymy instancję SQLiteHelper
        val dbHelper = SQLiteHelper(this)
        //wiadomości dla zmiennych pobierających dane z bazy danych
        val menu = intent.getStringExtra(EXTRA_MESSAGE)

        val size = intent.getStringExtra(EXTRA_MESSAGE_2)

        val pie = intent.getStringExtra(EXTRA_MESSAGE_3)

        // Wywołujemy funkcję getRecipe() z podanymi smakiem, rozmiarem i grubością ciasta
        val SELECTFLAVOUR = menu?: "pepperoni"

        val SELECTSIZE = size?: "big"

        val SELECTPIE = pie?: "thin"

        val recipe = dbHelper.getRecipe(SELECTFLAVOUR, SELECTSIZE, SELECTPIE)
        //powiadomienie w razie błędu, tzn. jeśli baza nie znajdzie takich danych
        if (recipe.isNullOrEmpty()) {
            Toast.makeText(
                this,
                "Nie znaleziono przepisu dla tego smaku i rozmiaru",
                Toast.LENGTH_SHORT
            ).show()
        } else {
            textView.text = recipe
        }
    }
}
