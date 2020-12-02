import java.util.Scanner;
public class BookKeeper {
    public static void main(String[] args) {
        Dialog dialog = new Dialog();
        Register reg = new Register();
        Boolean run = true;
        String fileName = "";

        while(run){

            switch(dialog.readInt(
                     "Select your function:" + "\n" +
                        "0: Exits program" + "\n" +
                        "1: Add book \n" +
                        "2: Remove books \n" +
                        "3: Search for book \n" +
                        "4: Display all books \n" +
                        "5: Get books from register \n" +
                        "6: Save books from register \n")) {
                case 0:
                    run = false;
                    break;
                case 1:
                    reg.addBook(dialog.readString("Author"), dialog.readString("Title"));
                    break;
                case 2:
                    reg.removeBook(dialog.readString(
                            "Insert name of author to remove their books from the registry "));
                    break;
                case 3:
                    switch(dialog.readInt(
                            "Search for author or title?" + "\n" +
                            "1 for author, 2 for title")){
                        case 1:
                            dialog.printString(reg.searchAuthor(dialog.readString(
                                    "Input name of author")));
                            break;
                        case 2:
                            dialog.printString(reg.searchTitle(dialog.readString(
                                    "Input name of book")));
                            break;
                        default:
                            break;
                    }
                    break;
                case 4:
                    switch(dialog.readInt(
                            "Sort by author or title?" + "\n" +
                                    "1 for author, 2 for title")){
                        case 1:
                            dialog.printString(reg.sortByAuthor());
                            break;
                        case 2:
                                dialog.printString(reg.sortByTitle());
                            break;
                        default:
                            break;
                    }
                    break;
                case 5:
                    fileName = dialog.readString
                            ("Enter the filename of the existing book registry (ends in \".txt\"");

                    if(reg.readFromFile(fileName))
                    {
                        dialog.printString("Book registry succesfully imported from " + fileName + " !");
                    }
                    else{
                        dialog.printString("No such file found!");
                    }
                    break;

                case 6:
                    fileName = (dialog.readString
                            ("Enter the name of the file you want to save your existing books to" +
                                    " (ends in \" .txt \"" ));

                    if(reg.writeToFile(fileName))
                    {
                        dialog.printString("Succesfully written to " + fileName + " !");
                    }
                    break;
                case Integer.MAX_VALUE:
                    run = false;
                    break;



            }
        }
    }
}
