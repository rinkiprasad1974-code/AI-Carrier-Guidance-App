package com.example.aicareerguidance;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    private TextView tvCareer;
    private TextView tvMatch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvCareer = findViewById(R.id.tvCareer);
        tvMatch = findViewById(R.id.tvMatch);

        String interest = getIntent().getStringExtra("interest");
        String skill = getIntent().getStringExtra("skill");
        String subject = getIntent().getStringExtra("subject");
        String work = getIntent().getStringExtra("work");

        String career;
        int match;

        if (interest.equals("Programming")
                && skill.equals("Coding")
                && subject.equals("Computer Science")) {

            career = "Software Developer";
            match = 90;

        } else if (subject.equals("Mathematics")
                && skill.equals("Problem Solving")) {

            career = "Data Analyst";
            match = 85;

        } else if (interest.equals("Design")
                && skill.equals("Creativity")) {

            career = "UI/UX Designer";
            match = 85;

        } else if (interest.equals("Business")
                && skill.equals("Communication")) {

            career = "Business Analyst";
            match = 80;

        } else {

            career = "Web Developer";
            match = 70;
        }

        tvCareer.setText(career);
        tvMatch.setText("Career Match: " + match + "%");
    }
}