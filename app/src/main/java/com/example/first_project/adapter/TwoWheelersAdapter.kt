package com.example.first_project.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.first_project.R

class TwoWheelersAdapter(var nameList: ArrayList<String>,
                         var imageList: ArrayList<Int>) : BaseAdapter() {
    override fun getCount(): Int {
        return nameList.size;
    }

    override fun getItem(position: Int): Any? {
        return null;
    }

    override fun getItemId(position: Int): Long {
        return 0;
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view : View = LayoutInflater.from(parent?.context).inflate(
            R.layout.sample,parent,
            false)

        
    }


}