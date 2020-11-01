import java.util.Random;
import java.util.Scanner;

public class Blackjack {
    int cardValue,sum,totalCards,input;
    Random rand;
    Scanner scan;
    int[] cardDrawn;
    boolean continueGame;
    Blackjack(){
        rand = new Random();
        cardValue = 2;
        sum = 0;
        cardDrawn = new int[5];
        totalCards = 0;
        continueGame = true;
        input = -1;
        scan = new Scanner(System.in);
    }
    void DrawCard(){
        cardDrawn[totalCards] = rand.nextInt(13)+2;
        totalCards++;

    }
    void calculateSum() {
        sum += cardDrawn[totalCards];
    }
    boolean keepPlaying(){
        if(sum>=21){
            continueGame = false;
        }
        else{
            System.out.print("Do you draw another card? (0 no, 1 yes)");
            input = scan.nextInt();
            if(input==0){
                continueGame =false;
            }
            else if(input==1){
                continueGame =true;
            }
        }
        return continueGame;
    }

    int getSum(){
        return sum;
    }

    void gameResults(int dealerSum){
        if(sum == 21){
            System.out.println("Blackjack!");
        }
        else if(sum >21){
            System.out.println("You busted!");
        }
        else if(sum<21){
            if (sum>dealerSum){
                System.out.println("Winner! Your " + sum + "wins over the dealer's" + dealerSum);
            }
            else{
                System.out.println("You lost! The dealer won with " + dealerSum + "vs your " +  sum);
            }
        }
    }

}

