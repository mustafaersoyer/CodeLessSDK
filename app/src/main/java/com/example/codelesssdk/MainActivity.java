package com.example.codelesssdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.codeless.Codeless;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Codeless codeless = new Codeless();
        codeless.GetAllData("denemeDB","characters");
    }
}
