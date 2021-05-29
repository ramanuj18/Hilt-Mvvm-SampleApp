package com.example.hilt_mvvm_sampleapp.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.hilt_mvvm_sampleapp.data.model.User

/**
 * created by Ramanuj Kesharawani on 12/3/21
 */
@Dao
interface UserDao {

    @Insert
    fun insert(user: User): Long

}