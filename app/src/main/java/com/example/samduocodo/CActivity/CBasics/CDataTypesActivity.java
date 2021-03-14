package com.example.samduocodo.CActivity.CBasics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.samduocodo.R;

public class CDataTypesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_data_types);
    }

    public void lunchCDataTypesQuiz(View view) {
        Intent intent = new Intent(this, CDataTypesQuizActivity.class);
        startActivity(intent);
    }
}