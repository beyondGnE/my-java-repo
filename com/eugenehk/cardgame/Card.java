package com.eugenehk.cardgame;

public class Card {
    public Card(Value value, Suit suit) {
        setValue(value);
        setSuit(suit);
    }
    @Override
    public String toString() {
        return this.getValue().name() + 
        " of " + this.getSuit().name();
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    public Suit getSuit() {
        return this.suit;
    }

    public void setValue(Value value) {
        this.value = value;
    }
    public Value getValue() {
        return this.value;
    }

    private Value value;
    private Suit suit;
}
