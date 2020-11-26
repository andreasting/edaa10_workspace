public class LifeBoard {
	private int generation;
	private boolean[][] board;
	private int boardCols;
	private int boardRows;

	/** Skapar en spelplan med rows rader och cols kolonner. Spelplanen �r fr�n
	    b�rjan tom, dvs alla rutorna �r tomma och generationsnumret �r 1. */	
	public LifeBoard(int rows, int cols) {
		this.generation = 1;
		this.board = new boolean[rows][cols];
		this.boardCols = cols;
		this.boardRows = rows;




	}

	/** Ger true om det finns en individ i rutan med index row, col, false annars. 
	    Om index row, col �r utanf�r spelplanen returneras false */
	public boolean get(int row, int col) {

		if(row>=this.boardRows || col>=this.boardCols){
			return false;
		}

		if(row<0 || col<0){
			return false;
		}

		return this.board[row][col];
	}

	/** Lagrar v�rdet val i rutan med index row, col */
	public void put(int row, int col, boolean val) {
		this.board[row][col] = val;

	}

	/** Tar reda p� antalet rader */
	public int getRows() {
		return this.boardRows;
	}

 	/** Tar reda p� antalet kolonner */
	public int getCols() {
		return this.boardCols;
	}

	/** Tar reda p� aktuellt generationsnummer */
	public int getGeneration() {
		return this.generation;
	}

	/** �kar generationsnumret med ett */
	public void increaseGeneration() {

		this.generation++;
	}


	}

