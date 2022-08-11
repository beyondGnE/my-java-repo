package com.eugenehk.cardgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CardGameDriver {
    public static void main(String[] args) {
        // Card card = new Card(Value.ACE, Suit.HEARTS);

        // System.out.println(card);

        List<Card> deck = new ArrayList<>();
        for (Value v : Value.values()) {
            
            for (Suit s : Suit.values()) {
                deck.add(new Card(v, s));
            }
            
        }

        // for (Card c : deck) {
        //     System.out.println(c);
        // }
        Collections.shuffle(deck);
        for (Card c : deck) {
            System.out.println(c);
        }
    }
}
