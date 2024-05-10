package com.example.first_project.fragments

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentManager
import com.example.first_project.R
import com.example.first_project.databinding.ActivityBaseButtonBinding

class BaseButtonActivity : AppCompatActivity() {
    lateinit var binding : ActivityBaseButtonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityBaseButtonBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.Btn.setOnClickListener{
            var fragmentManager : FragmentManager = supportFragmentManager

            var dataDialogFragment = DataDialogFragment()

            dataDialogFragment.show(fragmentManager,"DataDialogFragment")

        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        fun setData(username: String, age:Int){
            binding.text1.text = username
            binding.Text2.text = age.toString()



        }
    }
}