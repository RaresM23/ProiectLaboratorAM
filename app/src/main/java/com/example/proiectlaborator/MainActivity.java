package com.example.proiectlaborator;

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
        Button GpsPinPointBtn = findViewById(R.id.gpsPinPointBtn);
        Button llContactsBtn = findViewById(R.id.llContactsBtn);
        Button assistanceBtn = findViewById(R.id.assistanceBtn);
        Button vehicleDiagnosticBtn = findViewById(R.id.vehicleDiagnosticBtn);
        Button nearbyServicesBtn =findViewById(R.id.nearbyServicesBtn);
        Button emergenciesSuppliesBtn = findViewById(R.id.emergenciesSuppliesBtn);
        Button weatherAlertsBtn = findViewById(R.id.weatherAlertsBtn);

        GpsPinPointBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , GPSpinPointActivity.class);
                startActivity(intent);
            }
        });

        llContactsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , LiveLocationForContactsActivity.class);
                startActivity(intent);
            }
            });

        assistanceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , AssistanceActivity.class);
                startActivity(intent);
            }

        });

        vehicleDiagnosticBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , VehicleDiagnosticActivity.class);
                startActivity(intent);
            }
    });

        nearbyServicesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NearbyServicesActivity.class);
                startActivity(intent);
            }
        });

        emergenciesSuppliesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EmergencySuppliesActivity.class);
                startActivity(intent);
            }
        });

        weatherAlertsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WeatherAlertsActivity.class);
                startActivity(intent);
            }
        });

}}