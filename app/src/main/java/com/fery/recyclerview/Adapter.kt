package com.fery.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fery.recyclerview.databinding.RvItemBinding

class Adapter(var context: Context, var list: List<User>): RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder(var binding: RvItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RvItemBinding.inflate(LayoutInflater.from(context),parent, false)
        return ViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.binding.name.text= list.get(position).name
       holder.binding.email.text= list.get(position).email
       holder.binding.sub.text= list.get(position).sub
       holder.binding.birthdate.text= list.get(position).birthdate
    }

}