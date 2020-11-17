import se.lth.cs.p.inl1.nbr6.*;

public class Decryptographer {

    private StringBuilder stringBuilder;
    private char letter;
    private int index;
    private Key key;
    private char[] charTable;
    private int charsAdded;
    private int keyNumber;


    public Decryptographer(Key key) {

        this.letter = 'a';
        this.index = 0;
        this.key = key;

        stringBuilder = new StringBuilder();
        charTable = new char[124];
        keyNumber = 0;
        charsAdded = 0;

        // Max är 65+25 (90) och max index är 0-99, varav 99+25 = 124
        for (int i = 0; i < 124; i++) {
            if (charsAdded > 25) {
                charsAdded = 0;
            }
            charTable[i] = (char) ('A' + charsAdded);
            charsAdded++;

        }


    }

    public String decrypt(String text) {
        //Återställer texten i stringbuilder för varje ny text
        stringBuilder.setLength(0);

        keyNumber = 0;

        for (int i = 0; i < text.length(); i++) {

            // Om det femte chifferindexet har använts, börja om från chiffer 1 (keynumber 0)

            if (keyNumber > 4) {
                keyNumber = 0;
            }

            index = key.getNumber(keyNumber);
            letter = text.charAt(i);




            // hur kan jag göra detta bättre?
            // uppdaterar inte chiffer-indexet om tecknet är blanksteg

            if (text.charAt(i) != ' ') {
                letter = charTable[letter - 'A' - index % 26 + 26];
                keyNumber++;

            }


            stringBuilder.append(letter);


        }
        return stringBuilder.toString();
    }

}

