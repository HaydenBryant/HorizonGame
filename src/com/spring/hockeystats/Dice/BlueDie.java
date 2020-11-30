package com.spring.hockeystats.Dice;

import java.util.Random;

public class BlueDie extends Die implements Dice {

    public BlueDie(int sides, String type) {
        super(6, "Blue");
    }


    @Override
    public int getValue() {
        switch (landedOn){
            case 1: case 3:
                this.value = 1;
                break;
            case 2: case 4: case 5:
                this.value = 2;
                break;
            case 6:
                this.value = 3;
                break;
        }
        return this.value;
    }

    @Override
    public String getType() {
        return null;
    }

}