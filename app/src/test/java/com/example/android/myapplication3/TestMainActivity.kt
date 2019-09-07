package com.example.android.myapplication3

import com.example.android.myapplication3.Model.Book
import com.example.android.myapplication3.Presenter.BookPresenter
import com.example.android.myapplication3.View.MainActivity
import org.hamcrest.core.Is.`is`
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.runners.MockitoJUnitRunner
import org.mockito.Mockito.*
import org.junit.Assert.*

@RunWith(MockitoJUnitRunner::class)
class TestMainActivity {
    @Mock
    lateinit var bookPresenter: BookPresenter
    var books= spy(ArrayList<Book>())

    @Test
    fun testGetBooks() {
//        `when`(bookPresenter.onSearch("java"))
    }
}
