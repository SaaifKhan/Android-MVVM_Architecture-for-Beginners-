package com.dotinfint.mvvm_architecture.data.api

import com.dotinfint.mvvm_architecture.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>

}