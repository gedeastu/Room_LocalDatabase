package com.example.room.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val id:Int? = 0,

    val firstName: String,
    val lastName: String,
    val age:Int
)