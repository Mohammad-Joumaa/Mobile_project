package com.example.bank_system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class services extends AppCompatActivity {
    Button bt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        bt =  findViewById(R.id.back);

    }
    public void onclick(View v){
        Intent intent = new Intent(this,Client_side.class);
        startActivity(intent);
    }
}