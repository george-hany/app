package com.example.android.myapplication3.Model

import com.google.gson.annotations.SerializedName

class RootResponse {
    @SerializedName("items")
    lateinit var items: ArrayList<Book>
}