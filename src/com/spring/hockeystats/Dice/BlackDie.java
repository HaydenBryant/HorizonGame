package com.spring.hockeystats.Dice;

import java.util.Random;

public class BlackDie extends Die implements Dice{

    public BlackDie(int sides, String type) {
        super(6, "Black");
    }

    @Override
    public int getValue() {
        switch (landedOn){
            case 1:
                this.value = 3;
                break;
            case 2:
                this.value = 3;
                break;
            case 3:
                this.value = 3;
                break;
            case 4:
                this.value = 0;
                break;
            case 5:
                this.value = 0;
                break;
            case 6:
                this.value = 0;
                break;
        }
        return this.value;
    }

    @Override
    public String getType() {
        return null;
    }

}
