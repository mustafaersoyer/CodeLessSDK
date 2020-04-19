package com.example.codeless;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("/Data/GetModelList")
    Call<JsonObject> getAllData(@Query("dbName") String dbName,@Query("collectionName") String collectionName);
}
