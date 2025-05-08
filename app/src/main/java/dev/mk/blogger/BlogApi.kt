package dev.mk.blogger

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface BlogApi {
    @GET("posts")
    suspend fun getPosts(@Query("key") apiKey: String): Response<BlogResponse>

    @GET("posts/{id}")
    suspend fun getPost(@Path("id") id: Int): BlogPost
}