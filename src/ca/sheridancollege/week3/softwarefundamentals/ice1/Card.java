/*
 * 991549639
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * Modifier:- Kirandeep
 * @author srinivsi
 * Name:- Kirandeep Kirandeep
 */
public class Card {
    
    private String suit;//diamonds,clubs,spades, hearts
    private int v; // 1 to 13
    public static final String[] SUITS = {"diamonds", "clubs", "spades", "hearts"};

    public String getSuits() {
        return suit;
    }

    public void setSuits(String suits) {
        this.suit = suit;
    }

    public int getValue() {
        return v;
    }

    public void setValue(int v) {
        this.v = v;
    }

    public int randomValue(int low, int high) {
        Random r = new Random();
        int value;
        value = r.nextInt(high - low) + low;
        return value;
    }
}
