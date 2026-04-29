import java.util.Random;

public class TicTacToe_uc7 {

    // Board array
    static char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

    // Display board
    public static void displayBoard() {
        System.out.println();
        for (int i = 0; i < 9; i++) {

            String value;
            if (board[i] == ' ')
                value = String.valueOf(i + 1);
            else
                value = String.valueOf(board[i]);

            System.out.print(" " + value + " ");

            if ((i + 1) % 3 == 0)
                System.out.println();
            else
                System.out.print("|");
        }
        System.out.println();
    }

    // Check valid move
    public static boolean isValidMove(int pos) {
        return board[pos] == ' ';
    }

    // Computer move
    public static void computerMove() {
        Random rand = new Random();
        int pos;

        while (true) {
            pos = rand.nextInt(9); // 0–8
            if (isValidMove(pos)) {
                board[pos] = 'O';
                System.out.println("Computer chose: " + (pos + 1));
                break;
            }
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {
        displayBoard();
        computerMove();
        displayBoard();
    }
}