package com.example.projekt_techniczny_studia;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class AddNewFriendScreen extends AppCompatActivity {

    Button buttonClose;
    Button buttonAdd;
    TextInputEditText textInputEditTextName;
    TextView textViewName;
    TextView textViewLocalization;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creating_new_profile_of_friends);

        buttonClose = findViewById(R.id.button_close_of_creating_new_profile_of_friend);
        buttonAdd = findViewById(R.id.button_add_description_creating_new_profile);
        textInputEditTextName = findViewById(R.id.text_input_add_name);
        textViewName = findViewById(R.id.textViewName);
        textViewLocalization = findViewById(R.id.text_view_localization);

        buttonClose.setOnClickListener((view) ->{
            finish();
        });

        buttonAdd.setOnClickListener((view) ->{
            String name = String.valueOf(textInputEditTextName.getText());
            textViewName.setText(name);
        });
    }
}
