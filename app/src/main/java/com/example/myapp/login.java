package com.example.myapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {
    TextView tvbtn;
    Button btn_login;
    EditText lemail,lpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = findViewById(R.id.login);
        lemail = findViewById(R.id.lemail);
        lpass = findViewById(R.id.lpassword);
        tvbtn = findViewById(R.id.tvbtn);
        tvbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ue = lemail.getText().toString();
                if(TextUtils.isEmpty(ue)){
                    lemail.setError("E-mail is required");
                    return;
                }
                String up = lpass.getText().toString();
                if(TextUtils.isEmpty(up)){
                    lpass.setError("E-mail is required");
                    return;
                }
                SharedPreferences pref = getSharedPreferences("User Info", Context.MODE_PRIVATE);
                String email = pref.getString("E-mail",null);
                String spass = pref.getString("User Password",null);

                if( ue.equals(email) && up.equals(spass)){
                    Toast.makeText(login.this, "Login Sucessful", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(login.this,Home.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(login.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(login.this);
        builder.setMessage("Do you want to Exit ?");
        builder.setCancelable(true);

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}