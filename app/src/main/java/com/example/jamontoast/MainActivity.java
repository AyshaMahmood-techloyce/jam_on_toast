package com.example.jamontoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.Toaster.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toasty.simpleToast(this);
    }
}