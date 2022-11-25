package com.example.fragment;


import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fragmento2 extends Fragment implements View.OnClickListener{

    TextView tv2;
    EditText ed2;
    Button b2;

    public Fragmento2(){

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){
        View v = inflater.inflate(R.layout.fragmento2, container, false);

        tv2 = v.findViewById(R.id.textView2);
        ed2 = v.findViewById(R.id.editTextTextPersonName2);
        b2 = v.findViewById(R.id.button2);
        b2.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View view) {

        String s = String.valueOf(ed2.getText());
        tv2.setText("Hola " + s);

    }
}
