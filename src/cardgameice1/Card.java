/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;

import java.util.Random;
import java.util.ArrayList;
import cardgameice1.CardGameICE1;
   
 /*
 * @author srinivsi
 
 private variable then refactor it
 * - encapsulate fields (encapsulation principle) 
 getters/setters
 */
public class Card 
{
  private String suits;//diamonds,clubs,spades, hearts
  private int value; // 1 to 13
public static final String[] SUITS={"diamonds","clubs","spades","hearts"};
 public static final String[] ranks={null, "ACE","2","3,","4","5","6","7","8,","9","10","JACK","QUEEN","KING"};
 
 

    public static void main(String[] args) {
        
    }


 

    
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
    int value=0;
           return value;
}
}
