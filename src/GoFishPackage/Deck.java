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

    System.out.println("Building the deck");

    for(int i = 1; i <=52; i++){

        if(i <= 4){
            deck.add("Ace");
        }
        else if(i <= 8){
            deck.add("Two");
        }
        else if(i <= 12){
            deck.add("Three");
        }
        else if(i <= 16){
            deck.add("Four");
        }
        else if(i <= 20){
            deck.add("Five");
        }
        else if(i <= 24){
            deck.add("Six");
        }
        else if(i <= 28){
            deck.add("Seven");
        }
        else if(i <= 32){
        deck.add("Eight");
        }
        else if(i <= 36){
            deck.add("Nine");
        }
        else if(i <= 40){
            deck.add("Ten");
        }
        else if(i <= 44){
            deck.add("Jack");
        }
        else if(i <= 48){
            deck.add("Queen");
        }
        else if(i <= 52){
            deck.add("King");
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
        String card = deck.get(0);
        deck.remove(0);
        return card;
    };
}