package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Menupage2 extends AppCompatActivity {
    ListView lv1;
    int img[]={R.drawable.is,R.drawable.is1,R.drawable.is2};

    String detail[]={"3 months internship in Web development . It will include Html,Bootstrap,JavaScript and CSS,",
            " 5 months internship in Data Science. It will include  analysis using python",
            "6 months internship in Android app development. The toll is Android Studio"};

    String address[]={"Internship in Web Development","Internship in Data Science","Internship in Android App Development"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menupage1);
        lv1=findViewById(R.id.lstview);
        Customadapter adapter = new Customadapter(Menupage2.this,img,address,detail);
        lv1.setAdapter(adapter);

    }
}