package com.example.projekt_techniczny_studia;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private static DataManager instance;
    private List<DataFromAddNewFriends> friendsList;
    private Adapter adapter;

    private DataManager() {
        friendsList = new ArrayList<>();
    }

    public static synchronized DataManager getInstance() {
        if (instance == null) {
            instance = new DataManager();
        }
        return instance;
    }
    public void setAdapter(Adapter adapter) {
        this.adapter = adapter;
    }
    private void logFriendsList() {
        StringBuilder tempList = new StringBuilder();
        for (DataFromAddNewFriends element : friendsList) {
            tempList.append(element.toString()).append(" ");
        }
        Log.d("DataManager", String.valueOf(friendsList));
    }
    public List<DataFromAddNewFriends> getFriendsList() {
        return friendsList;
    }

    public void addFriend(DataFromAddNewFriends friend) {
        friendsList.add(friend);
        logFriendsList();
    }

}