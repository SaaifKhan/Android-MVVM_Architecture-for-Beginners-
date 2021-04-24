package com.dotinfint.mvvm_architecture.data.repository

import com.dotinfint.mvvm_architecture.data.api.ApiHelper
import com.dotinfint.mvvm_architecture.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}