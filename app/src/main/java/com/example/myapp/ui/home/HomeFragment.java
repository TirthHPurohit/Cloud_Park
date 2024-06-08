package com.example.myapp.ui.home;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapp.Menupage1;
import com.example.myapp.Menupage2;
import com.example.myapp.Menupage3;
import com.example.myapp.Menupage4;
import com.example.myapp.Menupage5;
import com.example.myapp.R;
import com.example.myapp.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    AnimationDrawable manimation=new AnimationDrawable();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        ImageView iv = binding.imageView3;
        Button btn1 =binding.button1;
        Button btn2=binding.button2;
        Button btn3=binding.button3;
        Button btn4=binding.button4;
        Button btn5=binding.button5;

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getActivity(), Menupage1.class);
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getActivity(), Menupage2.class);
                startActivity(i);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getActivity(), Menupage3.class);
                startActivity(i);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getActivity(), Menupage4.class);
                startActivity(i);

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getActivity(), Menupage5.class);
                startActivity(i);
            }
        });

        BitmapDrawable frame1= (BitmapDrawable)
                getResources().getDrawable(R.drawable.itlogo1);

        BitmapDrawable frame2= (BitmapDrawable)
                getResources().getDrawable(R.drawable.itlogo2);

        BitmapDrawable frame3= (BitmapDrawable)
                getResources().getDrawable(R.drawable.itlogo3);

        manimation.addFrame(frame1,5000);
        manimation.addFrame(frame2, 5000);
        manimation.addFrame(frame3,5000);
        iv.setBackgroundDrawable(manimation);
        manimation.setOneShot(false);
        manimation.start();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}