package com.masai;
import java.util.Scanner;


public class TicTacToe {

    private char[][] board;
    char currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        System.out.println();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
          
        }
    }

    public boolean makeMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != '-') {
            return false;
        }
        board[row][col] = currentPlayer;
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        return true;
    }

    public char checkWinner() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                return board[i][0];
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
                return board[0][j];
            }
        }

        // Check diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return board[0][0];
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '-') {
            return board[0][2];
        }

        return '-';
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }


// Example usage:

public static void main(String[] args) {
    TicTacToe game = new TicTacToe();
    Scanner sc = new Scanner(System.in);

    while (true) {
        game.printBoard();

        if (game.isBoardFull()) {
            System.out.println("It's a DRAW!!!");
            break;
        }

        System.out.println("Player " + game.currentPlayer + ", enter row and column (0-2) separated by space:");
        int row = sc.nextInt();
        int col = sc.nextInt();

        if (game.makeMove(row, col)) {
            char winner = game.checkWinner();
            if (winner != '-') {
                game.printBoard();
                System.out.println("Congratulations... Player " + winner +" "+ " Ap Jeet Gaye!!!, Thanks for playing.");
               
                break;
            }
        } else {
            System.out.println("Invalid move. Try again.");
        }
    }

    sc.close();
}
}