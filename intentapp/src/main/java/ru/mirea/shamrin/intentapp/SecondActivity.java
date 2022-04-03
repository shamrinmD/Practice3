package ru.mirea.shamrin.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String date = intent.getStringExtra("key");
        // Установка значения TextView во втором activity
        TextView text = (TextView) findViewById(R.id.textView);
        text.setText(date);
    }
}