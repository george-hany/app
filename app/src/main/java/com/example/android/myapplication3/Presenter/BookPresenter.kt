package com.example.android.myapplication3.Presenter

import com.example.android.myapplication3.Model.BooksAPI
import com.example.android.myapplication3.Model.RootResponse
import com.example.android.myapplication3.View.IBookView
import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class BookPresenter(bookView: IBookView) :IBookPresenter,Callback<RootResponse>{

    val bookView=bookView

    override fun onSearch(word: String) {
        val gson= GsonBuilder().setLenient().create()

        val retrofit= Retrofit.Builder()
            .baseUrl("https://www.googleapis.com/books/v1/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()

        val service=retrofit.create(BooksAPI::class.java)
        service.getBooks(word).enqueue(this)


    }

    override fun onFailure(call: Call<RootResponse>, t: Throwable) {
        bookView.onError(t.message.toString())
    }

    override fun onResponse(call: Call<RootResponse>, response: Response<RootResponse>) {

        bookView.onRecieveBooks(response.body()!!.items!!)

    }

}