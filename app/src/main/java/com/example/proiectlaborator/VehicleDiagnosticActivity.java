package com.example.proiectlaborator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VehicleDiagnosticActivity extends AppCompatActivity {

    private TextView problemsTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_diagnostic);

        // Find views
        Button engineBtn = findViewById(R.id.engineBtn);
        Button tiresBtn = findViewById(R.id.tiresBtn);
        Button directionBtn = findViewById(R.id.directionBtn);
        Button exhaustBtn = findViewById(R.id.exhaustBtn);
        problemsTxt = findViewById(R.id.problemsTxt);

        // Set click listeners
        engineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showEngineProblems();
            }
        });

        tiresBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTiresProblems();
            }
        });

        directionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDirectionProblems();
            }
        });

        exhaustBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showExhaustProblems();
            }
        });
    }

    private void showEngineProblems() {
        problemsTxt.setText("Engine problems:\n- Overheating\n- Oil leak\n\nSolutions:\n- Check coolant level\n- Inspect for oil leaks");
    }

    private void showTiresProblems() {
        problemsTxt.setText("Tires problems:\n- Low tread depth\n- Uneven wear\n\nSolutions:\n- Replace tires if tread depth is below safe level\n- Rotate tires to promote even wear");
    }

    private void showDirectionProblems() {
        problemsTxt.setText("Direction problems:\n- Steering wheel vibration\n- Difficulty steering\n\nSolutions:\n- Check wheel alignment\n- Inspect power steering fluid level");
    }

    private void showExhaustProblems() {
        problemsTxt.setText("Exhaust problems:\n- Loud noises\n- Smoke from exhaust\n\nSolutions:\n- Check for exhaust leaks\n- Inspect catalytic converter");
    }
}
