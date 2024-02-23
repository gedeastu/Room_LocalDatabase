package com.example.room.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.room.model.Contact

@Database(
    entities = [Contact::class],
    version = 1
)
abstract class ContactDatabase : RoomDatabase() {
    abstract val dao: ContactDao
}