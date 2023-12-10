package com.programmingz.a4retrofitapi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MyAdapter(val context: Context, val productList: List<Product>): RecyclerView.Adapter<MyAdapter.viewHolder>() {

    class viewHolder(view: View): RecyclerView.ViewHolder(view){
        val txtTitle: TextView = view.findViewById(R.id.txtTitle)
        val imgImage: ImageView = view.findViewById(R.id.imgImage)
        val txtPrice: TextView = view.findViewById(R.id.txtPrice)
        val txtRating: TextView = view.findViewById(R.id.txtRating)
        val txtDesc: TextView = view.findViewById(R.id.txtDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_item_list, parent, false)
        return viewHolder(view)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val currentItem = productList[position]
        holder.txtTitle.text = currentItem.title
        holder.txtPrice.text = currentItem.price.toString()
        holder.txtRating.text = currentItem.rating.toString()
        holder.txtDesc.text = currentItem.description

        Picasso.get().load(currentItem.thumbnail).into(holder.imgImage)
    }
}