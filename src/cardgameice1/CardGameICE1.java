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
 *  @modifier Sonaldeep
 Student ID - 991586005
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
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(c.randomValue());
            c.setSuit(c.SUITS[c.generateRandom()]);
            magicHand[i] = c;
            System.out.println(magicHand[i].getSuit() +" " + magicHand[i].getValue());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for card");
        int value = sc.nextInt();
        System.out.println("Enter the suit");
        String suit = sc.next();
        boolean compare = false;
     //comparing the input
        for(int i=0; i<magicHand.length;i++){
            if((value==magicHand[i].getValue()) && (suit.equals(magicHand[i].getSuit()))){
                compare = true;
            }
        }
        if(compare == true){
            System.out.println("Your card is in array");
        }
        else
            System.out.println("Your card is not in array");
    }
    

}
