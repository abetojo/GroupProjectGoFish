package GoFishPackage;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Deck deck = new Deck(); // Object for the Deck
        Player user = new Player(); // Object for User
        Player cpu = new Player(); // Object for CPU

        Scanner input = new Scanner(System.in);

        //System builds the cards
        deck.buildDeck();
        deck.shuffle();

        //Asks user for their name
        String userName = getString(input, "\nEnter your name: ");
        user.setName(userName);

        //Sets opening hand for players
        user.setOpeningHand(deck);
        cpu.setOpeningHand(deck);

        System.out.println("\nYOUR HAND:" + user.getHand());

        int hadCard = 0;

        //Players ask others for card
        while (!deck.getDeck().isEmpty()) {
            System.out.println("\nAsk your opponent for a card");
            String card = user.askForCard();
            for (int i = 0; i < cpu.getHand().size(); i++) {
                if (card.equals(cpu.getHand().get(i))) {
                    System.out.println("\nThey had the card! A " + card 
                            + " card has been added to your hand");
                    String newUserCard = cpu.giveCard(card);
                    if (newUserCard != null) {
                        user.getHand().add(newUserCard);
                        user.setOfFour(newUserCard);
                    }
                    System.out.println("\nCPU HAND:" + cpu.getHand());
                    System.out.println("YOUR HAND:" + user.getHand() + "\n");
                    hadCard = 1;
                    break;
                }
            }

            //Tells cpu to go fish, if missing card
            if (hadCard == 0) {
                System.out.println("\nThe CPU doesn't have the card, "
                        + "you need to go Fish!");
                String newCard = user.goFish(deck);
                deck.getDeck().remove(0);
                user.getHand().add(newCard);
                System.out.println("\nAn " + newCard 
                        + " Card has been added to your hand");
                System.out.println("\nYOUR NEW HAND:" + user.getHand() + "\n");

                user.setOfFour(newCard);
            }

            hadCard = 0;

            //Cpu half of the turn
            System.out.println("-------------------------------------------" 
                    + "----------------------------------------------------");
            System.out.println("\nThe CPU will now ask you for a card");
            String card2 = cpu.askUserForCard();
            System.out.println("Card grabbed is: " + card2);
            for (int i = 0; i < cpu.getHand().size(); i++) {
                if (card2.equals(user.getHand().get(i))) {
                    System.out.println("\nYou had the card! A " + card2 
                            + " card has been added to their hand");
                    String newCpuCard = user.giveCard(card2);
                    if (newCpuCard != null) {
                        cpu.getHand().add(newCpuCard);
                        cpu.setOfFour(newCpuCard);
                    }
                    System.out.println("YOUR HAND:" + user.getHand());
                    hadCard = 1;
                    break;
                }
            }
            //Tells user to go fish, if missing card
            if (hadCard == 0) {
                System.out.println("\nYou do not have their card, "
                        + "they need to go Fish!");
                String newCard = cpu.goFish(deck);
                deck.getDeck().remove(0);
                cpu.getHand().add(newCard);
                cpu.setOfFour(newCard);
            }
            hadCard = 0;
        }

        //Declares Winner
        if (cpu.getNumSets() > user.getNumSets()) {
            System.out.println("-------------------------------------------" 
                    + "----------------------------------------------------");
            System.out.println("\nThe CPU has won the game!!!");
        } else if (cpu.getNumSets() == user.getNumSets()) {
            System.out.println("-------------------------------------------" 
                    + "----------------------------------------------------");
            System.out.println("\nThe game has ended in a draw!!!");
        } else {
            System.out.println("-------------------------------------------" 
                    + "----------------------------------------------------");
            System.out.println("\nCongratulations " + userName 
                    + " you have won the game!!!!");
        }

    }

    //Method to get user input
    public static String getString(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }
}
