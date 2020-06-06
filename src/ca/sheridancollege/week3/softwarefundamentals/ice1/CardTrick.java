/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
/**
 *
 * @author Kirandeep

 print 7 cards (values,suits) and takes input 
 then prints if matching card is found in an array
 */
public class CardTrick
{

    public static void main(String[] args) {
        // code to generate 7 random cards and store in array
        Card[] magicHand = new Card[7];//array of object
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card ();//object
            c.setValue(c.randomValue(1, 13)); // method to generate random value
            c.setSuits(c.SUITS[c.randomValue(0, 3)]); // method for random suits
            magicHand[i] = c;     //saving the object in array
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any card");
        int value = sc.nextInt();
        System.out.println("Enter any Suit");
        String suit = sc.next();

        boolean comp = false;

        for (int i = 0; i < magicHand.length; i++) {
            if ((value == magicHand[i].getValue()) && (suit.equals(magicHand[i].getSuits()))) 
                comp = true;
        }

        if (comp == true) {
            System.out.println("Your card is in magic hand of Random Cards !!!");
        } else
            System.out.println("Sorry card is not present !!!");
    }

}
