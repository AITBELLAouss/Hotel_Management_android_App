package com.example.hotelapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class ThirdActivity extends AppCompatActivity {

    ImageView third_back_arrow;
    Button book1,book2,book3,book4,book5;


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        third_back_arrow = findViewById(R.id.Third_back_arrow);
        book1=findViewById(R.id.button4);
        book2=findViewById(R.id.button6);
        book3=findViewById(R.id.button7);
        book4=findViewById(R.id.button8);
        book5=findViewById(R.id.button9);


        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(ThirdActivity.this,RoomOne.class);
                startActivity(intent2);
            }
        });

        book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(ThirdActivity.this,RoomTwo.class);
                startActivity(intent3);
            }
        });

        book3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(ThirdActivity.this,RoomThree.class);
                startActivity(intent4);
            }
        });

        book4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(ThirdActivity.this,RoomFour.class);
                startActivity(intent5);
            }
        });

        book5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6= new Intent(ThirdActivity.this,RoomFive.class);
                startActivity(intent6);
            }
        });


       third_back_arrow.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent secondActivity = new Intent(ThirdActivity.this,SecondActivity.class);
               startActivity(secondActivity);
           }
       });



    }
}