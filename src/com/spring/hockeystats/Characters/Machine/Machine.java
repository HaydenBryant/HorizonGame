package com.spring.hockeystats.Characters.Machine;

public class Machine implements Machines {
    protected String type;
    protected int attack;
    protected int armor;
    protected int health;

    public Machine(String type, int attack, int armor, int health){
        this.type = type;
        this.armor = armor;
        this.attack = attack;
        this.health = health;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public void move() {

    }
}
