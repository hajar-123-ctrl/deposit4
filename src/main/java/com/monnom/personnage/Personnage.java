package com.monnom.personnage;

public class Personnage {

    private String orientation = "NORD";

    public String tourner(int fois) {
        String[] directions = {"NORD", "EST", "SUD", "OUEST"};
        int index = 0;
        if (orientation.equals("EST")) {
            index = 1;
        } else if (orientation.equals("SUD")) {
            index = 2;
        } else if (orientation.equals("OUEST")) {
            index = 3;
        }
        index = (index + fois) % 4;

        if (index < 0) {
            index += 4;
        }
        orientation = directions[index];

        return orientation;
    }
}



