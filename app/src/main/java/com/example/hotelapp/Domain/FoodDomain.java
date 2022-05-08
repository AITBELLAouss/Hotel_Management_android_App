package com.example.hotelapp.Domain;

import java.io.Serializable;

public class FoodDomain implements Serializable {
    private String title;
    private String pic;
    private String description;
    private Double fee;
    private int NumberInCard;

    public FoodDomain(String title, String pic, String description, Double fee) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.fee = fee;
    }

    public FoodDomain(String title, String pic, String description, Double fee, int numberInCard) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.fee = fee;
        NumberInCard = numberInCard;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public double getFee(){this.fee=fee;
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }


    public int getNumberInCard() {
        return NumberInCard;
    }

    public void setNumberInCard(int numberInCard) {
        NumberInCard = numberInCard;
    }
}
