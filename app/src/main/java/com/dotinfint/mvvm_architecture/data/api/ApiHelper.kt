package com.dotinfint.mvvm_architecture.data.api

class ApiHelper(private val apiService: ApiService) {

    fun getUsers() = apiService.getUsers()

}