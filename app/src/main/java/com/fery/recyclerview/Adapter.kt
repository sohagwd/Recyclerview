package com.fery.recyclerview

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fery.recyclerview.databinding.RvItemBinding

class Adapter(var context: Context, list: List<User>): RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder(var binding: RvItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view= layoutInflater.from(context).inflate(R.layout.rv_item, parent,attachToRoot:false)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}