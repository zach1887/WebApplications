/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingByDoing.Arrays;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class TicTacToe {

    public static void main(String[] args) {
        char tictactoeBoard[][] = new char[3][3];
        boolean spaceTaken[][] = new boolean[3][3];
        int inputNumber1, inputNumber2;
        Scanner sc = new Scanner(System.in);
        String checkStatus;



        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tictactoeBoard[i][j] = ' ';
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                spaceTaken[i][j] = false;
            }
        }

        System.out.println("Let's play tic-tac toe!");
        System.out.println("Select a location for X, for example 0 0 would be the upper left corner.");
        System.out.println("No parentheses or non-numeric characters, please.");
        System.out.print("Your choice for X:  ");
        inputNumber1 = sc.nextInt();
        inputNumber2 = sc.nextInt();
        while (inputNumber1 < 0 || inputNumber1 > 3
                || inputNumber2 < 0 || inputNumber2 > 3) {
            System.out.println("Your selection is invalid.");
            System.out.println("Your choice:  ");
            inputNumber1 = sc.nextInt();
            inputNumber2 = sc.nextInt();
        }

        tictactoeBoard[inputNumber1][inputNumber2] = 'X';
        spaceTaken[inputNumber1][inputNumber2] = true;

        System.out.println(tictactoeBoard[0][0]
                + " " + tictactoeBoard[0][1]
                + " " + tictactoeBoard[0][2]);

        System.out.println(tictactoeBoard[1][0]
                + " " + tictactoeBoard[1][1]
                + " " + tictactoeBoard[1][2]);

        System.out.println(tictactoeBoard[2][0]
                + " " + tictactoeBoard[2][1]
                + " " + tictactoeBoard[2][2]);

        for (int j = 1; j <= 8; j++) {
            if (j % 2 == 1) {
                System.out.println("Your choice for 0:  ");
                inputNumber1 = sc.nextInt();
                inputNumber2 = sc.nextInt();
                while (inputNumber1 < 0 || inputNumber1 > 3
                        || inputNumber2 < 0 || inputNumber2 > 3
                        || spaceTaken[inputNumber1][inputNumber2] == true) {
                    System.out.println("Your selection is invalid.");
                    System.out.println("Your choice:  ");
                    inputNumber1 = sc.nextInt();
                    inputNumber2 = sc.nextInt();
                }

                tictactoeBoard[inputNumber1][inputNumber2] = 'O';
                spaceTaken[inputNumber1][inputNumber2] = true ;

                System.out.println(tictactoeBoard[0][0]
                        + " " + tictactoeBoard[0][1]
                        + " " + tictactoeBoard[0][2]);

                System.out.println(tictactoeBoard[1][0]
                        + " " + tictactoeBoard[1][1]
                        + " " + tictactoeBoard[1][2]);

                System.out.println(tictactoeBoard[2][0]
                        + " " + tictactoeBoard[2][1]
                        + " " + tictactoeBoard[2][2]);
                checkStatus = WinLoseorDraw.evaluate_board(tictactoeBoard[0][0], tictactoeBoard[0][1], tictactoeBoard[0][2], tictactoeBoard[1][0], tictactoeBoard[1][1], tictactoeBoard[1][2], tictactoeBoard[2][0], tictactoeBoard[2][1], tictactoeBoard[2][2]);
                if (!checkStatus.equals("draw")) break;

            } else {
                System.out.println("Your choice for X:  ");
                inputNumber1 = sc.nextInt();
                inputNumber2 = sc.nextInt();
                while (inputNumber1 < 0 || inputNumber1 > 3
                        || inputNumber2 < 0 || inputNumber2 > 3
                        || spaceTaken[inputNumber1][inputNumber2] == true) {
                    System.out.println("Your selection is invalid.");
                    System.out.println("Your choice:  ");
                    inputNumber1 = sc.nextInt();
                    inputNumber2 = sc.nextInt();
                }

                tictactoeBoard[inputNumber1][inputNumber2] = 'X';
                spaceTaken[inputNumber1][inputNumber2] = true;

                System.out.println(tictactoeBoard[0][0]
                        + " " + tictactoeBoard[0][1]
                        + " " + tictactoeBoard[0][2]);

                System.out.println(tictactoeBoard[1][0]
                        + " " + tictactoeBoard[1][1]
                        + " " + tictactoeBoard[1][2]);

                System.out.println(tictactoeBoard[2][0]
                        + " " + tictactoeBoard[2][1]
                        + " " + tictactoeBoard[2][2]);
                checkStatus = WinLoseorDraw.evaluate_board(tictactoeBoard[0][0], tictactoeBoard[0][1], tictactoeBoard[0][2], tictactoeBoard[1][0], tictactoeBoard[1][1], tictactoeBoard[1][2], tictactoeBoard[2][0], tictactoeBoard[2][1], tictactoeBoard[2][2]);
                if (!checkStatus.equals("draw")) break;
            }

        }

        String win = WinLoseorDraw.evaluate_board(tictactoeBoard[0][0], tictactoeBoard[0][1], tictactoeBoard[0][2], tictactoeBoard[1][0], tictactoeBoard[1][1], tictactoeBoard[1][2], tictactoeBoard[2][0], tictactoeBoard[2][1], tictactoeBoard[2][2]);

        if (win.equals("win")) {
            System.out.println("Nice work, X has won!");
        } else if (win.equals("loss")) {
            System.out.println("Huh, somehow O won.  That's pretty uncommon.");
        } else {
            System.out.println("The game was a draw... the most common result.");
        }
    }

}
