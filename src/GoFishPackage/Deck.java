/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package GoFishPackage;

import java.util.ArrayList;

public class Deck {
    
    private ArrayList<String> deck;

    public Deck(){}

    public Deck(ArrayList<String> deck){
        setDeck(deck);
    }

    public ArrayList<String> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<String> deck) {
        this.deck = deck;
    }

    public String pullCard(){
        String card = deck[0];
        deck.remove(0);
        return card;
    }
}
