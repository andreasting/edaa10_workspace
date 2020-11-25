public class LifeController {

    public static void main(String[] args) {
        int choice;
        boolean running = true;
        LifeBoard board = new LifeBoard(10, 10);
        Life game = new Life(board);

        LifeView lifeWindow = new LifeView(board);
        lifeWindow.drawBoard();


        while (running) {

            choice = lifeWindow.getCommand();


            if (choice == 3) {
                running = false;
            }
            if(choice == 2){

                    game.newGeneration();


            }
            if(choice ==1){
                game.flip(lifeWindow.getRow(),lifeWindow.getCol());

            }

            lifeWindow.update();


        }
        System.exit(0);

    }

    // Inte min kod, ville bara prova automatisk generering
    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}