package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<homeModel> homeModelList;
    RecyclerView home_Reci;
    homeAdapter homeAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setList();
        initViews();
        homeAdapter = new homeAdapter(homeModelList);

        home_Reci.setAdapter(homeAdapter);

    }

    private void initViews() {
        home_Reci = findViewById(R.id.home_Reci);
    }

    private void setList() {
        homeModelList = new ArrayList<>();
        homeModelList.add(new homeModel("Popular Hotel","The Karama Villa","70$",R.drawable.home_2));
        homeModelList.add(new homeModel("Luxury Hotel","The tashkent","80$",R.drawable.home_3));
        homeModelList.add(new homeModel("Famous Hotel","The nastika ola","75$",R.drawable.home_4));
        homeModelList.add(new homeModel("See All Hotel","The Apura Villa","60$",R.drawable.home_1));
        homeModelList.add(new homeModel("Luxury Hotel","The Emeralda Villa","67$",R.drawable.home_5));
        homeModelList.add(new homeModel("Popular Hotel","The Apura Villa","65$",R.drawable.home_6));
        homeModelList.add(new homeModel("See All Hotel","The tashkent","60$",R.drawable.home_7));


    }
}