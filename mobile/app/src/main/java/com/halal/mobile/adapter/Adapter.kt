package com.halal.mobile.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.halal.mobile.Model
import com.halal.mobile.R

class Adapter (
    val novel: ArrayList<Model.Data>
): RecyclerView.Adapter<Adapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter, parent, false)
    )

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val data = novel[position]
        holder.textJudul.text = data.judul
        holder.textPenulis.text = data.penulis
    }

    override fun getItemCount() = novel.size

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val textJudul = view.findViewById<TextView>(R.id.textjudul)
        val textPenulis = view.findViewById<TextView>(R.id.textpenulis)
    }
    public fun setData(data: List<Model.Data>){
        novel.clear()
        novel.addAll(data)
        notifyDataSetChanged()
    }

}