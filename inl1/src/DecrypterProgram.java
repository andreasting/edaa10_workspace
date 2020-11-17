import se.lth.cs.p.inl1.nbr6.*;
import se.lth.cs.p.inl1.*;


public class DecrypterProgram {

    public static void main(String[] args){

        Key key = new Key();
        Decryptographer decrypter = new Decryptographer(key);

        TextWindow cryptoWindow = new TextWindow("Krypterade meddelanden");
        TextView cryptoView = new TextView("Krypterade meddelanden", 5, 150);

        TextWindow decodedWindow = new TextWindow("Avkodade meddelanden");
        TextView decodedView = new TextView("Avkodade meddelanden", 5, 150);
        TestCase test = new TestCase();

        TextWindow myDecodedWindow = new TextWindow("Mina avkodningar");
        TextView myDecodedView = new TextView("Mina avkodningar", 5, 150);



        cryptoWindow.addView(cryptoView);
        decodedWindow.addView(decodedView);
        myDecodedWindow.addView(myDecodedView);


        for (int i = 1; i<=5; i++){
            cryptoWindow.setTitle("Krypterade meddelande " +i);
            cryptoView.displayText(test.getCryptoText(i));


            decodedWindow.setTitle("Avkodade meddelande " +i);
            decodedView.displayText(test.getClearText(i));

            myDecodedWindow.setTitle("Min avkodning av meddelande " +i);
            myDecodedView.displayText(decrypter.decrypt(test.getCryptoText(i)));

            myDecodedWindow.waitForMouseClick();
            }


        }



    }

