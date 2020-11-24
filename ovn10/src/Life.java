public class Life {

private LifeBoard board,tempBoard;
private int boardRows,boardCols,neighbors;


    public Life(LifeBoard board){
        this.board = board;
        this.boardRows = this.board.getRows();
        this.boardCols = this.board.getCols();
        tempBoard = new LifeBoard(boardRows,boardCols);

        this.neighbors = 0;


    }
    public void newGeneration() {

        this.board.increaseGeneration();


        for (int i = 0; i < boardRows; i++) {

            for (int j = 0; j < boardCols; j++) {

                neighbors = getNeighbors(this.board, i, j);

                if (neighbors < 2 || neighbors > 3) {
                    tempBoard.put(i, j, false);
                }
                if (neighbors == 3) {
                    tempBoard.put(i, j, true);
                }
                else
                    tempBoard.put(i, j, this.board.get(i, j));


            }

        }

        for (int i = 0; i < boardRows; i++) {

            for (int j = 0; j < boardCols; j++) {

                this.board.put(i, j, tempBoard.get(i, j));

            }
        }



        }


    public void flip(int row, int col){

        if(!board.get(row,col)){
            board.put(row,col,true);
        }
        else{
            board.put(row,col,false);
        }

    }
    private int getNeighbors(LifeBoard board, int row, int col){

        int totalNeighbors = 0;


        for(int i = row-1; i <=row+1; i++ ){

            for(int j = col-1; j <=col+1; j++){

                if(board.get(i,j)){
                    totalNeighbors++;
                }

                if(i == row && j == col){
                    totalNeighbors--;
                }


            }
        }
        return totalNeighbors;
    }
}
