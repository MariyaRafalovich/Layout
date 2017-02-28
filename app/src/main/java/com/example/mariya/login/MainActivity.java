package com.example.mariya.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Change title activity
        getSupportActionBar().setTitle("Activity Test");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        Button btn1 = (Button) findViewById(R.id.button1);
        getSupportActionBar().setIcon(R.drawable.tumblr);
    }
}
