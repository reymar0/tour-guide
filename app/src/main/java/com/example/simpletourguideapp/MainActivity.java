package com.example.simpletourguideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView ics, coeng, cbpa, cas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ics = findViewById(R.id.ics);
        coeng = findViewById(R.id.coeng);
        cbpa = findViewById(R.id.cbpa);
        cas = findViewById(R.id.cas);

        ics.setOnClickListener(this);
        coeng.setOnClickListener(this);
        cbpa.setOnClickListener(this);
        cas.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()) {
            case R.id.ics:
                // Handle click for ICS CardView
                intent = new Intent(MainActivity.this, ics.class);
                startActivity(intent);
                break;
            case R.id.coeng:
                // Handle click for COENG CardView
                intent = new Intent(MainActivity.this, coeng.class);
                startActivity(intent);
                break;
            case R.id.cbpa:
                // Handle click for CBPA CardView
                intent = new Intent(MainActivity.this, cbpa.class);
                startActivity(intent);
                break;
            case R.id.cas:

                intent = new Intent(MainActivity.this, cas.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}