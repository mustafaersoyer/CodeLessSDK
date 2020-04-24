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
    private String collectionName;

    public Codeless(String username){
        this.username=username;
    }
    public Codeless collection(String collectionName){
        this.collectionName=collectionName;
        return this;
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


    public Codeless getData()
    {
        return this;
    }
    public List<JsonObject> whereEqualTo(String colon,Object value) {
        Call<List<JsonObject>> call = api.getDataEqual(username, collectionName,colon,value);
       /* call.enqueue(new Callback<List<JsonObject>>() {
            @Override
            public void onResponse(Call<List<JsonObject>> call, Response<List<JsonObject>> response) {
                data = response.body();
            }

            @Override
            public void onFailure(Call<List<JsonObject>> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }
        });*/
        Response<List<JsonObject>> response = null;
        try {
            response = call.execute();
            data = response.body();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }


    public List<JsonObject> whereNotEqualTo(String colon,Object value) {
        Call<List<JsonObject>> call = api.getDataNotEqual(username, collectionName,colon,value);
       /* call.enqueue(new Callback<List<JsonObject>>() {
            @Override
            public void onResponse(Call<List<JsonObject>> call, Response<List<JsonObject>> response) {
                data = response.body();
            }

            @Override
            public void onFailure(Call<List<JsonObject>> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }
        });*/
        Response<List<JsonObject>> response = null;
        try {
            response = call.execute();
            data = response.body();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public List<JsonObject> whereEqualToMany(String colon,Object[] value) {
        Call<List<JsonObject>> call = api.getDataEqualMany(username, collectionName,colon,value);
       /* call.enqueue(new Callback<List<JsonObject>>() {
            @Override
            public void onResponse(Call<List<JsonObject>> call, Response<List<JsonObject>> response) {
                data = response.body();
            }

            @Override
            public void onFailure(Call<List<JsonObject>> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }
        });*/
        Response<List<JsonObject>> response = null;
        try {
            response = call.execute();
            data = response.body();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public List<JsonObject> whereNotEqualToMany(String colon,Object[] value) {
        Call<List<JsonObject>> call = api.getDataNotEqualMany(username, collectionName,colon,value);
       /* call.enqueue(new Callback<List<JsonObject>>() {
            @Override
            public void onResponse(Call<List<JsonObject>> call, Response<List<JsonObject>> response) {
                data = response.body();
            }

            @Override
            public void onFailure(Call<List<JsonObject>> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }
        });*/
        Response<List<JsonObject>> response = null;
        try {
            response = call.execute();
            data = response.body();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }



    public List<JsonObject> greaterThan(String colon,int value) {
        Call<List<JsonObject>> call = api.getDataGt(username, collectionName,colon,value);
       /* call.enqueue(new Callback<List<JsonObject>>() {
            @Override
            public void onResponse(Call<List<JsonObject>> call, Response<List<JsonObject>> response) {
                data = response.body();
            }

            @Override
            public void onFailure(Call<List<JsonObject>> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }
        });*/
        Response<List<JsonObject>> response = null;
        try {
            response = call.execute();
            data = response.body();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public List<JsonObject> greaterThanEqual(String colon,int value) {
        Call<List<JsonObject>> call = api.getDataGt(username, collectionName,colon,value);
       /* call.enqueue(new Callback<List<JsonObject>>() {
            @Override
            public void onResponse(Call<List<JsonObject>> call, Response<List<JsonObject>> response) {
                data = response.body();
            }

            @Override
            public void onFailure(Call<List<JsonObject>> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }
        });*/
        Response<List<JsonObject>> response = null;
        try {
            response = call.execute();
            data = response.body();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public List<JsonObject> lessThan(String colon,int value) {
        Call<List<JsonObject>> call = api.getDataLte(username, collectionName,colon,value);
       /* call.enqueue(new Callback<List<JsonObject>>() {
            @Override
            public void onResponse(Call<List<JsonObject>> call, Response<List<JsonObject>> response) {
                data = response.body();
            }

            @Override
            public void onFailure(Call<List<JsonObject>> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }
        });*/
        Response<List<JsonObject>> response = null;
        try {
            response = call.execute();
            data = response.body();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
    




    public List<JsonObject> lessThanEqual(String colon,int value) {
        Call<List<JsonObject>> call = api.getDataLte(username, collectionName,colon,value);
       /* call.enqueue(new Callback<List<JsonObject>>() {
            @Override
            public void onResponse(Call<List<JsonObject>> call, Response<List<JsonObject>> response) {
                data = response.body();
            }

            @Override
            public void onFailure(Call<List<JsonObject>> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }
        });*/
        Response<List<JsonObject>> response = null;
        try {
            response = call.execute();
            data = response.body();

        } catch (IOException e) {
            e.printStackTrace();
        }
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
