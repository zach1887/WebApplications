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
        int firstChoice[] = new int[2];
        int otherXChoice[] = new int[2];
        int otherOChoice[] = new int[2];
        
        
        Scanner sc = new Scanner(System.in);
        String checkStatus;

        tictactoeBoard = WinLoseorDraw.create_blank_board();
        spaceTaken = WinLoseorDraw.filled_spaces();
        
  
        firstChoice= WinLoseorDraw.validate_first_choice();
        inputNumber1 = firstChoice[0];
        inputNumber2 = firstChoice[1];
       
        tictactoeBoard[inputNumber1][inputNumber2] = 'X';
        spaceTaken[inputNumber1][inputNumber2] = true;

        WinLoseorDraw.print_board(tictactoeBoard[0][0], tictactoeBoard[0][1], tictactoeBoard[0][2],
                tictactoeBoard[1][0], tictactoeBoard[1][1], tictactoeBoard[1][2],
                tictactoeBoard[2][0], tictactoeBoard[2][1], tictactoeBoard[2][2]);

        for (int j = 1; j <= 8; j++) {
            if (j % 2 == 1) {
                otherOChoice = WinLoseorDraw.validate_Ochoices(spaceTaken);
                inputNumber1 = otherOChoice[0];
                inputNumber2 = otherOChoice[1];

                tictactoeBoard[inputNumber1][inputNumber2] = 'O';
                spaceTaken[inputNumber1][inputNumber2] = true;
                WinLoseorDraw.print_board(tictactoeBoard[0][0], tictactoeBoard[0][1], tictactoeBoard[0][2],
                        tictactoeBoard[1][0], tictactoeBoard[1][1], tictactoeBoard[1][2],
                        tictactoeBoard[2][0], tictactoeBoard[2][1], tictactoeBoard[2][2]);
                if (j >= 4) {
                    checkStatus = WinLoseorDraw.evaluate_board(tictactoeBoard[0][0], tictactoeBoard[0][1], tictactoeBoard[0][2],
                            tictactoeBoard[1][0], tictactoeBoard[1][1], tictactoeBoard[1][2],
                            tictactoeBoard[2][0], tictactoeBoard[2][1], tictactoeBoard[2][2]);
                    if (!checkStatus.equals("draw")) {
                        break;
                    }
                }

            } else {

                    otherXChoice = WinLoseorDraw.validate_other_Xchoices(spaceTaken);
                    inputNumber1 = otherXChoice[0];
                    inputNumber2 = otherXChoice[1];


                tictactoeBoard[inputNumber1][inputNumber2] = 'X';
                spaceTaken[inputNumber1][inputNumber2] = true;

                WinLoseorDraw.print_board(tictactoeBoard[0][0], tictactoeBoard[0][1], tictactoeBoard[0][2],
                              tictactoeBoard[1][0], tictactoeBoard[1][1], tictactoeBoard[1][2],
                              tictactoeBoard[2][0], tictactoeBoard[2][1], tictactoeBoard[2][2]);                
                if (j >= 4) {
                    checkStatus = WinLoseorDraw.evaluate_board(tictactoeBoard[0][0], tictactoeBoard[0][1], tictactoeBoard[0][2],
                            tictactoeBoard[1][0], tictactoeBoard[1][1], tictactoeBoard[1][2],
                            tictactoeBoard[2][0], tictactoeBoard[2][1], tictactoeBoard[2][2]);
                    if (!checkStatus.equals("draw")) {
                        break;
                    }
                }
            }

        }

        String win = WinLoseorDraw.evaluate_board(tictactoeBoard[0][0], tictactoeBoard[0][1], tictactoeBoard[0][2],
                tictactoeBoard[1][0], tictactoeBoard[1][1], tictactoeBoard[1][2],
                tictactoeBoard[2][0], tictactoeBoard[2][1], tictactoeBoard[2][2]);

        if (win.equals("win")) {
            System.out.println("Nice work, X has won!");
        } else if (win.equals("loss")) {
            System.out.println("Huh, somehow O won.  That's pretty uncommon.");
        } else {
            System.out.println("The game was a draw... the most common result.");
        }
    }

}
