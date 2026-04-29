public class TicTacToe_uc9 {

    static char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

    // Check if a player has won
    public static boolean checkWin(char p) {

        // Rows
        for (int i = 0; i < 9; i += 3) {
            if (board[i] == p && board[i+1] == p && board[i+2] == p)
                return true;
        }

        // Columns
        for (int i = 0; i < 3; i++) {
            if (board[i] == p && board[i+3] == p && board[i+6] == p)
                return true;
        }

        // Diagonals
        if (board[0] == p && board[4] == p && board[8] == p)
            return true;

        if (board[2] == p && board[4] == p && board[6] == p)
            return true;

        return false;
    }

    // Example main to test
    public static void main(String[] args) {

        // Example board (X wins)
        board[0] = 'X';
        board[1] = 'X';
        board[2] = 'X';

        if (checkWin('X'))
            System.out.println("Player X Wins!");
        else
            System.out.println("No Winner");
    }
}