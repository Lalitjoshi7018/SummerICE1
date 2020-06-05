/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;
import java.util.Arrays;
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
        // code to generate 7 random cards and store in array
        Card[] magicHand = new Card[7];//array of object
        for (int i=0;i<magicHand.length;i++){
           Card c= new Card();//object;
           c.setValue(c.randomValue()); //  c.setValue(method to generate random value from 1 to 13);
         c.setSuits(c.randomSuit());  //  c.setSuits(method random suits);
           magicHand[i]=c;//saving object in array
        }
    
        System.out.println(Arrays.toString(magicHand));
         //take input from user and compare with array 
        Scanner input = new Scanner(System.in);
        Card c1 = new Card();
        System.out.println("Choose your Card. Enter Suit.");
        c1.setSuits(input.nextLine()); //     suit =
        System.out.println("Enter Card number.");
        c1.setValue(input.nextInt());// value=
        
        boolean match = false;
        for(int i = 0; i < magicHand.length; i++){
            if( c1.getSuits().compareTo(magicHand[i].getSuits()) == 0 && c1.getValue() == magicHand[i].getValue() )
                match = true;
        }
        if (match == true)
            System.out.println("Your card is in the pack");
        else
            System.out.println("Your card is not in the deck");
            
            
    }
    
}
