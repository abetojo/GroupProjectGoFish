/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GoFishPackage;

import java.util.ArrayList;
import java.util.Collections;

public abstract class GoFish extends Player {

    public GoFish() {
    }

    public ArrayList<String> shuffle(ArrayList<String> deck) {
        System.out.println("Shuffling the deck");
        Collections.shuffle(deck);
        System.out.println("Deck has been shuffled");
        return deck;
    }

    public void nextTurn() {
        // TODO===========================
    }

    public Player declareWinner(Player user, Player cpu) {
        if (goFish() == null) {
            if (user.getNumSets() > cpu.getNumSets()) {
                return user;
            }
        }
        return cpu;
    }
}
