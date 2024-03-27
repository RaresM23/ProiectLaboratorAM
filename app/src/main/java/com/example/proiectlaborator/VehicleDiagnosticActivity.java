package com.example.proiectlaborator;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class VehicleDiagnosticActivity extends AppCompatActivity {

    private static final int SEND_SMS_PERMISSION_REQUEST_CODE = 100;
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
                sendSMSEngineProblems();
            }
        });

        tiresBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTiresProblems();
                sendSMSTiresProblems();
            }
        });

        directionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDirectionProblems();
                sendSMSDirectionProblems();
            }
        });

        exhaustBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showExhaustProblems();
                sendSMSExhaustProblems();
            }
        });
    }

    private void showEngineProblems() {
        problemsTxt.setText("Engine problems:\n- Overheating\n- Oil leak\n\nSolutions:\n- Check coolant level\n- Inspect for oil leaks");
    }

    private void sendSMSEngineProblems() {
        // Send SMS with engine problems to a specific number
        String phoneNumber = "0743953577";
        String message = "SOS, my vehicle is experiencing engine problems. Possible issues: overheating, oil leak. Need assistance.";
        sendSMS(phoneNumber, message);
    }

    private void showTiresProblems() {
        problemsTxt.setText("Tires problems:\n- Low tread depth\n- Uneven wear\n\nSolutions:\n- Replace tires if tread depth is below safe level\n- Rotate tires to promote even wear");
    }

    private void sendSMSTiresProblems() {
        // Send SMS with tires problems to a specific number
        String phoneNumber = "0743953577";
        String message = "SOS, my vehicle is experiencing tires problems. Possible issues: low tread depth, uneven wear. Need assistance.";
        sendSMS(phoneNumber, message);
    }

    private void showDirectionProblems() {
        problemsTxt.setText("Direction problems:\n- Steering wheel vibration\n- Difficulty steering\n\nSolutions:\n- Check wheel alignment\n- Inspect power steering fluid level");
    }

    private void sendSMSDirectionProblems() {
        // Send SMS with direction problems to a specific number
        String phoneNumber = "0743953577";
        String message = "SOS, my vehicle is experiencing direction problems. Possible issues: steering wheel vibration, difficulty steering. Need assistance.";
        sendSMS(phoneNumber, message);
    }

    private void showExhaustProblems() {
        problemsTxt.setText("Exhaust problems:\n- Loud noises\n- Smoke from exhaust\n\nSolutions:\n- Check for exhaust leaks\n- Inspect catalytic converter");
    }

    private void sendSMSExhaustProblems() {
        // Send SMS with exhaust problems to a specific number
        String phoneNumber = "0743953577";
        String message = "SOS, my vehicle is experiencing exhaust problems. Possible issues: loud noises, smoke from exhaust. Need assistance.";
        sendSMS(phoneNumber, message);
    }

    private void sendSMS(String phoneNumber, String message) {
            // Construiește intentul pentru trimiterea SMS-ului
            Uri smsUri = Uri.parse("smsto:" + Uri.encode(phoneNumber));
            Intent intent = new Intent(Intent.ACTION_SENDTO, smsUri);
            intent.putExtra("sms_body", message);
            startActivity(intent);
    }
}