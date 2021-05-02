package com.example.a1toz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView, answer_textView;
    EditText editTextNumber;
    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer_textView= findViewById(R.id.answer_textView);
        button= findViewById(R.id.button);
        editTextNumber= findViewById(R.id.editTextNumber);
        textView= findViewById(R.id.textView);

        answer_textView = ((editTextNumber ^ editTextNumber) + editTextNumber) / 2;
    }
}