package com.example.first_project

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ListViewActivity : AppCompatActivity() {
    lateinit var listView : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)

        listView = findViewById(R.id.listview)
        var data = resources.getStringArray(R.array.Country)
        var adapter = ArrayAdapter(this@ListViewActivity,
            android.R.layout.simple_list_item_1,data)

        listView.adapter = adapter
        listView.setOnItemClickListener{adapterView, view, index, l ->
            Toast.makeText(applicationContext,
                adapterView.getItemAtPosition(index).toString(),
                Toast.LENGTH_LONG).show()
        }

    }


}