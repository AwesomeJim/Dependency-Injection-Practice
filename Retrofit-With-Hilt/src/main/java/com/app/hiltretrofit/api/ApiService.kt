package com.app.hiltretrofit.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface ApiService {
    @GET("region/{endPoint}") //europe
    suspend fun getCountries(@Header("Authorization") token:String, @Path("endPoint") endPoint: String): Response<Countries>
}