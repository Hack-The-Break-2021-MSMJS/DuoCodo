package com.example.samduocodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.samduocodo.CActivity.CActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lunchCActivity(View view) {
        Intent intent = new Intent(this, CActivity.class);
        startActivity(intent);
    }

    public void lunchJavaActivity(View view) {
        Intent intent = new Intent(this, JavaActivity.class);
        startActivity(intent);
    }

    public void lunchPythonActivity(View view) {
        Intent intent = new Intent(this, PythonActivity.class);
        startActivity(intent);
    }
}