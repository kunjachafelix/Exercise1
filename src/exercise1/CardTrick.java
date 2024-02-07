package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card.
 * To be used as starting code in Exercise
 *
 * @author Your Name
 * @date February 7, 2024
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] hand = new Card[7];

        // Fill the hand with random Card objects
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(generateRandomValue());
            card.setSuit(Card.SUITS[generateRandomSuit()]);
            hand[i] = card;
        }

        // Display the generated cards (for debugging purposes)
        System.out.println("Generated Cards:");
        for (Card card : hand) {
            System.out.println(card);
        }

        // Ask the user for a Card value and suit
        Card userCard = getUserCard();

        // Search the hand for the user's card
        boolean found = false;
        for (Card card : hand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }

        // If the user's card is in the hand, invoke the printInfo() method
        if (found) {
            printInfo();
        } else {
            System.out.println("Sorry, your card is not in the hand.");
        }
    }

    private static Card getUserCard() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of your card (1-13): ");
        int value = scanner.nextInt();

        System.out.print("Enter the suit of your card (Hearts, Diamonds, Clubs, Spades): ");
        String suit = scanner.next();

        return new Card(value, suit);
    }

    private static int generateRandomValue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

     
    private static int generateRandomSuit() {
        Random random = new Random();
        return random.nextInt(Card.SUITS.length);
    }

    /**
     * A simple method to print out personal information. Follow the instructions to
     * replace this information with your own.
     */
    private static void printInfo() {

        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Your Felix");
        System.out.println();

        System.out.println("My career ambitions: Software developer");
        System.out.println("-- Replace with your career ambitions");

        System.out.println();

        System.out.println("My hobbies:playing Guitar");
        System.out.println("-- Replace with your hobbies");

        System.out.println();
    }
}
    

