package com.spring.hockeystats.Dice;

import java.util.Random;

abstract class Die{
    private int sides;
    private int value;
    private String type;

    Random rand = new Random();

    public Die(int sides, String type){
        this.sides = sides;
        this.type = type;
        roll(sides);
    }

    public void roll(int sides){
        value = rand.nextInt(sides) + 1;
    }


    public int getValue() {
        return value;
    }

    public String getType() { return type; }

}
