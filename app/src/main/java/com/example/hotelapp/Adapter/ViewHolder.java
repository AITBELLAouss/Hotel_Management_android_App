package com.example.hotelapp.Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotelapp.R;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView title, feeEachItem;
    ImageView pic, plusItem, minusItem;
    TextView totalEachItem, num;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.textView8);
        feeEachItem = itemView.findViewById(R.id.textView15);
        pic = itemView.findViewById(R.id.picCard);
        totalEachItem = itemView.findViewById(R.id.totalEachItem);
        num = itemView.findViewById(R.id.numberItemTxt);
        plusItem = itemView.findViewById(R.id.plusCardBtn);
        minusItem = itemView.findViewById(R.id.minusCardBtn);
    }
}
