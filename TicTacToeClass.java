public class TicTacToeClass
{
    // Instance Variables
    private char[][] board;
    private int turns;

    // Constructors
    public TicTacToeClass()
    {
        //creates 2d board as array object
        board = new char[3][3];
        //starts turns at 0
        turns = 0;

        //iterates through the board filling blanks
        for ( int r=0; r<3; r++ )
            for ( int c=0; c<3; c++ )
                board[r][c] = ' ';
    }

    // Accessor Methods

    public boolean isWinner( char p )
    {
        // 8 if statements

        //top
        //middle
        //bottom
        //left
        //center
        //right
        // I don't remember which loop is which dimension ###########################
        int i;
        for( i=0; i<3; i++){
            if (this.board[0][i] == p) {
                if (this.board[1][i] == p) {
                    if (this.board[2][i] == p) {
                        return true;
                    }
                }
            }
        }
        for( i=0; i<3; i++){
            if (this.board[i][0] == p) {
                if (this.board[i][1] == p) {
                    if (this.board[i][2] == p) {
                        return true;
                    }
                }
            }
        }
        //downslope
        //upslope
        if (this.board[1][1] == p){
            if (this.board[0][0] == p) {
                if (this.board[2][2] == p) {
                    return true;
                }
            }
            if (this.board[0][2] == p) {
                if (this.board[2][0] == p) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isFull()
    {
        if (turns >= 9 ){   //   MIGHT NEED TO ADJUST ##############################
            return true;
        }
        return false;
    }

    public boolean isCat() {
        if (isWinner('X') || isWinner('O')) {
            return false;
        }
        if (turns < 9 ){   //   The game is still afoot!
            return false;
        }
        return true;
    }

    // checks to make sure a player entry is on the board
    public boolean isValid( int r, int c )
    {
        if ( 0 <= r && r <= 2 && 0 <= c && c <= 2 )
            return true;
        else
            return false;
    }

    public int numTurns()
    {
        return turns;
    }

    public char playerAt( int r, int c )
    {
        if ( isValid(r,c) )
            return board[r][c];
        else
            return '@';
    }

    public void displayBoard()
    {
        System.out.println(" ROWS ");
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 COLUMNS");
    }

    // Modifiers
    public void playMove( char p, int r, int c )
    {
        if ( playerAt(r,c) == ' ' ){
            this.board[r][c] = p;
            this.turns++;
        }
    }

}