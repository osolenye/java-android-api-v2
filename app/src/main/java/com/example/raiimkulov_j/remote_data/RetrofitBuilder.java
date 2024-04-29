package com.example.raiimkulov_j.remote_data;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBuilder {
    private static DoApi instance;

    private RetrofitBuilder() {

    }

    public static DoApi getInstance() {
        if (instance == null) {
            instance = initInstance();
        }
        return instance;
    }

    private static DoApi initInstance() {
        return new Retrofit
                .Builder()
                .baseUrl("https://www.boredapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(DoApi.class);
    }
}
