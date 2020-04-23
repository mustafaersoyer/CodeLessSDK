package com.example.codeless;

import android.util.Log;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Codeless {
    private List<JsonObject> data;
    private List<JsonObject> addedData;
    ApiInterface api =
            ApiClient.getInstance().create(ApiInterface.class);

    private String username;
    public Codeless(String username){
        this.username=username;
    }


    public List<JsonObject> getAllData(String collectionName) {
        Call<List<JsonObject>> call = api.getAllData(username,collectionName);
        call.enqueue(new Callback<List<JsonObject>>() {
            @Override
            public void onResponse(Call<List<JsonObject>> call, Response<List<JsonObject>> response) {
                data = response.body();
            }

            @Override
            public void onFailure(Call<List<JsonObject>> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }
        });




        return data;
    }
    public List<JsonObject> getAllDataSync(String collectionName) {

        Call<List<JsonObject>> call = api.getAllData(username,collectionName);
        Response<List<JsonObject>> response = null;
        try {
            response = call.execute();
            data = response.body();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
    public JsonObject addData(JsonObject model, String collectionName){
        String body = model.toString();
        Call<List<JsonObject>> call = api.addModel(body,username,collectionName);
        call.enqueue(new Callback<List<JsonObject>>() {
            @Override
            public void onResponse(Call<List<JsonObject>> call, Response<List<JsonObject>> response) {
                addedData = response.body();
            }

            @Override
            public void onFailure(Call<List<JsonObject>> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }
        });
        return addedData.get(0);
    }
    public void deleteData(int id,  String collectionName) throws IOException {
        Call call = api.delete(id,username,collectionName);
        call.execute();
    }
    public void updateData(String id, JsonObject model, String collectionName) throws IOException {
        model.addProperty("_id",id);
        String body = model.toString();
        Call call = api.updateModel(id,body,username,collectionName);
        call.enqueue(new Callback<List<JsonObject>>() {
            @Override
            public void onResponse(Call<List<JsonObject>> call, Response<List<JsonObject>> response) {
                addedData = response.body();
            }

            @Override
            public void onFailure(Call<List<JsonObject>> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }
        });
    }
}
