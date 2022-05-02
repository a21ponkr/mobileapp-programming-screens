package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);


        Intent intent = getIntent();
        String prime_number = intent.getStringExtra("first_prime_number");
        TextView tvPrime_number = findViewById(R.id.txt_first_prime_number);
        tvPrime_number.setText(prime_number);
    }


}