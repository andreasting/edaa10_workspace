public class Patiens {



    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        final int GAMES = 15020;
        int gamesWon = 0;

        for (int i = 0; i < 5; i++) {
            deck.shuffle();
        }

        for(int i = 0; i<=GAMES; i++){
            if(patiensSpel(deck)){
                gamesWon++;
            }
        }
        System.out.println("Sannolikheten att vinna är " + (float)gamesWon/GAMES);

    }

    static boolean patiensSpel(CardDeck deck) {
        int numCard = 1;
        deck.shuffle();
        boolean badGame;

        Card drawnCard = new Card(1, 1);

            do{

                if (numCard > 3) {
                    numCard = 1;
                }

                drawnCard = deck.getCard();
                badGame = lostGame(numCard, drawnCard);

                numCard++;


                } while (deck.moreCards() && !badGame);

            //Spelet avbryts för två anledningar, antingen har man slut på kort eller så
        // har man fått två lika. Om man har fler kort tillgodo kan man dra slutsatsen att
        // ett lika kort har dragits.

        if(deck.moreCards())
            return false;

        return true;



    }

    static boolean lostGame(int numCard, Card drawnCard) {

        if (numCard == drawnCard.getRank())
            return true;

        return false;
    }


}
