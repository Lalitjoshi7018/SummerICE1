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
 *  @Modifier zarna shethwala
 *  Student Id : 991583435
 *  print 7 cards (values,suits) and takes input then prints if matching card is found in an
 * array
 */
public class CardGameICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // code to generate 7 random cards and store in array
        Card[] magicHand = new Card[7];//array of object
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();//object
            //  c.setValue(method to generate random value from 1 to 13);
            //  c.setSuits(method random suits);
            magicHand[i] = c;//saving object in array
            c.setValue(c.createRandomValueCard());
            c.setSuits(Card.SUITS[c.createRandomValueSuit()]);
            System.out.println(magicHand[i].getSuits() + " " + magicHand[i].getValue());

        }
        //take input from user and compare with array 
        System.out.println("\nEnter Card value :");
        int userCardValue = input.nextInt();
        System.out.println("Enter Suit value :");
        String userSuitValue = input.next();

        int flag = 0;
        for (Card magicHand1 : magicHand) {
            if ((userCardValue == magicHand1.getValue()) && (userSuitValue.equals(magicHand1.getSuits()))) {
                flag = 1;
            } 
        }
        if (flag == 1) {
            System.out.println("\nYour card is in the array");
        } else {
            System.out.println("\nYour card is not in the array");
        }

    }
}
