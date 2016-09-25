/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2Lab2;

import java.util.Scanner;

/**
 *
 * @author Jesse
 */
public class RPSMethods {

    public static int validate_numgames() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's play Rock, Paper, Scissors");
        System.out.print("How many times do you want to play?  ");
        int numGames = sc.nextInt();
        while (numGames < 1 || numGames > 10) {
            System.out.println("Not a valid input.  Select a number from 1 to 10.");
            System.out.print("How many times do you want to play?  ");
            numGames = sc.nextInt();
        }
        return numGames;
    }

    public static int validate_player_choice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Select 1 for Rock, 2 for Paper, and 3 for Scissors:");
        int playerChoice = sc.nextInt();
        while (playerChoice < 1 || playerChoice > 3) {
            System.out.println("Not a valid input.");
            System.out.print("Select 1 for Rock, 2 for Paper, and 3 for Scissors:");
            playerChoice = sc.nextInt();
        }
        return playerChoice;

    }

    public static int evaluate_outcome(int pChoice, int cChoice) {
        int Outcome;
        if ((pChoice == 1 && cChoice == 3)
                || (pChoice == 2 && cChoice == 1)
                || (pChoice == 3 && cChoice == 2)) {
            Outcome = 1;
        } else if ((pChoice == 3 && cChoice == 1)
                || (pChoice == 1 && cChoice == 2)
                || (pChoice == 2 && cChoice == 3)) {
            Outcome = -1;
        } else {
            Outcome = 0;
        }
        return Outcome;
    }

    public static String print_explanation(int pCh, int cCh) {
        String expl;
        int total = pCh + cCh;

        if (pCh == cCh) {
            return "";
        } else if (total == 3) {
            return "  Paper covers Rock.";
        } else if (total == 4) {
            return "  Rock crushes Scissors.";
        } else if (total == 5) {
            return "  Scissors cut Paper.";
        } else {
            return "  What went wrong?";
        }

    }

    public static String validate_newgame() {
        Scanner sc = new Scanner(System.in);
        String output;
        System.out.print("Would you like to play again? (y/n)?");
        String newGame = sc.next();
        if (!newGame.equals("y") && !newGame.equals("n")) {
            System.out.println("Invalid character.  Please select again.");
            System.out.print("Would you like to play again? (y/n)?");
            newGame = sc.next();
            if (!newGame.equals("y") && !newGame.equals("n")) {
                System.out.println("I'll take that as a no.");
                System.out.println("Thanks for playing!");
                return "n";
            }
        }
        return newGame;

    }

    public static void final_output(int numWins, int numLosses, int numDraws) {
        System.out.println("You won " + numWins + " games, lost "
                + numLosses + " games, and we drew "
                + numDraws + " games.");
        if (numWins - numLosses == 1) {
            System.out.println("You win the match by a single games!");
        } else if (numWins - numLosses == -1) {
            System.out.println("The computer wins the match by a single game!");
        } else if (numWins > numLosses) {
            System.out.println("You win the match by " + (numWins - numLosses) + " games!");
        } else if (numWins < numLosses) {
            System.out.println("The computer won the match by " + (numLosses - numWins) + " games!");
        } else {
            System.out.println("The match is a draw.");
        }
    }
}
