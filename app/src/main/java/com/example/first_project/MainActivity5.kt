package com.example.first_project

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity5 : AppCompatActivity() {
    lateinit var autoCompleteTextView: AutoCompleteTextView
    lateinit var Button : Button
    var countries = arrayOf("Nepal", "India", "Japan", "Korea")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)
        autoCompleteTextView = findViewById(R.id.autoText)

        Button = findViewById(R.id.Button)

        val autocompleteAdapter = ArrayAdapter(this@MainActivity5,
            android.R.layout.simple_dropdown_item_1line,countries)
        autoCompleteTextView.setAdapter(autocompleteAdapter)
        autoCompleteTextView.threshold = 1

        Button.setOnClickListener{
            Toast.makeText(this@MainActivity5,
                "You chose " + autoCompleteTextView.text,
                Toast.LENGTH_LONG).show()
        }

    }
}