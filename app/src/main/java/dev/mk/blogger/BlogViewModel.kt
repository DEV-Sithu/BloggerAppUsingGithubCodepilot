package dev.mk.blogger

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class BlogViewModel : ViewModel() {

    private val _posts = MutableLiveData<List<BlogPost>>()
    val posts: LiveData<List<BlogPost>> get() = _posts

    fun fetchPosts() {
        viewModelScope.launch {
            try {
                val response = RetrofitInstance.api.getPosts(RetrofitInstance.getApiKey())
                if (response.isSuccessful) {
                    _posts.value = response.body()?.items ?: emptyList()
                } else {
                    // Handle API error
                }
            } catch (e: Exception) {
                // Handle network or other errors
            }
        }
    }
}