import java.util.Scanner;
import java.util.Random;

public class TicTacToe_uc8 {

    static char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

    // Display board
    public static void displayBoard() {
        System.out.println();
        for (int i = 0; i < 9; i++) {
            String value = (board[i] == ' ') ? String.valueOf(i + 1) : String.valueOf(board[i]);
            System.out.print(" " + value + " ");
            if ((i + 1) % 3 == 0) System.out.println();
            else System.out.print("|");
        }
        System.out.println();
    }

    // Check valid move
    public static boolean isValidMove(int pos) {
        return pos >= 0 && pos < 9 && board[pos] == ' ';
    }

    // Player move
    public static void playerMove(Scanner sc) {
        int pos;
        while (true) {
            System.out.print("Enter your move (1-9): ");
            pos = sc.nextInt() - 1;

            if (isValidMove(pos)) {
                board[pos] = 'X';
                break;
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
    }

    // Computer move (random)
    public static void computerMove() {
        Random rand = new Random();
        int pos;

        while (true) {
            pos = rand.nextInt(9);
            if (isValidMove(pos)) {
                board[pos] = 'O';
                System.out.println("Computer chose: " + (pos + 1));
                break;
            }
        }
    }

    // Check win
    public static boolean checkWin(char p) {
        int[][] winPos = {
                {0,1,2},{3,4,5},{6,7,8}, // rows
                {0,3,6},{1,4,7},{2,5,8}, // cols
                {0,4,8},{2,4,6}          // diagonals
        };

        for (int[] w : winPos) {
            if (board[w[0]] == p && board[w[1]] == p && board[w[2]] == p) {
                return true;
            }
        }
        return false;
    }

    // Check draw
    public static boolean isDraw() {
        for (char c : board) {
            if (c == ' ') return false;
        }
        return true;
    }

    // MAIN GAME LOOP (UC8)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean gameOver = false;

        displayBoard();

        while (!gameOver) {

            // Player turn
            playerMove(sc);
            displayBoard();

            if (checkWin('X')) {
                System.out.println("You Win!");
                gameOver = true;
                break;
            }

            if (isDraw()) {
                System.out.println("It's a Draw!");
                break;
            }

            // Computer turn
            computerMove();
            displayBoard();

            if (checkWin('O')) {
                System.out.println("Computer Wins!");
                gameOver = true;
                break;
            }

            if (isDraw()) {
                System.out.println("It's a Draw!");
                break;
            }
        }

        sc.close();
    }
}