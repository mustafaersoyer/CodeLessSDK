package com.example.codeless;

import android.util.Log;
import android.widget.Toast;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Codeless {
    public void GetAllData(String dbName,String collectionName){
        ApiInterface apiInterface =
                ApiClient.getRetrofitInstance().create(ApiInterface.class);


        Call<JsonObject> call = apiInterface.getAllData(dbName,collectionName);
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                JsonObject movies = response.body();
                Log.d("tagg",movies.toString());
              //  recyclerView.setAdapter(new MoviesAdapter(movies, R.layout.list_item_movie, getApplicationContext()));
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }
        });

    }
}
