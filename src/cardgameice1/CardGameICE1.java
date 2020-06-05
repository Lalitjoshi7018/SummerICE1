/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;
import java.util.Scanner;
/**
 *
 * @author srinivsi
 *  @modifier Simarjit Kaur
 Student ID - 991587985
 print 7 cards (values,suits) and takes input 
 then prints if matching card is found in an array
 */
public class CardGameICE1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // code to generate 7 random cards and store in array
        Card[] magicHand = new Card[7];
             
             for(int i = 0; i<magicHand.length; i++)
               {
                  Card c = new Card();
	          c.setValue(c.randomValue());
                  c.setSuits(c.Suits[c.generateRandom()]);
                  magicHand[i] = c;
                
                  System.out.println(magicHand[i].getSuits() + " " + magicHand[i].getValue());
               }

       Scanner input = new Scanner(System.in);
             System.out.println("Enter the value of Card: ");
             int valuecard = input.nextInt();
             System.out.println("Enter the suit of Card: ");
             String suit = input.next();
                
             boolean compare = false;
        for (Card magicHand1 : magicHand) {
            if ((valuecard == magicHand1.getValue()) && (suit.equals(magicHand1.getSuits()))) {
                compare = true;
            }
        }
                if(compare == true)
                     {
                      System.out.println("The card is in the array.");
                     }
                else                      
                       System.out.println("The card is no in the array.");
    }

}
