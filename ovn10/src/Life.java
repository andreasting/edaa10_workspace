public class Life {

    private LifeBoard board, tempBoard;
    private int boardRows, boardCols, neighbors;
    private boolean fill;


    public Life(LifeBoard board) {
        this.board = board;
        this.boardRows = this.board.getRows();
        this.boardCols = this.board.getCols();
        fill = false;
        tempBoard = new LifeBoard(boardRows, boardCols);

        this.neighbors = 0;


    }

    public void newGeneration() {

        this.board.increaseGeneration();


        for (int i = 1; i < boardRows; i++) {

            for (int j = 1; j < boardCols; j++) {

                neighbors = getNeighbors(board, i, j);
                fill = board.get(i, j);
                tempBoard.put(i, j, fill);


                if (neighbors <= 1 || neighbors >= 4) {
                    tempBoard.put(i, j, false);

                }

                if (neighbors == 3 && !fill) {
                    tempBoard.put(i, j, true);
                }

                if (neighbors == 2 && fill) {
                    tempBoard.put(i, j, true);
                }


            }

        }

        for (int i = 0; i < boardRows; i++) {

            for (int j = 0; j < boardCols; j++) {
                fill = tempBoard.get(i, j);
                this.board.put(i, j, fill);

            }
        }


    }


    public void flip(int row, int col) {


        board.put(row, col, !board.get(row, col));


    }

    private int getNeighbors(LifeBoard board, int row, int col) {


        int totalNeighbors = 0;

        for (int i = (-1); i <= 1; i++) {

            for (int j = (-1); j <= 1; j++) {

                if (board.get(i + row, j + col)) {
                    totalNeighbors++;
                }
                if (board.get(i + row, j + col) && i == 0 && j == 0) {
                    totalNeighbors--;
                }


            }
        }


        return totalNeighbors;
    }
}
