import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Deck main_deck = new Deck(); //     
        main_deck.initializeUnoDeck(); //   creates a 108 card Uno deck that is randomized

        Deck hand1 = new Deck();
        Deck hand2 = new Deck();

        for(int i = 0; i < 7; i++){
            hand1.addCard(main_deck.cards.remove(0));
            hand2.addCard(main_deck.cards.remove(0));
        }

        System.out.println("Hand 1:");
        hand1.printDeck();
        System.out.println("Hand 2:");
        hand2.printDeck();        
        


    }   
}
