package com.example.projekt_techniczny_studia;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private static DataManager instance;
    private List<DataFromAddNewFriends> friendsList;

    private DataManager() {
        friendsList = new ArrayList<>();
    }

    public static synchronized DataManager getInstance() {
        if (instance == null) {
            instance = new DataManager();
        }
        return instance;
    }

    public List<DataFromAddNewFriends> getFriendsList() {
        return friendsList;
    }

    public void addFriend(DataFromAddNewFriends friend) {
        friendsList.add(friend);
    }

}