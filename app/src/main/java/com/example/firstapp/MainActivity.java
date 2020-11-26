package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public  void sendNow(View view){
        Toast.makeText(this, "Message is sended", Toast.LENGTH_SHORT).show();
    }
    public  void receiveNow(View view)
    {
        Toast.makeText(this, "Message is Received", Toast.LENGTH_SHORT).show();
    }
    public  void deleteNow(View view){
        Toast.makeText(this, "Message is Deleted", Toast.LENGTH_SHORT).show();

    }

//    public  void button3(View view){
//        Toast.makeText(this, "Message is Deleted", Toast.LENGTH_SHORT).show();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn = new Intent(MainActivity.this, hello.class);
                startActivity(btn);
            }
        });


    }}

