package com.example.myapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapp.databinding.ActivityHomeBinding;

public class Home extends AppCompatActivity {

    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_home);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.id1)
        {
            Toast.makeText(Home.this, "Selected"+item.getTitle(), Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Home.this,Menupage1.class);
            startActivity(intent);
        }
        else if(item.getItemId()==R.id.id2)
        {
            Toast.makeText(Home.this, "Selected"+item.getTitle(), Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Home.this,Menupage2.class);
            startActivity(intent);
        }
        else if(item.getItemId()==R.id.id3)
        {
            Toast.makeText(Home.this, "Selected"+item.getTitle(), Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Home.this,Menupage3.class);
            startActivity(intent);
        }
        else if(item.getItemId()==R.id.id4)
        {
            Toast.makeText(Home.this, "Selected"+item.getTitle(), Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Home.this,Menupage4.class);
            startActivity(intent);
        }
        else if(item.getItemId()==R.id.id5)
        {
            Toast.makeText(Home.this, "Selected"+item.getTitle(), Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Home.this,Menupage5.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Home.this);
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