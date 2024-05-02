package com.example.first_project.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.first_project.R

class RecyclerTestAdapter(
    var titleList: ArrayList<String>,
    var descriptionList: ArrayList<String>,
    var imageist: ArrayList<Int>
) {
    class TwoWheelersViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var image : ImageView = view.findViewById(R.id.imageView3)
        var title : TextView = view.findViewById(R.id.textView4)
        var description : TextView = view.findViewById(R.id.textView5)
    }

}