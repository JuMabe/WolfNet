package com.example.wolfnet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Analysis = findViewById(R.id.Scan);
        Button Devices = findViewById(R.id.Devices);
        Button Config = findViewById(R.id.Config);
        Button History = findViewById(R.id.History);
        Button Settings = findViewById(R.id.Settings);
        Button Contact = findViewById(R.id.Contact);


        Analysis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity1();

            }
        });
        Devices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity2();
            }
        });
        Config.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity3();
            }
        });
        History.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity4();
            }
        });
        Settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity5();
            }
        });
        Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity6();
            }
        });
    }

    private void changeActivity1() {
        Intent intent = new Intent(this, AnalysisActivity.class);
        startActivity(intent);
    }

    private void changeActivity2() {
        Intent intent = new Intent(this, DevicesActivity.class);
        startActivity(intent);
    }

    private void changeActivity3() {
        Intent intent = new Intent(this, ConfigActivity.class);
        startActivity(intent);
    }

    private void changeActivity4() {
        Intent intent = new Intent(this, HistoryActivity.class);
        startActivity(intent);
    }

    private void changeActivity5() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    private void changeActivity6() {
        Intent intent = new Intent(this, ContactActivity.class);
        startActivity(intent);
    }
}