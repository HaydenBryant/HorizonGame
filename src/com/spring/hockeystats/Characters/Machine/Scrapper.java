package com.spring.hockeystats.Characters.Machine;

public class Scrapper extends Machine implements Machines{
    public Scrapper(String type, int attack, int armor, int health){
        super("Scrapper", 4, 1, 8);
    }
}
