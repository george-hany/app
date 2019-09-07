package com.example.android.myapplication3.Model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface BooksAPI {
    @GET("volumes")
    fun getBooks(@Query("q") res:String):Call<RootResponse>
}