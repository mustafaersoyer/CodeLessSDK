package com.example.codeless;

import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("Data/GetModelList")
    Call<List<JsonObject>> getAllData(@Query("username") String dbName, @Query("collectionName") String collectionName);

    @POST("Data/AddModel")
    Call<List<JsonObject>> addModel(@Body String body,@Query("username") String dbName, @Query("collectionName") String collectionName);


    @DELETE("Data/DeleteModel")
    Call<JsonObject> delete(@Query("id") int id,@Query("username") String username, @Query("collectionName") String collectionName);

    @PUT("Data/UpdateModel")
    Call<List<JsonObject>>  updateModel(@Query("id") String id,@Body String body,@Query("username") String username, @Query("collectionName") String collectionName);
}
