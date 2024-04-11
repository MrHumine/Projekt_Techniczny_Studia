package com.example.projekt_techniczny_studia;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonAddNewFriend;
    Button buttonSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSettings = findViewById(R.id.button_of_settings);
        buttonAddNewFriend = findViewById(R.id.button_of_add_new_friend);
        Intent intentAddNewFriendScreen = new Intent(this, AddNewFriendScreen.class);
        Intent intentSettings = new Intent(this, SettingsIntent.class);

        buttonAddNewFriend.setOnClickListener((view)-> startActivity(intentAddNewFriendScreen));

        buttonSettings.setOnClickListener((view)-> startActivity(intentSettings));

    }
}