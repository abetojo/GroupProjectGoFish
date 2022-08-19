/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GoFishPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Player extends Deck {

    private String name;
    private ArrayList<String> hand;
    private String cardNum;
    private int numSets;

    public Player() {
    }

    public Player(String name, ArrayList<String> hand,
            String cardNum, int numSets) {
        this.name = name;
        this.hand = hand;
        this.cardNum = cardNum;
        this.numSets = numSets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getHand() {
        return hand;
    }

    public void setHand(ArrayList<String> hand) {
        this.hand = hand;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public void setOfFour(String card) {
        int setTracker = 0;
        for(int i = 0; i < hand.size(); i++) {
            if(card.equals(hand.get(i))) {
                setTracker++;
            }
        }
        if(setTracker == 4) {
            hand.removeAll(Collections.singleton(card));
            numSets++;
            System.out.println("You have a set of 4!");
            System.out.println("You have " + numSets + " sets.");
        }
    }

    public int getNumSets() {
        return numSets;
    }

    public void setNumSets(int numSets) {
        this.numSets = numSets;
    }

    public void setOpeningHand(Deck deck) {
        hand = new ArrayList<String>();
        for (int i = 0; i < 7; i++) {
            String card = deck.getDeck().get(0).toString();
            deck.getDeck().remove(0);
            this.hand.add(card);
        }
    }

    public String askForCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which card would you like to ask for?");
        String card = scanner.nextLine();
        return card;
    }

    public String giveCard(String card) {
        if (this.getHand().contains(card)) {
            int index = this.getHand().indexOf(card);
            this.getHand().remove(index);
            return card;
        }
        return null;
    }

    public String goFish(Deck deck) {
        String card = deck.getDeck().get(0);
        return card;
    }

    public String askUserForCard() {
        Random rnd = new Random();
        int index = rnd.nextInt(this.hand.size());
        String card2 = this.hand.get(index);
        return card2;
    }
}
