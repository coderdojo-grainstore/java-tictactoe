public class TicTacToe {

    private char[][] board; 
    private char currentPlayerMark;
			
    
    public static void main(String args[]){
    	
    	// Create game and initialize it.
    	// First player will be 'x'
    	TicTacToe game = new TicTacToe();

    	// Player 'x' places a mark in the top right corner row 0, column 2
    	// These values are based on a zero index array, so you may need to simply 
    	// take in a row 1 and subtract 1 from it if you want that.
    	game.placeMark(0,2);

    	// Lets print the board
    	game.printBoard();


    	// No winner or draw, switch players to 'o'
    	game.changePlayer();

    }
    
    public TicTacToe() {
    	
        board = new char[3][3];
        currentPlayerMark = 'x';
        
        initializeBoard();
    }
	
	
    // Set/Reset the board back to all empty values.
    public void initializeBoard() {
		
        // Loop through rows
        for (int i = 0; i < 3; i++) {
			
            // Loop through columns
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }
	
	
    // Print the current board (may be replaced by GUI implementation later)
    public void printBoard() {
        System.out.println("-------------");
		
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
	
    // Change player marks back and forth.
    public void changePlayer() {
        if (currentPlayerMark == 'x') {
            currentPlayerMark = 'o';
        }
        else {
            currentPlayerMark = 'x';
        }
    }
	
	
    // Places a mark at the cell specified by row and col with the mark of the current player.
    public boolean placeMark(int row, int col) {
		
        // Make sure that row and column are in bounds of the board.
        if ((row >= 0) && (row < 3)) {
            if ((col >= 0) && (col < 3)) {
                if (board[row][col] == '-') {
                    board[row][col] = currentPlayerMark;
                    return true;
                }
            }
        }
		
        return false;
    }
    
    /**
     *   checkForWin()
     *   checkColumnsForWin()
     *   checkRowsForWin()
     *   checkDiagonalsForWin()
     *   isBoardFull()
     *   
     */


}
