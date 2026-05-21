package com.example.intentapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnExplicit, btnImplicit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnExplicit = findViewById(R.id.btnExplicit);
        btnImplicit = findViewById(R.id.btnImplicit);

        // Explicit Intent
        btnExplicit.setOnClickListener(view -> {

            Intent i = new Intent(
                    MainActivity.this,
                    SecondActivity.class);

            startActivity(i);
        });

        // Implicit Intent
        btnImplicit.setOnClickListener(view -> {

            Intent i = new Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com"));

            startActivity(i);
        });
    }
}