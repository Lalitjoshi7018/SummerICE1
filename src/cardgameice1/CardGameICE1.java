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
        for (int i=0;i<magicHand.length;i++)
        {
           Card c= new Card();//object
           c.setValue(c.randomValue());
           c.setSuits(c.Suits[c.generateRandom()]);
           magicHand[i]=c;//saving object in array
           System.out.println(magicHand[i].getSuits() + "  "  + magicHand[i].getValue());
        }
    //take input from user and compare with array 
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value for card :");
       int valuecard = sc.nextInt();
       System.out.println("Enter the suit :");
       String suitcard = sc.next();
       
       boolean compare = false;
       
       for(int i =0; i<magicHand.length ; i++){
       
       if( (valuecard == magicHand[i].getValue()) && (suitcard.equals(magicHand[i].getSuits()))){
           
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
