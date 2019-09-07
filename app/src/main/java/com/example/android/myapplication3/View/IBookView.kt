package com.example.android.myapplication3.View

import com.example.android.myapplication3.Model.Book

interface IBookView {
    fun onRecieveBooks(books:ArrayList<Book>)
    fun onError(msg:String)
}