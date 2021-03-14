package com.example.samduocodo.CActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.samduocodo.CActivity.CBasics.CBasicsActivity;
import com.example.samduocodo.CActivity.CPointers.WhatIsAPointerActivity;
import com.example.samduocodo.R;

public class CActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
    }

    public void lunchCBasics(View view) {
        Intent intent = new Intent(this, CBasicsActivity.class);
        startActivity(intent);
    }

    public void lunchCPointers(View view) {
        Intent intent = new Intent(this, WhatIsAPointerActivity.class);
        startActivity(intent);
    }
}