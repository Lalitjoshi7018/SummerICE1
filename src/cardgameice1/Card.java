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
 * @modifier Jasleen Kaur 
 * Student ID - 991586081
 private variable then refactor it
 * - encapsulate fields (encapsulation principle) 
 getter/setters
 */
import java.util.Random;
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
   public static final String [] Rank = {"Ace", "2" , "3" , "4", "5" , "6","7" , "8" ,"9", "10", "Jack", "Queen", "King"};
   
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
   // insert two methods to generate random value and suit here
    public int shuffle (int n, int m){
       Random r = new Random();
       int value = r.nextInt(m-n) + n;
       return value;
        }
    }
   
    

