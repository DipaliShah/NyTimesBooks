package com.assignment.nytimesbooks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val adapter = BookListAdapter()
        rvBooksList.adapter = adapter

        val viewModel =
            ViewModelProvider(this, BooksViewModelFactory()).get(BooksViewModel::class.java)
        lifecycleScope.launchWhenCreated {
            viewModel.getBooksList()
        }
        viewModel.booksList.observe(this@MainActivity, Observer {
            adapter.submitList(it)
        })
    }
}
