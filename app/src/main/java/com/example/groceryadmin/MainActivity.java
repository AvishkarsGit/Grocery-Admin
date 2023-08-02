package com.example.groceryadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button avishkar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        avishkar = findViewById(R.id.avishkar);
        avishkar.setOnClickListener((view)->{
            Toast.makeText(this, "This is from avishkar", Toast.LENGTH_SHORT).show();
        });

    }
}