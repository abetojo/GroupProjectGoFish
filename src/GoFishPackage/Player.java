/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package GoFishPackage;

import java.util.ArrayList;

public class Player {
    
    private String name;
    private ArrayList<String> hand;
    private String cardNum;
    private int numSets;

    public Player(){}

    public Player(String name, ArrayList<String> hand, 
            String cardNum, int numSets) {
        setName(name);
        setHand(hand);
        setCardNum(cardNum);
        setNumSets(numSets);
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

    public int setOfFour(int numSets) {
        return numSets;
    }

    public int getNumSets() {
        return numSets;
    }

    public void setNumSets(int numSets) {
        this.numSets = numSets;
    }

    public String askForCard(String cardNum) {
        return cardNum;
    }

    public String giveCard(String cardNum) {
        return cardNum;
    }

    public String goFish() {
        return  "";
    }
}
