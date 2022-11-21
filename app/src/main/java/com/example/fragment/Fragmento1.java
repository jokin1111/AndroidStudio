package com.example.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;



public class Fragmento1 extends Fragment implements View.OnClickListener{

    TextView tv1;
    EditText ed1;
    Button b1;

    public Fragmento1(){

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){
        View v = inflater.inflate(R.layout.fragmento1, container, false);
        tv1 = v.findViewById(R.id.textView);
        ed1 = v.findViewById(R.id.editTextTextPersonName);
        b1 = v.findViewById(R.id.button);
        b1.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View view) {

    }


}
