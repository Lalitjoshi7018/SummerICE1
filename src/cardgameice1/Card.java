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
 
 private variable then refactor it
 * - encapsulate fields (encapsulation principle) getters/setters
 */
public class Card 
{
  private String suits;//diamonds,clubs,spades, hearts
  private int value; // 1 to 13
  public static final String[] SUITS={"Diamonds","Clubs","Spades","Hearts"};
  
    
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
    
    public int randomValue()
    {
        int value= (int)(1+Math.random()*13);
        return value;
    }
    
     public static String randomSuit(String[] SUITS){
        String random= (SUITS[new Random().nextInt(SUITS.length)]);
        return random;
    }
    
     /*public static Card printArray(Card[] SUITS ){
        Card elements= new Card();
        for(Card content: SUITS){
           elements= elements + content;
        }
        
        return elements;
    }*/
     
}
