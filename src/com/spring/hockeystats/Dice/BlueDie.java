package com.spring.hockeystats.Dice;

import java.util.Random;

public class BlueDie implements Dice{
    private int sides;
    private String type;
    private int value;

    Random rand = new Random();

    public BlueDie(int sides, String type) {
        this.sides = 6;
        this.type = "Blue";
    }

    @Override
    public int roll() {
        return 0;
    }

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public String getType() {
        return null;
    }

}