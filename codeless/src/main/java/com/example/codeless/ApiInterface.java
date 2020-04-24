package com.example.codeless;

import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("Data/GetModelList")
    Call<List<JsonObject>> getAllData(@Query("username") String dbName, @Query("collectionName") String collectionName);

    @GET("Data/GetModelListEqual")
    Call<List<JsonObject>> getDataEqual(@Query("username") String dbName, @Query("collectionName") String collectionName,@Query("colon") String colon, @Query("value") Object value);

    @GET("Data/GetModelListNotEqual")
    Call<List<JsonObject>> getDataNotEqual(@Query("username") String dbName, @Query("collectionName") String collectionName,@Query("colon") String colon, @Query("value") Object value);

    @GET("Data/GetModelListLt")
    Call<List<JsonObject>> getDataLt(@Query("username") String dbName, @Query("collectionName") String collectionName,@Query("colon") String colon, @Query("value") int value);

    @GET("Data/GetModelListLte")
    Call<List<JsonObject>> getDataLte(@Query("username") String dbName, @Query("collectionName") String collectionName,@Query("colon") String colon, @Query("value") int value);

    @GET("Data/GetModelListGt")
    Call<List<JsonObject>> getDataGt(@Query("username") String dbName, @Query("collectionName") String collectionName,@Query("colon") String colon, @Query("value") int value);

    @GET("Data/GetModelListGte")
    Call<List<JsonObject>> getDataGte(@Query("username") String dbName, @Query("collectionName") String collectionName,@Query("colon") String colon, @Query("value") int value);

    @POST("Data/GetModelListEqualMany")
    Call<List<JsonObject>> getDataEqualMany(@Query("username") String dbName, @Query("collectionName") String collectionName,@Query("colon") String colon, @Body Object[] value);

    @POST("Data/GetModelListNotEqualMany")
    Call<List<JsonObject>> getDataNotEqualMany(@Query("username") String dbName, @Query("collectionName") String collectionName,@Query("colon") String colon, @Body Object[] value);


    @POST("Data/AddModel")
    Call<List<JsonObject>> addModel(@Body String body,@Query("username") String dbName, @Query("collectionName") String collectionName);


    @DELETE("Data/DeleteModel")
    Call<JsonObject> delete(@Query("id") int id,@Query("username") String username, @Query("collectionName") String collectionName);

    @PUT("Data/UpdateModel")
    Call<List<JsonObject>>  updateModel(@Query("id") String id,@Body String body,@Query("username") String username, @Query("collectionName") String collectionName);
}
