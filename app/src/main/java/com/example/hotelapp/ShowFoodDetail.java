package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.hotelapp.Domain.FoodDomain;
import com.example.hotelapp.Helper.ManagementCard;

public class ShowFoodDetail extends AppCompatActivity {
    private TextView addToCardBtn;
    private TextView titleTxt,feeTxt,descriptionTxt,numberOrderTxt;
    private ImageView minusBtn,plusBtn,foodPic;
    private FoodDomain object;
    private int numberOrder=1;
    private ManagementCard managementCart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_food_detail);

        managementCart=new ManagementCard(this);
        initView();
        getBundle();
    }

    private void getBundle() {
        object=(FoodDomain) getIntent().getSerializableExtra("object");
        int drawableRecourceId=this.getResources().getIdentifier(object.getPic(),"drawable",this.getPackageName());
        Glide.with(this)
                .load(drawableRecourceId)
                .into(foodPic);
        titleTxt.setText(object.getTitle());
        feeTxt.setText("$"+object.getFee());
        descriptionTxt.setText(object.getDescription());
        numberOrderTxt.setText(String.valueOf(numberOrder));

        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOrder=numberOrder+1;
                numberOrderTxt.setText(String.valueOf(numberOrder));
            }
        });
        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numberOrder>1){
                    numberOrder=numberOrder-1;
                }
                numberOrderTxt.setText(String.valueOf(numberOrder));
            }
        });
        addToCardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                object.setNumberInCard(numberOrder);
                managementCart.insertFood(object);

            }
        });
    }

    private void initView() {
        addToCardBtn.findViewById(R.id.addToCardBtn);
        titleTxt.findViewById(R.id.TitleTxt);
        feeTxt.findViewById(R.id.PriceTxt);
        descriptionTxt.findViewById(R.id.descriptionTxt);
        numberOrderTxt.findViewById(R.id.numberOrderTxt);
        minusBtn.findViewById(R.id.minusBtn);
        plusBtn.findViewById(R.id.plusBtn);
        foodPic.findViewById(R.id.foodPic);


    }
}