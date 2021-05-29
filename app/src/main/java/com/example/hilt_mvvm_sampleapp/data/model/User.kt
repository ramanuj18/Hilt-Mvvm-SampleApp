package com.example.hilt_mvvm_sampleapp.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json

/**
 * created by Ramanuj Kesharawani on 12/3/21
 */
@Entity(tableName = "user")
data class User(
    @PrimaryKey
    @Json(name = "id")
    val id: Int = 0,
    @Json(name = "name")
    val name: String = "",
    @Json(name = "email")
    val email: String = "",
    @Json(name = "avatar")
    val avatar: String = ""
)