package com.example.samduocodo.CActivity.CBasics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.samduocodo.R;

public class CBasicsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_basics);
    }

    public void lunchCIntro(View view) {
        Intent intent = new Intent(this, CIntroActivity.class);
        startActivity(intent);
    }

    public void lunchCComments(View view) {
        Intent intent = new Intent(this, CCommentsActivity.class);
        startActivity(intent);
    }

    public void lunchCDataTypes(View view) {
        Intent intent = new Intent(this, CDataTypesActivity.class);
        startActivity(intent);
    }
}