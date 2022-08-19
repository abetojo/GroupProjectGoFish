package GoFishPackage;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    protected ArrayList<String> deck;

    public Deck() {
    }

    public Deck(ArrayList<String> deck) {
        setDeck(deck);
    }

    public ArrayList<String> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<String> deck) {
        this.deck = deck;
    }

    public void buildDeck() {
        deck = new ArrayList<String>();
        System.out.println("Building the deck");

        for (int i = 0; i <= 53; i++) {
            if (i < 5) {
                this.deck.add("Ace");
            } else if (i < 9) {
                this.deck.add("Two");
            } else if (i < 13) {
                this.deck.add("Three");
            } else if (i < 17) {
                this.deck.add("Four");
            } else if (i < 21) {
                this.deck.add("Five");
            } else if (i < 25) {
                this.deck.add("Six");
            } else if (i < 29) {
                this.deck.add("Seven");
            } else if (i < 33) {
                this.deck.add("Eight");
            } else if (i < 37) {
                this.deck.add("Nine");
            } else if (i < 41) {
                this.deck.add("Ten");
            } else if (i < 45) {
                this.deck.add("Jack");
            } else if (i < 49) {
                this.deck.add("Queen");
            } else if (i < 53) {
                this.deck.add("King");
            } else if (i == 53) {
                System.out.println("The Deck has been made");
            } else {
                break;
            }
        }
    }

    public ArrayList<String> shuffle() {
        System.out.println("Shuffling the deck");
        Collections.shuffle(this.deck);
        System.out.println("Deck has been shuffled");
        return deck;
    }

    public void newDeck() {
        deck.clear();
        buildDeck();
    }

    public String pullCard() {
        if (this.deck.get(0) != null) {
            String card = this.deck.get(0);
            deck.remove(0);
            return card;
        }
        System.out.println("No cards left in the Deck");
        return null;
    }
}
