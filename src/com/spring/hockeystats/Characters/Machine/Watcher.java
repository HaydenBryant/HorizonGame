package com.spring.hockeystats.Characters.Machine;

public class Watcher extends Machine implements Machines{
    public Watcher(String type, int attack, int armor, int health){
        super("Watcher", 4, 1, 5);
    }
}
