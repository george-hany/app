package com.example.android.myapplication3.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android.myapplication3.Adapter.BooksAdapter
import com.example.android.myapplication3.Model.Book
import com.example.android.myapplication3.Presenter.BookPresenter
import com.example.android.myapplication3.R
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),IBookView {


    lateinit var bookPresenter: BookPresenter
    lateinit var books:ArrayList<Book>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bookPresenter= BookPresenter(this)
        search.setOnClickListener(View.OnClickListener {
            bookPresenter.onSearch(edit.text.toString())
        })

    }



    override fun onError(msg: String) {
        Toasty.success(this,msg,Toast.LENGTH_LONG).show()
    }

    override fun onRecieveBooks(books: ArrayList<Book>) {
        Toasty.success(this,"done",Toast.LENGTH_LONG).show()
        this.books=books


        val adapter=BooksAdapter(this,books)
        books_recycle.layoutManager=LinearLayoutManager(this)
        books_recycle.adapter=adapter
    }

    fun getBook():ArrayList<Book>{
        return books
    }
}
