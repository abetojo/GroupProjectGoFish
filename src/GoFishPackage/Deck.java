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
    
    public void buildDeck(){
        deck = new ArrayList<String>();
        System.out.println("Building the deck");

        for(int i = 0; i <=52; i++){
            if(i <= 4){
                this.deck.add("Ace");
            }
            else if(i <= 8){
                this.deck.add("Two");
            }
            else if(i <= 12){
                this.deck.add("Three");
            }
            else if(i <= 16){
                this.deck.add("Four");
            }
            else if(i <= 20){
                this.deck.add("Five");
            }
            else if(i <= 24){
                this.deck.add("Six");
            }
            else if(i <= 28){
                this.deck.add("Seven");
            }
            else if(i <= 32){
                this.deck.add("Eight");
            }
            else if(i <= 36){
                this.deck.add("Nine");
            }
            else if(i <= 40){
                this.deck.add("Ten");
            }
            else if(i <= 44){
                this.deck.add("Jack");
            }
            else if(i <= 48){
                this.deck.add("Queen");
            }
            else if(i <= 52){
                this.deck.add("King");
            }
            else{
                System.out.println("The Deck has been made");
            }
            }
        }
    
    public void newDeck() {
        deck.clear();
        buildDeck();
    }

    public String pullCard(){
        if (deck.get(0) != null) {
            String card = deck.get(0);
            deck.remove(0);
            return card;
        }
        System.out.println("No cards left in the Deck");
        return null;
    };
}