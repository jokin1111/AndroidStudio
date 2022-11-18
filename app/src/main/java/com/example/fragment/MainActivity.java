package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragmento1 fr = new Fragmento1();
        Fragmento2 fr2 = new Fragmento2();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.layout.fragmento1, fr, "Fragmento1");
        ft.add(R.layout.fragmento2, fr2, "Fragmento2");
        ft.commit();
    }

}