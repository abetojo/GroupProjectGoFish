package GoFishPackage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class Driver {

    // Using ** as fixing comments for some methods that didnt work
    
    public static void main(String[] args) {
        Deck deck = new Deck(); // Object for the Deck
        Player user = new Player(); // Object for User
        Player cpu = new Player(); // Object for CPU
        GoFish fish = new GoFish() {}; // Object for GoFish
        
        Scanner input = new Scanner(System.in);

        //System builds the cards
        deck.buildDeck();
        deck.shuffle();
        
        //Asks user for their name
        String userName = getString(input, "Enter your name: ");
        user.setName(userName);
        cpu.setName("Player");

        //** needs fixing (only grabs index, not string)
        user.setOpeningHand(deck);
        cpu.setOpeningHand(deck);

        System.out.println("Your hand is:" + user.getHand());
        System.out.println("CPU hand is: " + cpu.getHand());
        
        while(!deck.getDeck().isEmpty()) {
            System.out.println("Ask your opponent for a card");
            



        }   
        

    }

    public static String getString(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }
}
