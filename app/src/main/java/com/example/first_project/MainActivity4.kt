package com.example.first_project

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    lateinit var result: TextView
    lateinit var spinner: Spinner
    var language = arrayOf("Nepali", "Chinese", "Japanese","Korean", "Indian")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
        result = findViewById(R.id.textView2)
        spinner = findViewById(R.id.spinner)
        spinner.onItemSelectedListener = this
        var adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item, language
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        if(parent != null){
            result.text = parent.getItemAtPosition(position).toString()
        }
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }

}