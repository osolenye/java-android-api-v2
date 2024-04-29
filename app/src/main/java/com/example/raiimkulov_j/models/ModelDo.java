package com.example.raiimkulov_j.models;

import com.google.gson.annotations.SerializedName;

public class ModelDo {
    @SerializedName("key")
    private  String key;

    @SerializedName("activity")
    private  String activity;

    @SerializedName("price")
    private  String price;

    @SerializedName("link")
    private  String link;

    @SerializedName("participate")
    private  String participate;

    @SerializedName("type")
    private  String type;

    public String getCategory() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getParticipate() {
        return participate;
    }

    public void setParticipate(String participant) {
        this.participate = participate;
    }
}
