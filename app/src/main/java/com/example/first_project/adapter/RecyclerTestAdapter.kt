package com.example.first_project.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.first_project.R

class RecyclerTestAdapter(
    var titleList: ArrayList<String>,
    var descriptionList: ArrayList<String>,
    var imageList: ArrayList<Int>,
    var context: Context

) : RecyclerView.Adapter<RecyclerTestAdapter.TwoWheelersViewHolder>() {
    class TwoWheelersViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var image : ImageView = view.findViewById(R.id.imageView3)
        var title : TextView = view.findViewById(R.id.textView4)
        var description : TextView = view.findViewById(R.id.textView5)
        var card : CardView = view.findViewById(R.id.cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwoWheelersViewHolder {
        var view : View = LayoutInflater.from(parent.context).inflate(R.layout.sample_recycler_view_design,parent,false)

        return TwoWheelersViewHolder(view)
    }

    override fun getItemCount(): Int {
        return titleList.size
    }

    override fun onBindViewHolder(holder: TwoWheelersViewHolder, position: Int) {
        holder.image.setImageResource(imageList[position])
        holder.title.text = titleList[position]
        holder.description.text = descriptionList[position]
        holder.card.setOnClickListener{
            Toast.makeText(context, titleList[position].toString(),Toast.LENGTH_LONG).show()
        }
    }

}