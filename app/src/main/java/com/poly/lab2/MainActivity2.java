package com.poly.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        double kq = getIntent().getDoubleExtra("kq",
                -390000);

        TextView tvKq;
        tvKq = findViewById(R.id.tvKq);
        tvKq.setText(String.valueOf(kq));

    }
}