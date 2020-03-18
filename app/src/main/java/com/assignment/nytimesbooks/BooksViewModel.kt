package com.assignment.nytimesbooks

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.assignment.nytimesbooks.api.Book
import com.assignment.nytimesbooks.util.WsUtil
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class BooksViewModel : ViewModel() {

    val booksList = MutableLiveData<List<Book>>()


    fun getBooksList() {
        viewModelScope.launch {
            val data = withContext(Dispatchers.IO) {
                WsUtil.getClient().getBooks(BuildConfig.API_KEY)
            }
            if (data.isSuccessful) {
                if (data.body() != null && data.body()?.results != null)
                    booksList.postValue(data.body()?.results!!.books)
            }
        }
    }

}