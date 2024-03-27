package com.example.proiectlaborator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class LiveLocationForContactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_location_for_contacts);
        Button shareLiveLocationBtn = findViewById(R.id.shareLiveLocationBtn);
    }
}