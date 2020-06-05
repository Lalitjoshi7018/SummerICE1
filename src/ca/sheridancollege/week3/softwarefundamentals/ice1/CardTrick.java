/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
* Gurjot Kaur
Student id:991586964
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
               c.setSuit(c.RandomSuits());// //c.setValue(insert call to random number generator here)
            c.setValue(c.RandomNo()); //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
       magicHand[i]=c;
         System.out.println(magicHand[i]);
        }
        
        //insert code to ask the user for Card value and suit, create their card
          Scanner input=new Scanner(System.in); 
        Card c1=new Card();
        System.out.println("Enter Suit");
        String suits=input.nextLine();
        c1.setSuit(suits);
        System.out.println("Enter Number");
        int no=input.nextInt();
        c1.setValue(no);
        // and search magicHand here to find matching card is in array or not
        //Then report the result here
    
     boolean compare=false;
        for (int i = 0; i <magicHand.length; i++) {
             if (c1.toString().compareTo(magicHand[i].toString()) == 0) {
                 compare =true;
        }
        }
        
            if (compare==true) {
                System.out.println("Card is in the array");
            }
	       else{
                     System.out.println("Card is not in the array");
                 }             
	}
                 
    }




      
