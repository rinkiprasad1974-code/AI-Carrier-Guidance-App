package com.example.aicareerguidance;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AssessmentActivity extends AppCompatActivity {

    private RadioGroup rgInterest;
    private RadioGroup rgSkill;
    private RadioGroup rgSubject;
    private RadioGroup rgWork;

    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment);

        rgInterest = findViewById(R.id.rgInterest);
        rgSkill = findViewById(R.id.rgSkill);
        rgSubject = findViewById(R.id.rgSubject);
        rgWork = findViewById(R.id.rgWork);

        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(v -> submitAssessment());
    }

    private void submitAssessment() {

        if (rgInterest.getCheckedRadioButtonId() == -1 ||
                rgSkill.getCheckedRadioButtonId() == -1 ||
                rgSubject.getCheckedRadioButtonId() == -1 ||
                rgWork.getCheckedRadioButtonId() == -1) {

            Toast.makeText(
                    this,
                    "Please answer all questions",
                    Toast.LENGTH_SHORT
            ).show();

            return;
        }

        RadioButton interestButton =
                findViewById(rgInterest.getCheckedRadioButtonId());

        RadioButton skillButton =
                findViewById(rgSkill.getCheckedRadioButtonId());

        RadioButton subjectButton =
                findViewById(rgSubject.getCheckedRadioButtonId());

        RadioButton workButton =
                findViewById(rgWork.getCheckedRadioButtonId());

        String interest =
                interestButton.getText().toString();

        String skill =
                skillButton.getText().toString();

        String subject =
                subjectButton.getText().toString();

        String work =
                workButton.getText().toString();

        Intent intent = new Intent(
                AssessmentActivity.this,
                ResultActivity.class
        );

        intent.putExtra("interest", interest);
        intent.putExtra("skill", skill);
        intent.putExtra("subject", subject);
        intent.putExtra("work", work);

        startActivity(intent);
    }
}