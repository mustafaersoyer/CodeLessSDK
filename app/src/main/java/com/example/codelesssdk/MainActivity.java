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
    Codeless db = new Codeless("denemeDB");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tw = findViewById(R.id.he);
        JsonObject d = new JsonObject();
        List<JsonObject> b;
        d.addProperty("asda","asxcxcxcxcxcxcöasd");

      //  d.addProperty("deasd","asd");
    //    b=codeless.addData(d,"denemeDB","characters");

        String[] deneme= {"00000","00111000"};
        b = db.collection("characters").getData().lessThan("değer",2);

        tw.setText(b.toString());
    }

}
