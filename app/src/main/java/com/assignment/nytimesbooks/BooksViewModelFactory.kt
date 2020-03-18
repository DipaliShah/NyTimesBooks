package com.assignment.nytimesbooks

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * Factory for Books [ViewModel]s
 */
class BooksViewModelFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass != BooksViewModel::class.java) {
            throw IllegalArgumentException("Unknown ViewModel class")
        }
        return BooksViewModel() as T
    }
}
