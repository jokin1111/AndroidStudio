package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Fragmento1 fr1 = new Fragmento1();
        Fragmento2 fr2 = new Fragmento2();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.add(R.id.contenedor, fr1, "Fragmento1");


        String s = getIntent().getStringExtra("clave");

        if (s.equals("dos")){
            ft.add(R.id.contenedor2, fr2, "Fragmento2");
        }
        ft.commit();
    }


}