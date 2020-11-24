public class LifeController {

    public static void main(String[] args) {
        int choice;
        boolean running = true;
        LifeBoard board = new LifeBoard(6, 6);
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
}