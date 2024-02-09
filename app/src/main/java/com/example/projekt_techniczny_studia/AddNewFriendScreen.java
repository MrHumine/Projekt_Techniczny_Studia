package com.example.projekt_techniczny_studia;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AddNewFriendScreen extends AppCompatActivity {

    Button buttonClose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creating_new_profile_of_friends);

        buttonClose = findViewById(R.id.button_close_of_creating_new_profile_of_friend);

        buttonClose.setOnClickListener((view) ->{
            finish();
        });
    }
}
