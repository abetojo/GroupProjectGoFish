package GoFishPackage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class Driver {
    
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player user = new Player();
        Player cpu = new Player();
        Scanner input = new Scanner(System.in);

        deck.buildDeck();
        String userName = getString(input, "Enter your name: ");
        user.setName(userName);
        String numCpu = getString(input, "How many CPUs to verse: ");

        //need to distribute cards
        user.askForCard();
    }

    public static String getString(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }
}
