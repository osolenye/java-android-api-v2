package com.example.raiimkulov_j;

import android.content.Context;
import android.content.SharedPreferences;

public class Prefs {
    private SharedPreferences preferences;

    public Prefs(Context context) {
        preferences = context.getSharedPreferences("settings", Context.MODE_PRIVATE);
    }

    public void saveBoardState() {
        preferences.edit().putBoolean("isShown", true).apply();
    }

    public boolean isShown() {
        return preferences.getBoolean("isShown", false);
    }

    public void saveString(String textProfile) {
        preferences.edit().putString("text", textProfile).apply();
    }

    public String getStringData(){
        return preferences.getString("text", "");
    }

    public  void  clear(){
        preferences.edit().clear().apply();
    }

}