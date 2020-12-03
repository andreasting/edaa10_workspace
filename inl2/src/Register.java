import java.util.ArrayList;
import java.io.File;
import java.util.Collections;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Register {
    private ArrayList<Book> reg;
    private StringBuilder sb;
    private String tempToSort;
    private ArrayList<String> tempList;
    private Scanner scan;
    private int linesRead;
    private String authorToAdd;
    private String titleToAdd;
    private ArrayList<Boolean> filledIndex;

    PrintWriter out = null;

    public Register(){
        reg = new ArrayList<>();
        sb = new StringBuilder();
        tempList = new ArrayList<>();
        tempToSort = "";
        linesRead = 0;
        authorToAdd = "";
        titleToAdd = "";
        filledIndex = new ArrayList<>();

    }

    public void addBook(String author, String title){
        reg.add(new Book(author, title));
    }

    public void removeBook(String author){
        for(int i = 0; i< reg.size(); i++){
            if(author.compareToIgnoreCase(reg.get(i).getAuthor())<= 0){
                reg.remove(i);

            }
        }
    }

    //
    public String searchAuthor(String author){
        sb.setLength(0);
        for(int i = 0; i< reg.size(); i++){
            if(author.compareToIgnoreCase(reg.get(i).getAuthor())<= 0){
                sb.append(reg.get(i).getAuthor() + "\n");
                sb.append(reg.get(i).getTitle() + "\n");

            }
        }
        if (sb.length() == 0){
            sb.append("No books with that author found!");

        }
        return sb.toString(); // Returnerar appendade strängar i stringbuilder till en enda sträng

    }
    public String searchTitle(String title){
        sb.setLength(0);
        for(int i = 0; i< reg.size(); i++){
            if(title.compareToIgnoreCase(reg.get(i).getTitle())<= 0){
                sb.append(reg.get(i).getAuthor() + "\n");
                sb.append(reg.get(i).getTitle() + "\n" +
                        "\n");

            }

        }
        if (sb.length() == 0){
            sb.append("No books with that title found!");

        }
        return sb.toString(); // Returnerar appendade strängar i stringbuilder till en enda sträng
    }
    public String sortByTitle(){

        //Kör en reset på  alla använda variabler så vi tar bort eventuellt lagrade värden
        tempToSort = "";
        tempList.clear();
        filledIndex.clear();
        sb.setLength(0);

        //Fyller den temporära ArrayListen med titlarna av böckerna
        for (int i = 0; i<reg.size(); i++){
            tempList.add(reg.get(i).getTitle());
        }

        java.util.Collections.sort(tempList);



        // Jämför ArrayList titles med reg, om en exakt match hittas läggs Först titeln sedan författaren till
        // Stringbuildern

        for(int i = 0; i < tempList.size(); i++){

            for(int j = 0; (j<tempList.size()); j++){
                filledIndex.add(j,false);
                if(tempList.get(i).compareTo(reg.get(j).getTitle()) ==0 && !filledIndex.get(j)){
                    filledIndex.add(j,true);
                    sb.append(reg.get(j).getTitle() + "\n");
                    sb.append(reg.get(j).getAuthor() + "\n" + "\n");
                    j = tempList.size();
                }

        }

        }
        return sb.toString();

    }

    //I Stort sett samma som sortByTitle, bara med Author
    public String sortByAuthor() {
        //Kör en reset på  alla använda variabler så vi tar bort eventuellt lagrade värden
        tempToSort = "";
        tempList.clear();
        filledIndex.clear();
        sb.setLength(0);

        //Fyller den temporära ArrayListen med författarna
        for (int i = 0; i<reg.size(); i++){
            tempList.add(reg.get(i).getAuthor());
        }
        Collections.sort(tempList);


        // Jämför ArrayList titles med reg, om en exakt match hittas läggs Först författaren till sedan titeln

        for(int i = 0; i < tempList.size(); i++){

            for(int j = 0; j<tempList.size(); j++){
                filledIndex.add(j,false);
                if(tempList.get(i).compareToIgnoreCase(reg.get(j).getAuthor()) ==0 && !filledIndex.get(j)){
                    filledIndex.add(j,true);
                    sb.append(reg.get(j).getAuthor() + "\n");
                    sb.append(reg.get(j).getTitle() + "\n" + "\n");
                }

            }

        }
        return sb.toString();

    }


    public Boolean readFromFile(String filename){
        linesRead = 0;

        try{
            scan = new Scanner((new File(filename)));
        }catch(FileNotFoundException e){
            return false;
        }
       while(scan.hasNextLine()){
           if(linesRead%2 == 0){
               authorToAdd =scan.nextLine();
           }
           if(linesRead%2 == 1){
               titleToAdd =scan.nextLine();
               addBook(authorToAdd,titleToAdd);
           }

           linesRead++;
       }
       return true;


    }

    // Om filen kan inte sparas skickas den till Main classen där den ger en error
    public Boolean writeToFile(String fileName){
        try{
            out = new PrintWriter(new File (fileName));
        }catch(FileNotFoundException e){
            return false;
        }
        for(int i = 0; i<reg.size(); i++){
            out.print(reg.get(i).getAuthor() + "\n");
            out.print(reg.get(i).getTitle()+"\n");
        }

        out.close();
        return true;
    }
}
