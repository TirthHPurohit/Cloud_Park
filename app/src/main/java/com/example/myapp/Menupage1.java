package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Menupage1 extends AppCompatActivity {
    ListView lv1;
    int img[]={R.drawable.it1,R.drawable.it2,R.drawable.it3};

    String detail[]={"Web develop with Html,Bootstrap,JavaScript and CSS ",
            "Data Science analysis using python",
            "Android app development using Android Studio"};

    String address[]={"Web Development","Data Science","App Development"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menupage1);
        lv1=findViewById(R.id.lstview);
        Customadapter adapter = new Customadapter(Menupage1.this,img,address,detail);
        lv1.setAdapter(adapter);

    }
}