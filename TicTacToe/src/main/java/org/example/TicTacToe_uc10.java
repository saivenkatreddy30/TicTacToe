public class TicTacToe_uc10 {

    static char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

    // Check draw
    public static boolean isDraw() {

        // Traverse all cells
        for (int i = 0; i < 9; i++) {
            if (board[i] == ' ') {
                return false; // empty space found → not draw
            }
        }

        return true; // no empty cells → draw
    }

    // Test main
    public static void main(String[] args) {

        // Example: full board (draw)
        board[0] = 'X'; board[1] = 'O'; board[2] = 'X';
        board[3] = 'X'; board[4] = 'O'; board[5] = 'O';
        board[6] = 'O'; board[7] = 'X'; board[8] = 'X';

        if (isDraw())
            System.out.println("It's a Draw!");
        else
            System.out.println("Game Not Finished");
    }
}