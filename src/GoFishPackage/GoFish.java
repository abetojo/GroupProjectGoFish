/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package GoFishPackage;

import java.util.ArrayList;

public abstract class GoFish {

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

    public void shuffle() {

    }

    public void nextTurn() {

    }

    public abstract void declareWinner();
}
