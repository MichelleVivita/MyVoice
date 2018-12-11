package com.example.pranav.myvoice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import layout.xml.Main2Activity;

public class MainActivity extends AppCompatActivity {

    public void click1(View view)
    {

        Intent il=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(il);

    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
