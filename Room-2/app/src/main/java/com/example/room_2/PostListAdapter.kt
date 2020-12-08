package com.example.room_2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class PostListAdapter(val post: ArrayList<Post> , val context: Context): RecyclerView.Adapter<PostListAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_content, parent, false)

        return MyViewHolder(view,context)
    }

    override fun getItemCount(): Int {
        return post.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val post = post.get(position)
        holder.postTittle.text = post.title
    }

    class MyViewHolder(view: View, context: Context) : RecyclerView.ViewHolder(view){
        var postTittle : TextView = view.findViewById(R.id.post_title)

        init {
            view.setOnClickListener(){
                it.findNavController().navigate(R.id.action_thirdFragment2_to_secondFragment)
            }
        }
    }

}