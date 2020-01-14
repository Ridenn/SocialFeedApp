package com.example.socialfeed

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.socialfeed.model.PostTypeText

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val posts = mutableListOf<PostTypeText>()
        posts.add(PostTypeText("Esse é o 1º post", "14 de Janeiro, 2020"))
        for(i in 1..24) {
            posts.add(PostTypeText("Fiz algo legal hoje. Confira!", "14 de Janeiro, 2020"))
        }

        postsRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = PostsAdapter(posts)
        }

    }
}
