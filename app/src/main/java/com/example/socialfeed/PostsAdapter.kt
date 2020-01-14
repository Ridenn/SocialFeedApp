package com.example.socialfeed

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.socialfeed.model.PostTypeText
import kotlinx.android.synthetic.main.post_row.view.*

class PostsAdapter(private val posts: List<PostTypeText>) : RecyclerView.Adapter<PostsAdapter.ViewHolder>() {

    class ViewHolder(val view : View) : RecyclerView.ViewHolder(view){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = posts.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.view.mainText.text = posts[position].text
    }
}