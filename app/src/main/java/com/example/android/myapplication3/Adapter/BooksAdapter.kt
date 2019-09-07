package com.example.android.myapplication3.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android.myapplication3.R
import com.example.android.myapplication3.Model.Book
import kotlinx.android.synthetic.main.book_item.view.*

class BooksAdapter (context:Context,books:ArrayList<Book>) :RecyclerView.Adapter<BooksAdapter.Holder>(){
    val context=context
    val books=books
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val v = LayoutInflater.from(context).inflate(R.layout.book_item,parent,false)
        val h = Holder(v)
        return h
    }

    override fun getItemCount(): Int =  books.size

    override fun onBindViewHolder(holder: Holder, index: Int) {
        holder.title.setText(books.get(index).volumeInfo.title)
        holder.authors.setText(books?.get(index)?.volumeInfo?.authors!![0]+"")
        holder.publishedDate.setText(books.get(index).volumeInfo.publishedDate)
        Glide.with(context).load("http://books.google.com/books/content?id=${books.get(index).id}&printsec=frontcover&img=1&zoom=1&source=gbs_api").into(holder.book_image)


    }

    class Holder(view: View) :RecyclerView.ViewHolder(view) {
        val book_image=view.book_image
        val title =view.title
        val authors=view.authors
        val publishedDate=view.publishedDate

    }

}