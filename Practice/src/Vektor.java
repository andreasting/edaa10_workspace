import java.util.Random;
public class Vektor {
    public static void main(String[] args){
        int dealersResult;
        System.out.println("");
        Blackjack b1 = new Blackjack();
        Blackjack b2 = new Blackjack();

        b1.DrawCard();
        b2.DrawCard();

        if(b1.keepPlaying()){
            b1.DrawCard();
            b2.DrawCard();
        }
        dealersResult = b2.getSum();

        b1.gameResults(dealersResult);


    }
}
