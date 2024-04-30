package com.example.first_project

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {
    lateinit var recyclerview : RecyclerView
    var titleList = ArrayList<String>()
    var descriptionList = ArrayList<String>()
    var imageist = ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycler_view)

        recyclerview = findViewById(R.id.recyclerView)
        titleList.add("Bike")
        titleList.add("Scooter")
        titleList.add("Cycle")

        descriptionList.add("This is a bike")
        descriptionList.add("This is a scooter.")
        descriptionList.add("This is a cycle")

        imageist.add(R.drawable.bike)
        imageist.add(R.drawable.scooter)
        imageist.add(R.drawable.cycle)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}