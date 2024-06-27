package com.example.projekt_techniczny_studia;

import androidx.annotation.NonNull;

public class DataFromAddNewFriends {
    private String name;
    private String localization;
    private String hairColour;
    private String eyesColour;
    private String description;

    public DataFromAddNewFriends(String name, String localization, String hairColour, String eyesColour, String description) {
        this.name = name;
        this.localization = localization;
        this.hairColour = hairColour;
        this.eyesColour = eyesColour;
        this.description = description;
    }

    @NonNull
    @Override
    public String toString() {
        return name + " " + localization + " " + hairColour + " " + eyesColour + " " + description + " ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public String getHairColour() {
        return hairColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }

    public String getEyesColour() {
        return eyesColour;
    }

    public void setEyesColour(String eyesColour) {
        this.eyesColour = eyesColour;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
