package com.example.hilt_mvvm_sampleapp.data.repository

import com.example.hilt_mvvm_sampleapp.data.api.ApiService
import com.example.hilt_mvvm_sampleapp.data.db.AppDatabase
import javax.inject.Inject

/**
 * created by Ramanuj Kesharawani on 12/3/21
 */

class MainRepository @Inject constructor(private val apiService: ApiService, private var appDatabase: AppDatabase) {

    suspend fun getUsers() = apiService.getUsers()
}