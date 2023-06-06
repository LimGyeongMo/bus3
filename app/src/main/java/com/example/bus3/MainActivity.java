package com.example.bus3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Fragment_main_home fragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment = new Fragment_main_home();

        getSupportFragmentManager().beginTransaction().replace(R.id.view_pager, fragment).commit();
    }
}