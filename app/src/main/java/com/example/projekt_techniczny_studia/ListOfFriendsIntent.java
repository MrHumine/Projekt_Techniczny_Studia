package com.example.projekt_techniczny_studia;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ListOfFriendsIntent extends AppCompatActivity {
    Button buttonClose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_friends_intent);

        buttonClose = findViewById(R.id.button_close_list_of_friends);

        buttonClose.setOnClickListener((view) -> finish());}

}