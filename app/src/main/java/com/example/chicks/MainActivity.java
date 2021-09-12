package com.example.chicks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView count;
    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            // найдём во id элементы интерфейса - лейбл и кнопку:
        count = findViewById(R.id.count);
        button = findViewById(R.id.button);
    }

    int number = 0;
    public void click(View view) {
        if (number < 10) {
            number++;
            count.setText(Integer.toString(number));
        } else {
            number = 0;
        }
    }
}