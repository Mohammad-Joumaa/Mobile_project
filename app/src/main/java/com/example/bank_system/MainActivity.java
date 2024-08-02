package com.example.bank_system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView tv;
    TextView user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.client);
        user =findViewById(R.id.username);
        pass =findViewById(R.id.password);
        b1 =findViewById(R.id.logbt);

    }
    public void onClick (View k){
        if(user.getText().toString().equals("nadar")&& pass.getText().toString().equals("jomaa")){
            Toast.makeText(MainActivity.this, "LOGIN SUCCESSFULL", Toast.LENGTH_SHORT).show();
            Intent intent =new Intent(this,employee.class);
        }
        else{
            Toast.makeText(MainActivity.this, "LOGIN ERROR", Toast.LENGTH_LONG).show();
        }
    }
    public void im (View view){

        open();
    }
    public void open(){
        Intent i = new Intent(this,Client_side.class);
        startActivity(i);
    }
}