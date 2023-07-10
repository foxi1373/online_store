package com.foxi.data

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.QueryMap

interface MarketService {
    @GET("customers")
    fun getCustomer(@QueryMap filters : Map<String, String>) : Response<String>

    @POST("customers")
    fun postCustomer(@QueryMap filters : Map<String, String>) : Response<String>
}