package com.example.pizzatopia

import android.annotation.SuppressLint
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import java.io.FileOutputStream

class SQLiteHelper(private val context: Context) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    companion object {
        private const val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "pizzaDB.db"
        private const val TBL_PIZZA = "RECIPE"
        private const val FLAVOUR = "flavour"
        private const val SIZE = "size"
        private const val PIE = "pie"
        private const val RECIPE = "recipe"
        }

    override fun onCreate(db: SQLiteDatabase) {
    }


    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

    @SuppressLint("Range")
    fun getRecipe(selectFlavour: String, selectSize: String, selectPie: String): String? {
        copyDatabaseFile()
        val db = readableDatabase
        val selectRecipe = ("SELECT $RECIPE FROM $TBL_PIZZA WHERE $FLAVOUR ='$selectFlavour' AND $SIZE = '$selectSize' AND $PIE = '$selectPie'")
        val cursor = db.rawQuery(selectRecipe, null)
        var recipe: String? = null
        if (cursor.moveToFirst()) {
            recipe = cursor.getString(cursor.getColumnIndex(RECIPE))
        }
        cursor.close()
        db.close()
        return recipe
    }

    private fun copyDatabaseFile() {
        val inputStream = context.assets.open("pizzaDB.db")
        val outputPath = context.getDatabasePath(DATABASE_NAME).path
        val outputStream = FileOutputStream(outputPath)
        val buffer = ByteArray(1024)
        var length: Int
        while (inputStream.read(buffer).also { length = it } > 0) {
            outputStream.write(buffer, 0, length)
        }
        outputStream.flush()
        outputStream.close()
        inputStream.close()
    }
}