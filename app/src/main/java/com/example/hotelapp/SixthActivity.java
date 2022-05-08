package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.hotelapp.Adapter.CategoryAdapter;
import com.example.hotelapp.Adapter.PopularAdapter;
import com.example.hotelapp.Domain.CategoryDomain;
import com.example.hotelapp.Domain.FoodDomain;

import java.util.ArrayList;

public class SixthActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapter,adapter2;
    private RecyclerView recyclerViewCategoryList, recyclerViewPopularList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        
        recyclerViewCategory();
        recyclerViewPopular();


    }

    private void recyclerViewPopular() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewPopularList=findViewById(R.id.recyclerView);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);
        ArrayList<FoodDomain> foodlist=new ArrayList<>();
        foodlist.add(new FoodDomain("dessert of the day","fresh_recipe_1","the best way ,to start your day",9.11));
        foodlist.add(new FoodDomain("dessert","fresh_recipe_2","chocco and vanilla cake ",2.66));
        foodlist.add(new FoodDomain("chef delice","reco_1","chuffle mufle with choclate and bluberries",10.99));
        adapter2=new PopularAdapter(foodlist);
        recyclerViewPopularList.setAdapter(adapter2);
    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL ,false);
        recyclerViewCategoryList=findViewById(R.id.recyclerView1);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> categoryList = new ArrayList<>();
        categoryList.add(new CategoryDomain("dessert of the day","fresh_recipe_1"));
        categoryList.add(new CategoryDomain("dessert ","fresh_recipe_2"));
        categoryList.add(new CategoryDomain("chef delice","reco_1"));
        categoryList.add(new CategoryDomain("oklahoma","reco_2"));
        categoryList.add(new CategoryDomain("adria","reco_3"));

        adapter=new CategoryAdapter(categoryList);
        recyclerViewCategoryList.setAdapter(adapter);
    }
}