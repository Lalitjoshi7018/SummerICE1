/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;
import java.util.Random;
/**
 *
 * @author srinivsi
 * @modifier Gursimranpreet Kaur
 * Student ID - 991587918
 private variable then refactor it
 * - encapsulate fields (encapsulation principle) 
 getter/setters
 */
public class Card {
    
    private String suits;//diamonds,clubs,spades, hearts
    private int value; // 1 to 13
    public static final String[] SUITS = {"diamonds", "clubs", "spades", "hearts"};

    public String getSuits() {
        return suits;
    }

    public void setSuits(String suits) {
        this.suits = suits;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int randomValue(int low, int high) {
        Random r = new Random();
        int value = r.nextInt(high - low) + low;
        return value;
    }
}
