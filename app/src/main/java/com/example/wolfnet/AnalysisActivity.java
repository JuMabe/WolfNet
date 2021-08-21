package com.example.wolfnet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnalysisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);
        Button SmartScan = findViewById(R.id.SmartScan);
        Button QuickScan = findViewById(R.id.QuickScan);
        Button FullScan = findViewById(R.id.FullScan);

        SmartScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity1();
            }
        });

        QuickScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity2();
            }
        });

        FullScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity3();
            }
        });


    }
    private void changeActivity1() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    private void changeActivity2() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    private void changeActivity3() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}