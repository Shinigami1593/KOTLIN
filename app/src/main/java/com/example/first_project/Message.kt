package com.example.first_project

import android.content.SharedPreferences
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.CheckBox
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.first_project.databinding.ActivityMessageBinding

class Message : AppCompatActivity() {
    lateinit var messageBinding: ActivityMessageBinding
    lateinit var sharedPreferences: SharedPreferences

    var username : String? = null
    var message : String? = null
    var remember : Boolean = false
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_message)

        messageBinding = ActivityMessageBinding.inflate(layoutInflater)
        var view = messageBinding.root
        setContentView(view)

//        messageBinding.main
        messageBinding.btn.setOnClickListener{
            counter++
            messageBinding.btn.text = counter.toString()

        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


    override fun onStart() {
        Log.d("Message","onStart called")
        super.onStart()
    }

    override fun onPause() {
        Log.d("Message","onPause called")
        sharedPreferences = getSharedPreferences("userdata", MODE_PRIVATE)

        username = messageBinding.username.text.toString()
        message = messageBinding.message.text.toString()
        remember = messageBinding.checkBox.isChecked

        var editor =sharedPreferences.edit()
        editor.putString("username", username)
        editor.putString("message", message)
        editor.putBoolean("remember", remember)
        editor.putInt("counter", counter)

        editor.apply()

        Toast.makeText(applicationContext,"Data Saved",Toast.LENGTH_LONG).show()


        super.onPause()
    }

    override fun onStop() {
        Log.d("Message","onStop called")
        super.onStop()
    }

    override fun onResume() {
        Log.d("Message","onResume called")
        sharedPreferences = getSharedPreferences("userdata", MODE_PRIVATE)
        username = sharedPreferences.getString("username","")
        message = sharedPreferences.getString("message","")
        remember = sharedPreferences.getBoolean("remember",false)
        counter = sharedPreferences.getInt("remember",0)

        messageBinding.username.setText(username)
        messageBinding.message.setText(message)
        messageBinding.checkBox.isChecked = remember
        messageBinding.btn.text = counter.toString()

        super.onResume()
    }

    override fun onDestroy() {
        Log.d("Message","onDestroy called")

        super.onDestroy()
    }

    override fun onRestart() {
        Log.d("Message","onRestart called")
        super.onRestart()
    }
}