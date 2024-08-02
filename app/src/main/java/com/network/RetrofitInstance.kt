package com.network
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
object RetrofitInstance {
    private const val BASE_URL = "https://api.themoviedb.org/3/"

    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val api: MovieApiService by lazy {
        retrofit.create(MovieApiService::class.java)
    }
}