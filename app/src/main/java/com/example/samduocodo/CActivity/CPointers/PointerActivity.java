package com.example.samduocodo.CActivity.CPointers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.samduocodo.R;

public class PointerActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pointer);

        button = (Button) findViewById(R.id.button_what_is_a_pointer);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWhatIsAPointerActivity();
            }
        });
    }
    public void openWhatIsAPointerActivity() {
        Intent intent = new Intent(this, WhatIsAPointerActivity.class);
        startActivity(intent);
    }
}