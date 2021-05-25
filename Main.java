import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        TicTacToeClass game = new TicTacToeClass();
        //user input
        int row;
        int column;
        //player variables
        char winner = 'C';
        char[] players = {'X', 'O'}; // 'X' goes first
        char p; //current player
        char lastp;
        String quit;

        //game play, turns greater than 9 should never happen
        while (flag) {
            while (game.numTurns() < 10) {
                //whose turn is it?
                p = players[game.numTurns() % 2];
                lastp = players[(game.numTurns() + 1) % 2];

                game.displayBoard();
                //check for winner after last move
                if (game.numTurns() > 4) {
                    if (game.isWinner(lastp)) {
                        winner = lastp;
                        break;
                    }
                    //checks for cat game
                    if (game.numTurns() >= 9) {
                        if(game.isCat()){
                            winner = 'C';
                            break;
                        }
                    }
                }
                System.out.printf("Player %c, please choose a row. \n", p);
                try {
                    row = Integer.parseInt(input.next());
                } catch (Exception e) {
                    System.out.printf("\n \n \n Oops! Try again. \n");
                    continue;
                }
                System.out.printf("Player %c, please choose a column. \n", p);
                try {
                    column = Integer.parseInt(input.next());
                } catch (Exception e) {
                    System.out.printf("\n \n \n Oops! Try again. \n");
                    continue;
                }
                game.playMove(p, row, column);
                if ( game.playerAt(row,column) != ' ' ){
                    System.out.printf("\n \n \n Oops! Try again. \n");
                }
            }
            if (winner == 'C') {
                System.out.printf("Cat Game! \n \n");
            } else {
                System.out.printf("Congratulations %c, you win! \n \n", winner);
            }
            System.out.println("Would you like to play again?");
            quit = input.next();
            flag = quit.equals("Y") || quit.equals("y");
        }
    }
}