package com.spring.hockeystats.Dice;

import java.util.Random;

public class OrangeDie extends Die implements Dice{

    public OrangeDie(int sides, String type) {
        super(6, "Orange");
    }


    @Override
    public int getValue() {
        switch (landedOn){
            case 1:
                this.value = 1;
                break;
            case 2:
                this.value = 1;
                break;
            case 3:
                this.value = 2;
                break;
            case 4:
                this.value = 1;
                break;
            case 5:
                this.value = 0;
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