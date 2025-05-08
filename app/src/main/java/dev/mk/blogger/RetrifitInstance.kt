package dev.mk.blogger

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private const val BASE_URL = "https://www.googleapis.com/blogger/v3/blogs/1316783436842027729/"
    private const val API_KEY = "AIzaSyArUR5u-Q-W5-zzskzBiGnw51s6nVJlZQc"

    val api: BlogApi by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(BlogApi::class.java)
    }

    fun getApiKey(): String = API_KEY

}