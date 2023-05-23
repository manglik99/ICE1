package exercise1;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick extends Card {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Card[] hand = new Card[7];

        hand[0] = new Card("Clubs",2);
        hand[1] = new Card("Diamonds",3);
        hand[2] = new Card("Spades",12);
        hand[3] = new Card("Hearts",10);
        hand[4] = new Card("Clubs",4);
        hand[5] = new Card("Spades",5);
        hand[6] = new Card("Diamond",6);
        
        Card customerHand = new Card();
        System.out.print("Please enter the card value : ");
        int i = scanner.nextInt();
        customerHand.setValue(i);
        scanner.nextLine();
        System.out.print("Please enter the card suit: ");
        String s = scanner.nextLine();
        customerHand.setSuit(s);
        System.out.println("Your value is " + customerHand.getValue() + " your suit is " + customerHand.getSuit());
        System.out.println("1st Hand value is " + hand[0].getValue());
            
        for(int j=0; j<hand.length;j++) {
            if(hand[j].getValue() == customerHand.getValue()) {
                if(hand[j].getSuit().equalsIgnoreCase( customerHand.getSuit())){
                    printInfo();
                }
            }
            else {
                continue;
            }
        }
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Manglik Chokshi, but you can call me MK");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("Be more active on LinkedIn");
        System.out.println("Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("Investing");
        System.out.println("Cooking");
        System.out.println("Reading/Watching TV");
        System.out.println("Riding my motorcycle");

        System.out.println();
        
    
    }

    public CardTrick(String suit, int value) {
        super(suit, value);
    }

}
