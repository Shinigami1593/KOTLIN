package com.example.first_project

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity3 : AppCompatActivity() {
    lateinit var checkBoxToast: CheckBox
    lateinit var checkBoxSnackBar: CheckBox
    lateinit var checkBoxAlert: CheckBox
    lateinit var main : ConstraintLayout
    lateinit var Button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        checkBoxToast = findViewById(R.id.Toast)
        checkBoxSnackBar = findViewById(R.id.Snackbar)
        checkBoxAlert = findViewById(R.id.Alert)
        main = findViewById(R.id.main)
        Button = findViewById(R.id.button)

        Button.setOnClickListener{
            if(checkBoxToast.isChecked){
                Toast.makeText(this,"This is toast message.",
                    Toast.LENGTH_LONG).show()
            }else if(checkBoxSnackBar.isChecked){
                Snackbar.make(main, "This is SnackBar message.",
                    Snackbar.LENGTH_LONG).show()
            }else if(checkBoxAlert.isChecked){
//                Alert.make(main, "This is Alert message.",Snackbar.LENGTH_LONG).show()
                AlertDialog.Builder(this@MainActivity3).setTitle("Confirm").setMessage("Are you sure?").create().show()
            }
        }
    }
}