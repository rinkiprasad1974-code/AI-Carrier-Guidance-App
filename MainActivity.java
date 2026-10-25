package com.example.aicareerguidance;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnStartAssessment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartAssessment = findViewById(R.id.btnStartAssessment);

        btnStartAssessment.setOnClickListener(v -> {
            Intent intent = new Intent(
                    MainActivity.this,
                    AssessmentActivity.class
            );

            startActivity(intent);
        });
    }
}