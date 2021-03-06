package com.spring.hockeystats.Dice;

import java.util.Random;

abstract class Die{
    protected int sides;
    protected int value;
    protected int landedOn;
    protected String type;

    Random rand = new Random();

    public Die(int sides, String type){
        this.sides = sides;
        this.type = type;
        roll(sides);
    }

    public void roll(int sides){
        landedOn = rand.nextInt(sides) + 1;
    }


    public int getValue() {
        return value;
    }

    public String getType() { return type; }

}
