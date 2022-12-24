package com.uzb7.imo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.uzb7.imo.R
import com.uzb7.imo.model.Imo

class ImoAdapter(val list:ArrayList<Imo>): RecyclerView.Adapter<ImoAdapter.ImoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImoViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_imo,parent,false)
        return ImoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImoViewHolder, position: Int) {
        val post=list[position]
        holder.apply {
            tvFullName.text=post.fulName
            tvMessage.text=post.xabar
            tvTime.text=post.time
            Glide.with(ivProfile).load(post.profileUrl).into(ivProfile)
            if(post.online){
                ivOnline.visibility=View.VISIBLE
            }else{
                ivOnline.visibility=View.INVISIBLE
            }

        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
    class ImoViewHolder(view: View):RecyclerView.ViewHolder(view){
        val ivProfile=view.findViewById<ImageView>(R.id.iv_profile)
        val ivOnline=view.findViewById<ImageView>(R.id.iv_online)
        val tvFullName=view.findViewById<TextView>(R.id.tv_name)
        val tvMessage=view.findViewById<TextView>(R.id.tv_message)
        val tvTime=view.findViewById<TextView>(R.id.tv_time)
    }
}