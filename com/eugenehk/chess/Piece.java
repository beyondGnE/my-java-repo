package com.eugenehk.chess;

public class Piece {
    // Each piece has a name, location, and behavior.
    // Should each piece keep track of their behaviors?
    private PieceType type;
    private PieceColor color;
    public void setPieceType() {

    }

    public Piece(PieceType type, PieceColor color) {
        this.type = type;
        this.color = color;
    }

    // Behavior is determined by what moves are not allowed by the piece - resolved in Chess main system.
    // Behavior evaluated by the type of piece and its location with other pieces wrto it.

    // Represent each piece by a symbol or something else.
    public String toString() {
        return this.type.getSymbol();
    }
}

