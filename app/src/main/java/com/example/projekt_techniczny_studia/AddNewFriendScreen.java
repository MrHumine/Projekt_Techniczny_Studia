package com.example.projekt_techniczny_studia;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textfield.TextInputEditText;

public class AddNewFriendScreen extends AppCompatActivity {

    Button buttonClose;
    Button buttonAdd;
    TextInputEditText textInputEditTextName;
    TextInputEditText textInputEditTextLocalization;
    TextInputEditText textInputEditTextHairColour;
    TextInputEditText textInputEditTextEyesColour;
    TextInputEditText textInputEditTextDescription;
    TextView textViewName;
    TextView textViewLocalization;
    TextView textViewHairColour;
    TextView textViewEyesColour;
    TextView textViewDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creating_new_profile_of_friends);

        buttonClose = findViewById(R.id.button_close_of_creating_new_profile_of_friend);
        buttonAdd = findViewById(R.id.button_add_description_creating_new_profile);

        textInputEditTextName = findViewById(R.id.text_input_add_name);
        textInputEditTextLocalization =findViewById(R.id.text_input_add_localization);
        textInputEditTextHairColour = findViewById(R.id.text_input_add_hair);
        textInputEditTextEyesColour = findViewById(R.id.text_input_add_eyes);
        textInputEditTextDescription = findViewById(R.id.text_input_add_description);

        textViewName = findViewById(R.id.textViewName);
        textViewLocalization = findViewById(R.id.text_view_localization);
        textViewHairColour = findViewById(R.id.textViewHairColour);
        textViewEyesColour = findViewById(R.id.textViewEyesColour);
        textViewDescription = findViewById(R.id.textViewDescription);


        buttonAdd.setOnClickListener((view) ->{
            String name = String.valueOf(textInputEditTextName.getText());
            textViewName.setText(name);
            String hair = String.valueOf(textInputEditTextHairColour.getText());
            textViewHairColour.setText(hair);
            String eyes = String.valueOf(textInputEditTextEyesColour.getText());
            textViewEyesColour.setText(eyes);
            String localization = String.valueOf(textInputEditTextLocalization.getText());
            textViewLocalization.setText(localization);
            String description = String.valueOf(textInputEditTextDescription.getText());
            textViewDescription.setText(description);


            DataFromAddNewFriends list = new DataFromAddNewFriends(name, hair, eyes, localization, description);
            DataManager.getInstance().addFriend(list);
        });

        buttonClose.setOnClickListener((view) -> finish());

    }
}
