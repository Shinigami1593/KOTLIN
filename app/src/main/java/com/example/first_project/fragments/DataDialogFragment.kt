package com.example.first_project.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.first_project.R
import com.example.first_project.databinding.FragmentDataDialogBinding

class DataDialogFragment : DialogFragment() {
    lateinit var dataDialogBinding: FragmentDataDialogBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataDialogBinding = FragmentDataDialogBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment

        dataDialogBinding.cancel.setOnClickListener{
            dialog?.dismiss()
        }
        dataDialogBinding.button6.setOnClickListener{
            var name : String = dataDialogBinding.editTextText3.text.toString()
            var age : Int = dataDialogBinding.editTextText4.text.toString().toInt()

            var baseButtonActivity : BaseButtonActivity = activity as BaseButtonActivity

            dialog?.dismiss()
        }
        return dataDialogBinding.root
    }
}