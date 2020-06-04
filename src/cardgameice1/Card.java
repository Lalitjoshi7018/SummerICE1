/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;

/**
 *
 * @author srinivsi
 modifier Lavdeep  Kaur , Student number 991587873
 
 private variable then refactor it
 * - encapsulate fields (encapsulation principle) 
 getters/setters
 */
public class Card 
{
  private String suits;//diamonds,clubs,spades, hearts
  private int value; // 1 to 13
public static final String[] Suits={"diamonds","clubs","spades","hearts"};
    
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
    
    public int randomValue(){
    int value = (int)(Math.random() * 10) ;
    return value;

    }
    
     public int generateRandom(){
     int value = (int)(Math.random()* 4);
     return value;
    }
}
