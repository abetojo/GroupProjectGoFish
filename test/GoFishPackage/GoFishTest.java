package GoFishPackage;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GoFishTest {

    @Test
    public void testNewDeck() {
        Deck deck = new Deck();
        deck.buildDeck();
        deck.newDeck();
        boolean result;
        if(deck.getDeck().isEmpty()) {
            result = true;
        } else {
            result = false;
        }
        assertEquals(true, result);
    }

    @Test
    public void testShuffle() {
        Deck deck = new Deck();
        deck.buildDeck();
        Deck deck2 = new Deck();
        deck2.buildDeck();

        deck.shuffle();
        deck2.shuffle();

        boolean result;

        if(deck.equals(deck2)) {
            result = true;
        } else {
            result = false;
        }
        assertEquals(false, result);
    }

    @Test
    public void testSetOfFour() {
        Deck deck = new Deck();
        deck.buildDeck();
        Player player = new Player();
        player.setOpeningHand(deck);

        boolean result;
        if(player.getNumSets() == 0) {
            result = true;
        } else {
            result = false;
        }
        assertEquals(true, result);
    }
    
    //same for askForCard
    @Test
    public void askUserForCard() {
        Deck deck = new Deck();
        deck.buildDeck();
        Player player = new Player();
        player.setOpeningHand(deck);

        boolean result;

        if(player.askUserForCard() != null) {
            result = true;         
        } else {
            result = false;
        }
        assertEquals(true, result);
    }

    @Test
    public void goTestFish() {
        Deck deck = new Deck();
        deck.buildDeck();
        Player player = new Player();

        boolean result;

        String check = player.goFish(deck);
        if(check != null) {
            result = true;
        } else {
            result = false;
        }

        assertEquals(true, result);
    }

    @Test
    public void giveCardTest() {
        Deck deck = new Deck();
        deck.buildDeck();
        Player player = new Player();
        Player player2 = new Player();
        player.setOpeningHand(deck);
        player2.setOpeningHand(deck);

        boolean result;

        String card = player.getHand().get(0);

        for(int i = 0; i < 3; i++) {
            player2.getHand().remove(0);
        }

        String cardTest = player2.getHand().get(0);

        if(!card.equals(cardTest)) {
            result = true;
        } else {
            result = false;
        }

        assertEquals(true, result);
    }

    @Test
    public void setOpeningHandTest() {
        Deck deck = new Deck();
        deck.buildDeck();
        Player player = new Player();
        player.setOpeningHand(deck);

        boolean result;

        if(player.getHand() != null) {
            result = true;
        } else {
            result = false;
        }
        assertEquals(true, result);
    }

}
