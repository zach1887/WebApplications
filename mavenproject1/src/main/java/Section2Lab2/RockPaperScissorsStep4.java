/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2Lab2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jesse
 */
public class RockPaperScissorsStep4 {
     public static void main(String[] args) {
       
    
        int playerChoice, computerChoice, numGames;        
        String playerChoiceText, computerChoiceText;
        String newGame;
        do {
         int numWins =0;
         int numLosses = 0; int numDraws = 0;
        
        Scanner sc = new Scanner (System.in);
        Random rand = new Random ();

        numGames = RPSMethods.validate_numgames();
            
        for (int i = 0; i < numGames; i++) {
        computerChoice= rand.nextInt(3)+1;    
        playerChoice = RPSMethods.validate_player_choice();

        switch (playerChoice) {         // never used, but may come in useful later.
            case 1: playerChoiceText = "Rock"; break;
            case 2: playerChoiceText = "Paper"; break;
            case 3: playerChoiceText = "Scissors"; break;
            default: playerChoiceText = "error"; break;
        }
        switch (computerChoice) {
            case 1: computerChoiceText = "Rock"; break;
            case 2: computerChoiceText = "Paper"; break;
            case 3: computerChoiceText = "Scissors"; break;
            default: computerChoiceText = "error"; break;
        }
              
        
        int outcome = RPSMethods.evaluate_outcome(playerChoice, computerChoice);
        switch (outcome) {
            case -1:  {
                   System.out.print("I selected " + computerChoiceText + ".  You lose.");
                   numLosses++;
                   break;
                 }
            case 0:  {
                    System.out.println("I also selected " + computerChoiceText + ".  It's a draw.");
                    numDraws++;
                    break;
           }
            case 1:  {
                    System.out.print("I selected " + computerChoiceText + ".  You win.");
                     numWins++;
                     break;
                }
            default: break;
            }
                
        System.out.println(RPSMethods.print_explanation(playerChoice, computerChoice));
        }
        
        RPSMethods.final_output(numWins, numLosses, numDraws);
                
         newGame = RPSMethods.validate_newgame();
        }
       while (newGame.equals("y")); 
     } 
}
