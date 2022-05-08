package com.example.hotelapp.Adapter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hotelapp.Domain.FoodDomain;
import com.example.hotelapp.R;
import com.example.hotelapp.ShowFoodDetail;

import java.util.ArrayList;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.ViewHolder> {
    ArrayList<FoodDomain> foodDomain;



    public PopularAdapter(ArrayList<FoodDomain> FoodDomain) {
        this.foodDomain = FoodDomain;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_popular,parent,false);
        return new ViewHolder(inflate);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tittle.setText(foodDomain.get(position).getTitle());
        holder.Fee.setText(String.valueOf(foodDomain.get(position).getFee()));


        int drawableRecourceId = holder.itemView.getContext().getResources().getIdentifier(foodDomain.get(position).getPic(),"drawable",holder.itemView.getContext().getPackageName());

        Glide.with(holder.itemView.getContext())
                .load(drawableRecourceId)
                .into(holder.pic);
        holder.AddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(holder.itemView.getContext(), ShowFoodDetail.class);
                intent.putExtra("object",foodDomain.get(position));
                holder.itemView.getContext().startActivity(intent);

            }
        });


    }


    @Override
    public int getItemCount() {
        return foodDomain.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tittle,Fee;
        ImageView pic;
        TextView AddBtn;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tittle=itemView.findViewById(R.id.tittle);
            Fee=itemView.findViewById(R.id.Fee);
            AddBtn=itemView.findViewById(R.id.AddBtn);
            pic=itemView.findViewById(R.id.pic);
        }
    }

}
