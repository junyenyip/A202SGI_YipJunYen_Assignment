package com.example.questions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
    }

    public void goMPU(View view){

        startActivity(new Intent(Selection.this, mpuQuestions.class));
    }

    public void goMaths(View view){
        startActivity(new Intent(Selection.this, mathsQuestions.class));
    }
}