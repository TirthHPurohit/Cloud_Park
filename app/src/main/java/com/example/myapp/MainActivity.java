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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvbtn2;
    Button sign_up;
    EditText name, mob, pass, cpass, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sign_up = findViewById(R.id.signup);
        name = findViewById(R.id.uname);
        email = findViewById(R.id.uemail);
        mob = findViewById(R.id.umobile);
        pass = findViewById(R.id.upassword);
        cpass = findViewById(R.id.ucofirmpasssword);
        tvbtn2=findViewById(R.id.tvbtn2);
        sign_up.setOnClickListener(this);
        tvbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,login.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onClick(View view) {
        String nam = name.getText().toString();
        if(TextUtils.isEmpty(nam)){
            name.setError("Username is required");
            return;
        }
        String mai = email.getText().toString();
        if(TextUtils.isEmpty(mai)){
            email.setError("E-mail is required");
            return;
        }
        String mo = mob.getText().toString();
        if(TextUtils.isEmpty(mo)){
            mob.setError("Mobile no is required");
            return;
        }
        String pa = pass.getText().toString();
        if(TextUtils.isEmpty(pa)){
            pass.setError("Password is required");
            return;
        }
        String cpa = cpass.getText().toString();
        if(TextUtils.isEmpty(cpa)){
            cpass.setError("Confirm Passwod is required");
            return;
        }
        SharedPreferences pref = getSharedPreferences("User Info", Context.MODE_PRIVATE);
        SharedPreferences.Editor ed =pref.edit();
        ed.putString("User name",nam);
        ed.putString("E-mail",mai);
        ed.putString("Mobile No.",mo);
        ed.putString("User Password",pa);
        ed.putBoolean("is_Check",true);
        ed.apply();
        if(pa.equals(cpa)) {
            Intent i = new Intent(MainActivity.this, login.class);
            startActivity(i);
        }
        else{
            Toast.makeText(MainActivity.this, "Password doesn't match", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
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