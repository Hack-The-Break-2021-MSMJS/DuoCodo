package com.example.samduocodo.CActivity.CBasics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.samduocodo.CActivity.CActivity;
import com.example.samduocodo.R;

public class CCommentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_comments);
    }

    public void lunchCCommentsQuiz(View view) {
        Intent intent = new Intent(this, CCommentsQuizActivity.class);
        startActivity(intent);
    }

}