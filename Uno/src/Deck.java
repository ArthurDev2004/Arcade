import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> cards;
    
    public Deck(){
        cards = new ArrayList<>();
    }

    public void addCard(Card card){
        cards.add(card);
    }

    public void printDeck(){
        for(Card card : cards){
            card.printCard();
            System.out.print("\n");
        }
    }

    public void initializeUnoDeck(){
        String[] colors = {"Red", "Blue", "Green", "Yellow"};  // Red, Blue, Green, Yellow
        String[] numbers = {"1","2","3","4","5","6","7","8","9"};
        String[] symbols = {"Ø", "«", "-"}; // skip, reverse, draw 2
        String[] symbols2 = {"=", "?"};     // draw 4, wild

            /*
             *  Ø Skip 
             *  » Reverse
             *  = Draw 2
             *  𝄙 Draw 4
             *  ? Wild
             */


        // add Number cards to deck

        // add four 0's
        for(String color : colors){
            cards.add(new Card(color, "0"));
        }

        // add two sets of 1-9
        for(String number : numbers){
            for(String color : colors){
                cards.add(new Card(color, number));
                cards.add(new Card(color, number));
            }
        }

        // add two sets of skip, reverse, draw 2
        for (String symbol : symbols){
            for(String color : colors){
                cards.add(new Card(color, symbol));
                cards.add(new Card(color, symbol));
            }
        }

        // add four sets of draw 4 and wild
        for (String symbol : symbols2){
            cards.add(new Card(symbol));
            cards.add(new Card(symbol));
            cards.add(new Card(symbol));
            cards.add(new Card(symbol));
        }

        Collections.shuffle(cards);
    }


    
}
