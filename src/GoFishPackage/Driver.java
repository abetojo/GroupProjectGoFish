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

        int hadCard = 0;
        
        while(!deck.getDeck().isEmpty()) {
            System.out.println("Ask your opponent for a card");
            String card = user.askForCard();
            for(int i = 0; i < cpu.getHand().size(); i++) {
                if(card.equals(cpu.getHand().get(i))) {
                    System.out.println("They had the card! A " + card + " card has been added to your hand");
                    String newUserCard = cpu.giveCard(card);
                    user.getHand().add(newUserCard);
                    System.out.println("CPU HAND:" + cpu.getHand());
                    System.out.println("YOUR HAND:" + user.getHand());
                    hadCard = 1;
                    break;
                } 
            }
        if(hadCard == 0) {
            System.out.println("The CPU doesn't have the card, you need to go Fish!");
            String newCard = user.goFish(deck);
            user.getHand().add(newCard);
            System.out.println("An " + newCard + " Card has been added to your hand");
            System.out.println("YOUR NEW HAND:" + user.getHand());
        }

        



        }   
    }

    public static String getString(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }
}
