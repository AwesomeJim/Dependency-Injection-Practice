package com.app.hiltretrofit.repository

import com.app.hiltretrofit.api.ApiService

class Repository(private val apiService: ApiService) {
    /**
     * ways to define dynamic injection of a token and endpoint
     * @param token String
     * @param endpoint String
     * @return Response<Countries>
     */
    suspend fun getCountries(token: String, endpoint: String) = apiService.getCountries(token,endpoint)
}