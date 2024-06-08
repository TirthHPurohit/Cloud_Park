package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Menupage5 extends AppCompatActivity {
    ListView lv1;
    int img[]={R.drawable.cu,R.drawable.cu1,R.drawable.cu2};

    String detail[]={"cloudpark@gmail.com ",
            "Follow us on linked in",
            "Follow us social network for latest updates \n  Facebook: cloudpark IT Company\n  Instagram: Cloud_park \n  Twitter: CP IT Company \n WhatsApp No: 82936521040" };

    String address[]={"Mail US","Linked In","Social Account"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menupage1);
        lv1=findViewById(R.id.lstview);
        Customadapter adapter = new Customadapter(Menupage5.this,img,address,detail);
        lv1.setAdapter(adapter);

    }
}