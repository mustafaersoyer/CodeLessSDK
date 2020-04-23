package com.example.codelesssdk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


import com.example.codeless.Codeless;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Codeless codeless = new Codeless();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tw = findViewById(R.id.he);
        JsonObject d = new JsonObject();
        JsonObject b;
        d.addProperty("asda","asdasdxcvbnmöasd");

      //  d.addProperty("deasd","asd");
    //    b=codeless.addData(d,"denemeDB","characters");


        try {
            codeless.updateData("00111000",d,"denemeDB","characters");
        } catch (IOException e) {
            e.printStackTrace();
            Log.d("updatefail",e.getMessage());
        }
        //tw.setText(b.toString());
    }

}
