package com.example.fajar.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.*;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //onClickButton();
    }

    public void onClickButton(View v)
    {
        EditText a = (EditText) findViewById(R.id.text1);
        EditText b = (EditText) findViewById(R.id.editText2);
        EditText c = (EditText) findViewById(R.id.editText4);
        String a4;

        int a1,a2,a3;
        a1 = Integer.parseInt(a.getText().toString());
        a2 = Integer.parseInt(b.getText().toString());
        //a3 = Integer.parseInt(c.getText().toString());

        a3 = a1+a2;
        //a4 = String.valueOf(a3);
        c.setText(Integer.toString(a3));




    }
}
