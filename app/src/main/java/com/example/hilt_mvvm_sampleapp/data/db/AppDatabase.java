package com.example.hilt_mvvm_sampleapp.data.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.hilt_mvvm_sampleapp.data.db.dao.UserDao;
import com.example.hilt_mvvm_sampleapp.data.model.User;

import org.jetbrains.annotations.NotNull;

@Database(entities = {User.class},version = 1,exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
        @NotNull
        public static final String DB_NAME="app_db";

        public abstract UserDao userDao();
}