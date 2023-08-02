package com.example.groceryadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button avishkar;
    Button btnShambho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        avishkar = findViewById(R.id.avishkar);
        btnShambho = findViewById(R.id.btnShambho);

        avishkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This from avishkar", Toast.LENGTH_SHORT).show();
            }
        });

        btnShambho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This from shambho", Toast.LENGTH_SHORT).show();

            }
        });
    }
}