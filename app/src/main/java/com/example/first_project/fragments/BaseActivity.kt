package com.example.first_project.fragments

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.first_project.R
import com.example.first_project.databinding.ActivityBaseBinding

class BaseActivity : AppCompatActivity() {
    lateinit var bind : ActivityBaseBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        bind = ActivityBaseBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.btnFragment1.setOnClickListener{
            var fragmentManager:FragmentManager = supportFragmentManager
            var fragmentTransaction:FragmentTransaction= fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frag,FlankFragment())
            fragmentTransaction.commit()
        }
        bind.btnFragment2.setOnClickListener{
            var fragmentManager:FragmentManager = supportFragmentManager
            var fragmentTransaction:FragmentTransaction= fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frag,SecondFragment())
            fragmentTransaction.commit()
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}