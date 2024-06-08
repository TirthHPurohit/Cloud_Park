package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Menupage3 extends AppCompatActivity {
    ListView lv1;
    int img[]={R.drawable.itc,R.drawable.itc1,R.drawable.itc2};

    String detail[]={"Tata Consultancy service is the Largest IT company in India in terms of Revenue. TCS is an IT services, consulting and business solutions provider that has been partnering with the world’s largest businesses in their transformation journeys for the last fifty years.\n" +
            "\n" +
            "TCS offers a consulting-led, cognitive powered, integrated portfolio of business, technology and engineering services and solutions. TCS is the largest company in India in terms of Market Capitalization. It is the largest in the list of top 10 IT companies in India 2020.\n" +
            "\n" +
            "Revenue: Rs 1,67,311 Cr\n" +
            "Market Cap: Rs 845,337 Cr.\n" +
            "Employees: 420,000\n" +
            "ROE: 35.98 %\n" +
            "Sales Growth (3Yrs): 10.47 %\n" +
            "Promoter holding: 72.05 % ",
            "Established in 1981, Infosys is an NYSE listed global consulting and IT services company with more than 228,000 employees. It is the second largest in the list of top 10 IT companies in India 2020. One of the leading software companies in India.\n" +
                    "\n" +
                    "From a capital of US$ 250 to become a US$ 11.8 billion (FY19 revenues) company with a market capitalization of approximately US$ 47.7 billion. It is one of the best IT company in India.\n" +
                    "\n" +
                    "Revenue: Rs 1,02,673 Cr\n" +
                    "Market Cap: Rs  282,028 Cr.\n" +
                    "Employees: 228,000\n" +
                    "ROE: 23.50 %\n" +
                    "Sales Growth (3Yrs): 9.81 %\n" +
                    "Promoter holding: 13.15 %",
            "HCL Technologies is one of the best IT companies in India. The Company is a leading global IT services company that helps global enterprises re-imagine and transform their businesses through Digital technology transformation.\n" +
                    "\n" +
                    "The Company focuses on providing an integrated portfolio of services underlined by its Mode 1–2–3 growth strategy. It is the third-largest Indian top it companies.Revenue: Rs 76,306 Cr\n" +
                    "Market Cap: Rs 153,370 Cr.\n" +
                    "ROE: 25.76 %\n" +
                    "Sales Growth (3Yrs): 24.74 %\n" +
                    "Promoter holding: 60.00 %"};

    String address[]={"TCS","INFOSYS","HCl"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menupage1);
        lv1=findViewById(R.id.lstview);
        Customadapter adapter = new Customadapter(Menupage3.this,img,address,detail);
        lv1.setAdapter(adapter);

    }
}