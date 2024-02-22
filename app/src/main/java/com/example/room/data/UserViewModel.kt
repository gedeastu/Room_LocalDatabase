package com.example.room.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserViewModel(application: Application): AndroidViewModel(application = application) {
    private val readAllData: LiveData<List<UserEntity>>
    private val repository: UserRepository
    init {
        val userDao = UserDatabase.getDatabase(application).userDao()
        repository = UserRepository(userDao)
        readAllData = repository.readAllData
    }

    fun addUser(userData:UserEntity){
        viewModelScope.launch(Dispatchers.IO){
            repository.addUser(userData)
        }
    }
}