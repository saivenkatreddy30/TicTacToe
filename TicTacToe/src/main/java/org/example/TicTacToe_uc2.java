package org.example;
import java.util.Random;

public class TicTacToe_uc2{

    static char[][] board = new char[3][3];

    // Game state variables
    static char playerSymbol;
    static char computerSymbol;
    static char currentPlayer;

    public static void main(String[] args) {
        initializeBoard();
        tossToDecideFirstPlayer();
        printBoard();
        System.out.println("Current turn: " + currentPlayer);
    }

    // UC1 helper
    static void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    /**
     * UC2: Toss to decide first player and assign symbols
     */
    static void tossToDecideFirstPlayer() {
        Random random = new Random();

        // 0 → Player starts, 1 → Computer starts
        int toss = random.nextInt(2);

        if (toss == 0) {
            playerSymbol = 'X';
            computerSymbol = 'O';
            currentPlayer = playerSymbol;
            System.out.println("Player won the toss! You play first with 'X'");
        } else {
            playerSymbol = 'O';
            computerSymbol = 'X';
            currentPlayer = computerSymbol;
            System.out.println("Computer won the toss! It plays first with 'X'");
        }
    }

    // UC1 helper
    static void printBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }
}
