package com.example.simpletourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class logo extends AppCompatActivity {

    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
        getSupportActionBar().hide();


        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(logo.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        },2500);

    }

}
