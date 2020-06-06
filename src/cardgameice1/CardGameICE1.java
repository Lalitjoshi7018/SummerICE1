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
 *  @modifier Gursimranpreet kaur
 Student ID - 991587950
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
        Card[] magicHand = new Card[7];//array of object
        for (int x = 0; x < magicHand.length; x++) {
            Card xyz = new Card ();//object
            xyz.setValue(xyz.randomValue(1, 13)); // method to generate random value from 1 to 13
            xyz.setSuits(xyz.SUITS[xyz.randomValue(0, 3)]); // method random suits generating 0 to 3 for array
            magicHand[x] = xyz;     //saving object in array
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any card");
        int value = sc.nextInt();
        System.out.println("Enter the name of any Suit");
        String suit = sc.next();

        boolean comparison = false;

        for (int x = 0; x < magicHand.length; x++) {
            if ((value == magicHand[x].getValue()) && (suit.equals(magicHand[x].getSuits()))) comparison = true;
        }

        if (comparison == true) {
            System.out.println("Your card is now in magic hand of Random Cards");
        } else
            System.out.println("Sorry  the card is not present !!!");
    }

}
