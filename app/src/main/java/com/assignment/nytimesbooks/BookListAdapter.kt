package com.assignment.nytimesbooks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.assignment.nytimesbooks.api.Book
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade
import com.bumptech.glide.request.transition.DrawableCrossFadeTransition
import com.google.android.material.button.MaterialButton
import com.google.android.material.imageview.ShapeableImageView
import kotlinx.android.extensions.LayoutContainer


private val BookDiff = object : DiffUtil.ItemCallback<Book>() {
    override fun areItemsTheSame(oldItem: Book, newItem: Book): Boolean {
        return oldItem.rank == newItem.rank
    }

    override fun areContentsTheSame(oldItem: Book, newItem: Book): Boolean {
        return oldItem == newItem
    }

}

class BookListAdapter : ListAdapter<Book, BookViewHolder>(BookDiff) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val item = getItem(position)

        holder.tvHeader.text = item.title
        holder.tvSubTitle.text = item.author

        Glide.with(holder.ivBookCover)
            .load(item.bookImage)
            .transition(withCrossFade())
            .into(holder.ivBookCover)

    }


}

class BookViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
    LayoutContainer {

    val tvHeader = containerView.findViewById<TextView>(R.id.tvHeader)
    val tvSubTitle = containerView.findViewById<TextView>(R.id.tvSubTitle)
    val ratingBar = containerView.findViewById<RatingBar>(R.id.ratingBar)
    val btnBookDetail = containerView.findViewById<Button>(R.id.btnBookDetail)
    val ivBookCover = containerView.findViewById<ShapeableImageView>(R.id.ivBookCover)
}
