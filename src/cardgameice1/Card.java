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
 * @modifier sonaldeep
 * Student ID - 991586005
 private variable then refactor it
 * - encapsulate fields (encapsulation principle) 
 getter/setters
 */
public class Card {
    
    private String suits;//diamonds,clubs,spades, hearts
    private int value; // 1 to 13
    public static final String[] SUITS = {"diamonds", "clubs", "spades", "hearts"};

    public String getSuit() {
        return suits;
    }

    public void setSuit(String suits) {
        this.suits = suits;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int randomValue(){
        int value = (int)(Math.random()*10);
        return value;
    }
    
    
    public int generateRandom(){
        int value = (int)(Math.random()*4);
        return value;
    }
    }

