/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;

/**
 *
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
    public String randomSuit(){
    int random =    (int) (Math.random() * 4);
    String randomSuit = SUITS[random];
    return randomSuit;
    }
    public int randomValue(){
    int random = 1 + (int)(Math.random() * 13);
    return random;
    }
    @Override
    public String toString(){
    return suits + " " +value ;
    }
}
