public class Card {

    String color;   // (G)reen (B)lue (Y)ellow (R)ed (X)Black
    String symbol;  //  sd

    public Card(String color, String symbol){
        this.color = color;
        this.symbol = symbol;

    }


    public void printCard(){
        System.out.printf("{%s|%s}", color, symbol);
    }


/*
example: {G|01} to represent a Green 1 card
         {X|W4} to represent a Wild +4 card
         {B|S!} to represent a Blue Skip Card
         {Y|R>} to represent a Yellow Reverse Card
*/
        
}
