package com.example.hilt_mvvm_sampleapp.data.api

import com.example.hilt_mvvm_sampleapp.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): Response<List<User>>
}
