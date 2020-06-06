/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;


/**
 *
 * @author srinivsi
 * @modifier Ashli Francis(fraashli)
 * Date Modified: June 5, 2020
 
 *private variable then refactor it
 * - encapsulate fields (encapsulation principle) getters/setters
 */
public class Card 
{
    private String suits;//diamonds,clubs,spades, hearts
    private int value; // 1 to 13
    public static final String[] SUITS={"Diamonds","Clubs","Spades","Hearts"};
    boolean elements;
  
    
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
    //
     
}
