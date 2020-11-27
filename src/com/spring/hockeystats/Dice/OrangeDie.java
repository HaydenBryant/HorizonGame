package com.spring.hockeystats.Dice;

import java.util.Random;

public class OrangeDie extends Die implements Dice{
    private int sides;
    private String type;
    private int value;


    public OrangeDie(int sides, String type) {
        super(sides, type);
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