package com.example.projekt_techniczny_studia;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListOfFriendsIntent extends AppCompatActivity {
    Button buttonClose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_friends_intent);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle_view_list_of_friends);
        List<DataFromAddNewFriends> friendsList = DataManager.getInstance().getFriendsList();

//        DataFromAddNewFriends[] listData = new DataFromAddNewFriends[]{
//                new DataFromAddNewFriends("", "", "", "","")
//        };
        Adapter adapter = new Adapter(this, friendsList.toArray(new DataFromAddNewFriends[0]));
//        Adapter adapter = new Adapter(this, listData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        buttonClose = findViewById(R.id.button_close_list_of_friends);

        buttonClose.setOnClickListener((view) -> finish());}

}