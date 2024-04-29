package com.example.first_project

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var radioButtonBike : RadioButton
    lateinit var radioButtonScooter : RadioButton
    lateinit var radioButtonCycle : RadioButton
    lateinit var imageView : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        radioButtonBike = findViewById(R.id.radioButtonBike)
        radioButtonScooter = findViewById(R.id.radioButtonScooter)
        radioButtonCycle = findViewById(R.id.radioButtonCycle)
        imageView = findViewById(R.id.imageView2)

        radioButtonBike.setOnClickListener{
            imageView.setImageResource(R.drawable.bike)
        }
        radioButtonScooter.setOnClickListener{
            imageView.setImageResource(R.drawable.scooter)
        }
        radioButtonCycle.setOnClickListener{
            imageView.setImageResource(R.drawable.cycle)
        }
    }
}