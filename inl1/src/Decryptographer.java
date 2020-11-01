import se.lth.cs.p.inl1.nbr6.*;

public class Decryptographer {

    private StringBuilder stringBuilder;
    private char letter;
    private int index;
    private Key key;
    private String message;

    public Decryptographer(Key key) {
        this.letter = 'a';
        this.index = 0;
        this.key = key;
        message = "blank";
        stringBuilder = new StringBuilder();



    }

     public String decrypt(String text) {

        message = "";
        int messageLength = text.length();
        int j = 1;
        for (int i = 0; i < messageLength; i++){

            if(j>4){
                j = 0;
            }

                index = key.getNumber(j);
                letter = text.charAt(i);

                // Hoppar över blanksteg
                if(letter == 32){
                    stringBuilder.append(letter);
                    i++;
                    letter = text.charAt(i);


                }
                letter = (char) (letter - (index%26+1));
                while(letter<65){
                    index = index%25;
                    letter = (char)(65+index);

            }


                stringBuilder.append(letter);
                j++;



            }
         return stringBuilder.toString();
    }

}

