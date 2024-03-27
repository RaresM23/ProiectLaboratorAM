package com.example.proiectlaborator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class EmergencySuppliesActivity extends AppCompatActivity {

    ListView listViewData;
    ArrayAdapter<String> adapter;
    String[] arrayPeliculas = {"Mancare", "Apa", "Lopata", "Trusa de scule", "Compresor", "Cric"};
    private static final String PHONE_NUMBER = "0743953577";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_supplies);

        listViewData = findViewById(R.id.listView_data);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice,arrayPeliculas);
        listViewData.setAdapter(adapter);

        Button sendButton = findViewById(R.id.sendButton);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendSelectedItemsSMS();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        int id = item.getItemId();
        if(id == R.id.item_done){
            sendSelectedItemsSMS();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void sendSelectedItemsSMS() {
        StringBuilder selectedItems = new StringBuilder("I need these things: \n");
        for(int i=0;i < listViewData.getCount();i++){
            if(listViewData.isItemChecked(i)){
                selectedItems.append(listViewData.getItemAtPosition(i)).append("\n");
            }
        }
        String message = selectedItems.toString();
        sendSMS(PHONE_NUMBER, message);
    }

    private void sendSMS(String phoneNumber, String message) {
        // Construiește intentul pentru trimiterea SMS-ului
        Uri smsUri = Uri.parse("smsto:" + Uri.encode(phoneNumber));
        Intent intent = new Intent(Intent.ACTION_SENDTO, smsUri);
        intent.putExtra("sms_body", message);
        startActivity(intent);
    }
}
