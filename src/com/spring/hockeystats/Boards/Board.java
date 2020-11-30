package com.spring.hockeystats.Boards;

import java.util.ArrayList;

public class Board {
    private int sides;
    private ArrayList<String> sidesNames;
    private ArrayList<Piece> pieces;

    public Board(int sides, ArrayList<String> sidesNames, ArrayList<Piece> pieces) {
        this.sides = 2;
        this.sidesNames = sidesNames;
        this.pieces = pieces;
    }

    public int getSides() {
        return sides;
    }

    public ArrayList<String> getSidesNames() {
        return sidesNames;
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }


}
