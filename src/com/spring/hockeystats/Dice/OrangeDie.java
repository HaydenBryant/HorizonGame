package com.spring.hockeystats.Dice;

import java.util.Random;

public class OrangeDie implements Dice{
    private int sides;
    private String type;
    private int value;

    Random rand = new Random();

    public OrangeDie(int sides, String type) {
        this.sides = 6;
        this.type = "Orange";
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