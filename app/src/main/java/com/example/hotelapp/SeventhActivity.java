package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SeventhActivity extends AppCompatActivity {

    Button button,button2,button5;
    ImageView seventh_back_arrow;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        button  = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button5 = findViewById(R.id.button5);
        seventh_back_arrow = findViewById(R.id.seventh_back_arrow);

        seventh_back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SeventhActivity.this,FourthActivity.class);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(SeventhActivity.this,BookingActivity.class);
                startActivity(intent2);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(SeventhActivity.this,BookingActivity.class);
                startActivity(intent3);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(SeventhActivity.this,BookingActivity.class);
                startActivity(intent4);
            }
        });










    }
}