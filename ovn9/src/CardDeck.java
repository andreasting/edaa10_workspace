import java.util.Random;
public class CardDeck {
    private Card[] theCards;
    private int stored;
    private int cardToAdd;
    private Card shuffledCard;
    private int topCard;
    private Card drawnCard;
    Random rand;

    public CardDeck(){
        theCards = new Card[52];
        int stored = 0;
        cardToAdd = 0;
        rand = new Random();
        shuffledCard = new Card(1,1);
        topCard = 51;
        drawnCard = new Card (1, 1);

        for(int suit = Card.SPADES; suit <= Card.CLUBS; suit++){

            for(int i = 13; i>=1; i--) {
                theCards[cardToAdd] = new Card(suit, i);
                cardToAdd++;
            }
        }
        cardToAdd = 0;

    }
    public void shuffle(){
        topCard = 51;

        for(int i = 51; i>=0; i--){
            int stored  = rand.nextInt(52);
            shuffledCard = theCards[i];
            theCards[i] = theCards[stored];
            theCards[stored] = shuffledCard;
        }

    }
    public boolean moreCards(){
        if(topCard<0){
            return false;
        }
        return true;
    }
    public Card getCard(){
            drawnCard = theCards[topCard];
            topCard--;

        return drawnCard;

    }
}
