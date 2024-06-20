package com.example.projekt_techniczny_studia;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsIntent extends AppCompatActivity {
    Button buttonClose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        buttonClose = findViewById(R.id.button_close_settings);
        buttonClose.setOnClickListener((view) -> finish());
    }

}
