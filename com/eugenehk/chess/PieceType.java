package com.eugenehk.chess;

public enum PieceType {
    PAWN("P"), 
    KNIGHT("N"), 
    ROOK("R"), 
    BISHOP("B"),    
    QUEEN("Q"), 
    KING("K");

    private String symbol;

    PieceType(String symbol) {
        this.setSymbol(symbol);
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public String getSymbol() {
        return symbol;
    }
}
