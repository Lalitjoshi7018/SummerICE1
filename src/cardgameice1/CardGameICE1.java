/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;
import java.util.Arrays;
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
        
        // code to generate 7 random cards and store in array
        Card[] magicHand = new Card[7];//array of object
        for (int i=0;i<magicHand.length;i++)
        {
           String random= (suits[new Random().nextInt(suits.length)]);
           Card c= new Card();
           c.setValue((int)(1+Math.random()*13));
           c.setSuits(random);
           magicHand[i]=c;
           
          System.out.print(c.getSuits());
          System.out.print(" ");
          System.out.println(c.getValue());
          
        }
        
        System.out.println("Value: ");
        int value=input.nextInt();
        
        System.out.println("Suit: ");
        String suit=input.next();
        
        if(((Arrays.binarySearch(magicHand, suit))==0)){
            System.out.println("Your selection is not apart of the "
                    + "generated cards");
        }else{
            System.out.println("It is a part of the generated pack");
        }

    
    }
    
}
