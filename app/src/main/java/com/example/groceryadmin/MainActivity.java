package com.example.groceryadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView iv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    
    public void clickfunc(View v){

        iv = findViewById(R.id.iv);
        iv.setImageResource(R.drawable.human_wording);
        Toast.makeText(this, "Bhendi", Toast.LENGTH_SHORT).show();
    }
}