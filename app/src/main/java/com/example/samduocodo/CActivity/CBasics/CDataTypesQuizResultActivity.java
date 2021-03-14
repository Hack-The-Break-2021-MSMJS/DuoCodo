package com.example.samduocodo.CActivity.CBasics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.samduocodo.R;

public class CDataTypesQuizResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_data_types_quiz_result);
//        Intent lastIntent = getIntent();
//        int finalGrade = lastIntent.getIntExtra("Grade", 0);
//        int totalNumQ = lastIntent.getIntExtra("QuestionNum", 2);
//        int totalNumQ = 3;
//        int percentage = ((finalGrade/totalNumQ) * 100);
//        ((TextView) findViewById(R.id.textViewCDataTypesQuizResultPerc)).setText((String) ("%" + percentage));
//        ((TextView) findViewById(R.id.textViewCDataTypesResultPara)).setText((String) ("Correct Answers: " + finalGrade +
//                "\nTotal Number of Questions:" + totalNumQ));
    }
    public void lunchCBasics(View view) {
        Intent intent = new Intent(this, CBasicsActivity.class);
        startActivity(intent);
    }
}
