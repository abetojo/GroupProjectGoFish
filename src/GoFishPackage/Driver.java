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
        
        //Asks user for their name
        String userName = getString(input, "Enter your name: ");
        user.setName(userName);
        cpu.setName("Player");

        //** needs fixing (only grabs index, not string)
        user.setOpeningHand(deck.getDeck());
        cpu.setOpeningHand(deck.getDeck());
        
        //**User asks cpu for card
        String askCpu = user.askForCard();
        //If the player does not have the card, they tell the user to Go Fish.
        user.giveCard(askCpu);
        
        //**Same thing here for cpu
        String askUser = cpu.askForCard();
        cpu.giveCard(askUser);
        
        
        //**Declares the winner
        fish.declareWinner(user, cpu);
        
        //** unsure how to make a setFour method work for deck class
        //** may need to make if statements inside methods for setFour()
        //                      ** for removing the cards or not
        

    }

    public static String getString(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }
}
