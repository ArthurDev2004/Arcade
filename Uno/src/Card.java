public class Card {

    String color;   // (G)reen, (B)lue, (Y)ellow, (R)ed, (B)lack
    String symbol;  //  sd


    // for Colored cards
    public Card(String color, String symbol){
        this.color = color;
        this.symbol = symbol;
    }

    // for Black cards that don't technically have a color
    public Card(String symbol){
        this.color = "Black";
        this.symbol = symbol;
    }

    public void printCard(){

        if(color == "Black"){
            System.out.printf("{X|%s}", symbol);
            return;
        }

        System.out.printf("{%s|%s}", color.charAt(0), symbol);
    }

/*
example: {G|01} to represent a Green 1 card
         {X|W4} to represent a Wild +4 card
         {B|S!} to represent a Blue Skip Card
         {Y|R>} to represent a Yellow Reverse Card
*/
}
