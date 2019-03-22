
/**
 * This is a class that tests the Deck class.
 */
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *
     * @param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks = {"Ace", "2,", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King"};
        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

        Deck a = new Deck(ranks, suits, values);
        System.out.println("Deck A size should be 52: " + a.size());

        if (a.isEmpty()) {
            System.out.println("Deck A should be empty: " + a.size());

        }
    }
}

