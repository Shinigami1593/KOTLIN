package com.example.first_project

import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.first_project.adapter.TwoWheelersAdapter

class GridViewActivity : AppCompatActivity() {
    lateinit var gridView : GridView
    var nameList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_grid_view)

        gridView = findViewById(R.id.grid)

        fillArray()

        var adapter = TwoWheelersAdapter(nameList,imageList)
        gridView.adapter = adapter

    }

    fun fillArray() {
        nameList.add("Bike")
        nameList.add("Cycle")
        nameList.add("Scooter")

        imageList.add(R.drawable.bike)
        imageList.add(R.drawable.cycle)
        imageList.add(R.drawable.scooter)
    }
}