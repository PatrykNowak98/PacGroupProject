package com.example.pizzatopia

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.sql.Connection
import java.sql.ResultSet
import java.sql.Statement
import java.util.jar.Attributes.Name

class PizzaRecipies : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pizza_recipies)



        val textView = findViewById<TextView>(R.id.textView)
        val c = ConSQL()
        val connection: Connection = c.conclass()
        if (c != null)
        {
            val sqlstatement="SELECT * FROM RECIPE"
            val smt = connection.createStatement()
            val set=smt.executeQuery(sqlstatement);
            while (set.next())
            {
                textView.setText(set.getString(2));
            }
            connection.close();
        }
    }
}