/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author srinivsi

 print 7 cards (values,suits) and takes input 
 then prints if matching card is found in an array
 */
public class CardGameICE1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        String suits[]= Card.SUITS;
        boolean tester= true;
        
        // code to generate 7 random cards and store in array
        Card[] magicHand = new Card[7];//array of object
        for (int i=0;i<magicHand.length;i++)
        {
            String random= (suits[new Random().nextInt(suits.length)]);
            Card c= new Card();
            c.setValue((int)(1+Math.random()*13));
            c.setSuits(random);
            magicHand[i]=c;
          
            System.out.println(c.getSuits()+" "+c.getValue());
                       
        }
        
        Card guess=new Card();
        
        System.out.println();
        System.out.print("Value: ");
        int value=input.nextInt();
        guess.setValue(value);
        
        System.out.print("Suit: ");
        String suit=input.next();
        guess.setSuits(suit);
        
        for (Card magicHand1 : magicHand) {
            if (magicHand1.getValue() == guess.getValue() && magicHand1.getSuits().equalsIgnoreCase(guess.getSuits())) {
                tester=true;
                break;
            }
            tester=false;
        }
        
        if(tester){
            System.out.println("I guessed your card!!! "+guess.getValue()+" of "+guess.getSuits()+".");
            
        }
        else {
            System.out.println("Oh no! I didn't guess your card.");
        }
        
        
    }
    
}
