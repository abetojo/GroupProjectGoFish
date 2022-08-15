/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package GoFishPackage;

import java.util.ArrayList;
import java.util.Collections;

public abstract class GoFish extends Player {

    public static void main(String[] args) {
        
    }
    
    private ArrayList<Player> player;

    public GoFish() {
    }

    public GoFish(ArrayList<Player> player) {
        setPlayer(player);
    }

    public ArrayList<Player> getPlayer() {
        
        return player;
    }

    public void setPlayer(ArrayList<Player> player) {
        this.player = player;
    }
    
    public ArrayList<Player> makePlayerList() {
        Player user = new Player();
        Player cpu = new Player();
        player.add(user);
        player.add(cpu);
        return player;
    }
    
    public ArrayList<String> shuffle(ArrayList<String> deck) {
        System.out.println("Shuffling the deck");
        Collections.shuffle(deck);
        System.out.println("Deck has been shuffled");
        return deck;
    }

    public void nextTurn() {

    }

    public abstract void declareWinner() ;
}
