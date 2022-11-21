package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void uno(View v){
        Intent intent1 = new Intent(this, MainActivity2.class);
        intent1.putExtra("clave", "uno");
        startActivity(intent1);
    }

    public void dos(View v){
        Intent intent1 = new Intent(this, MainActivity2.class);
        intent1.putExtra("clave", "dos");
        startActivity(intent1);
    }
}