# tictactoe

#a projrct inspirped by Graham Mitchell
http://programmingbydoing.com/a/tic-tac-toe-oop.html

board	a two-dimensional array of chars
turns	an integer keeping track of the number of turns played this game
Constructors
TicTacToeClass()	the default constructor, which just creates the two-dimensional array and fills each slot with ' ' (a blank space) and initializes the other attributes
Accessors
boolean isWinner(char p)	returns true if the letter passed in currently has three in a row. That is, isWinner('X') will return true if X has won, and isWinner('O') will return true if O has won
boolean isFull()	returns true if nine turns have been played and false otherwise
boolean isCat()	returns true if all nine spaces are filled AND neither X nor O has won
boolean isValid( int r, int c )	returns true if the given row and column corresponds to a valid space on the board
int numTurns()	returns the numbers of turns played so far
char playerAt( int r, int c )	returns the character representing the piece at the given location. Should return either ' ', 'X', or 'O'.
void displayBoard()	displays the current board on the screen
Modifiers
void playMove(char p, int r, int c)	allows the given player to place their move at the given row and column. The row and column numbers are 0-based, so valid numbers are 0, 1, or 2
