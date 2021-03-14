package com.example.samduocodo.CActivity.CBasics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.samduocodo.R;

public class CDataTypesQuizActivity extends AppCompatActivity {

    private final String[] questionsArray = {"What is the format specifier for double data type in c?",
            "Fill in the blank:\n_______ myNumber = 2;\nprintf('My number is %d', myNum);",
            "Fill in the blank:\nsize_t arraySize = 2;\nprintf('%___ is the size of my array', arraySize);"};
    private final String[] answersArray = {"%lf", "int", "zu"};
    private int questionNum = 1;
    private int grade = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_data_types_quiz);
        ((TextView) findViewById(R.id.textViewCDataTypesQuizTitle)).setText((String) ("Question " + questionNum));
        ((TextView) findViewById(R.id.textViewCDataTypesQ)).setText(questionsArray[questionNum - 1]);
    }

    public void checkAnswer(View view) {
        view.setEnabled(false);
        findViewById(R.id.buttonCDataTypeQuizNext).setVisibility(View.VISIBLE);
        String answer = ((EditText) findViewById(R.id.editTextCDataTypeQuizAnswer)).getText().toString();
        TextView resultText = (TextView) findViewById(R.id.textViewCDataTypeQuizResult);
        if (answer.equals(answersArray[questionNum - 1])) {
            resultText.setText((String) "Correct! well done.");
            resultText.setTextColor(Color.GREEN);
            grade++;
        }
        else {
            ((TextView) findViewById(R.id.textViewCDataTypeQuizResult)).setText((String) "Wrong answer. Better luck next time!");
            resultText.setTextColor(Color.RED);
        }
        questionNum++;
    }

    public void loadNext(View view) {
        view.setVisibility(View.GONE);
        findViewById(R.id.buttonCDataTypesQuizCheck).setEnabled(true);
        if (questionNum > questionsArray.length) {
            Intent intent = new Intent(this, CDataTypesQuizResultActivity.class);
            intent.putExtra("Grade", grade);
//            intent.putExtra("QuestionsNum", questionsArray.length);
            startActivity(intent);
        }
        else {
            ((TextView) findViewById(R.id.textViewCDataTypeQuizResult)).setText("");
            ((TextView) findViewById(R.id.textViewCDataTypesQuizTitle)).setText((String) ("Question " + questionNum));
            ((TextView) findViewById(R.id.textViewCDataTypesQ)).setText(questionsArray[questionNum - 1]);
        }
    }
}