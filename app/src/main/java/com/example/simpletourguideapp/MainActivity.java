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
    private ImageView imageView;
    private Button buttonDisplayImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.image_view);
        buttonDisplayImage = findViewById(R.id.button_display_image);

        ics = findViewById(R.id.ics);
        coeng = findViewById(R.id.coeng);
        cbpa = findViewById(R.id.cbpa);
        cas = findViewById(R.id.cas);

        ics.setOnClickListener(this);
        coeng.setOnClickListener(this);
        cbpa.setOnClickListener(this);
        cas.setOnClickListener(this);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hide the ImageView when clicked
                imageView.setVisibility(View.INVISIBLE);
            }
        });

        // Set OnClickListener to the Button
        buttonDisplayImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show the ImageView when the button is clicked
                imageView.setVisibility(View.VISIBLE);
                // Set the image resource to the ImageView
                imageView.setImageResource(R.drawable.ics); // Replace "your_image_name" with the actual name of your image
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()) {
            case R.id.ics:
                // Handle click for ICS CardView
                intent = new Intent(MainActivity.this, ics.class); // Assuming IcsActivity is the correct activity class
                startActivity(intent);
                break;
            case R.id.coeng:
                // Handle click for COENG CardView
                intent = new Intent(MainActivity.this, coeng.class); // Assuming CoengActivity is the correct activity class
                startActivity(intent);
                break;
            case R.id.cbpa:
                // Handle click for CBPA CardView
                intent = new Intent(MainActivity.this, cbpa.class); // Assuming CbpaActivity is the correct activity class
                startActivity(intent);
                break;
            case R.id.cas:
                intent = new Intent(MainActivity.this, cas.class); // Assuming CasActivity is the correct activity class
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
