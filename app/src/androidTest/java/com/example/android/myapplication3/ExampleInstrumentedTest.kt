package com.example.android.myapplication3

import androidx.test.InstrumentationRegistry
import androidx.test.runner.AndroidJUnit4
import com.example.android.myapplication3.Model.Book
import com.example.android.myapplication3.Model.BooksAPI
import com.example.android.myapplication3.Presenter.BookPresenter
import com.example.android.myapplication3.View.IBookView
import com.google.gson.GsonBuilder

import org.junit.Test
import org.junit.runner.RunWith
//import org.mockito.Mockito.*
import org.junit.Assert.*
//import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import org.junit.Assert.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(MockitoJUnitRunner::class)
class ExampleInstrumentedTest :IBookView {
    override fun onRecieveBooks(books: ArrayList<Book>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError(msg: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.example.android.myapplication", appContext.packageName)
    }

@Test
fun testRetrofit(){
    val bookPresenter=BookPresenter(this)
    bookPresenter.onSearch("java")


}
}
