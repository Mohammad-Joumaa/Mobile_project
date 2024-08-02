package com.example.bank_system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Client_side extends AppCompatActivity {

    ImageButton Kn,in;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_side);
        bt =  findViewById(R.id.bac);
        Kn = (ImageButton) findViewById(R.id.im);
        in = findViewById(R.id.insta);
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri =Uri.parse("http://instagram.com/_u/njban_k");
                Intent instagram = new Intent(Intent.ACTION_VIEW,uri);
                instagram.setPackage("com.instagram.android");
                try {
                    startActivity(instagram);
                } catch (ActivityNotFoundException e){
                        startActivity(new Intent (Intent.ACTION_VIEW,Uri.parse("http://instagram.com/_u/njban_k")));
                }
            }
        });
        Kn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t = new Intent(Client_side.this,services.class);
                startActivity(t);
            }
        });
    }
    public void onclick(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}