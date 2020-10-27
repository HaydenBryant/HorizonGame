package com.spring.hockeystats.Characters.Hunter;

public class Hunter implements Hunters{
    protected String type;
    protected int attack;
    protected int armor;
    protected int health;

    public Hunter(String type, int attack, int armor, int health) {
        this.type = type;
        this.attack = attack;
        this.armor = armor;
        this.health = health;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }

    @Override
    public void move() {

    }
}
