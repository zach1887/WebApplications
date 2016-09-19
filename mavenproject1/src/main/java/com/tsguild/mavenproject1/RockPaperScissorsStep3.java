/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.mavenproject1;;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jesse
 */
public class RockPaperScissorsStep3 {
  public static void main(String[] args) {
        int playerChoice, computerChoice, numGames;
        String playerChoiceText, computerChoiceText;
        int numWins =0; int numLosses = 0; int numDraws = 0;
        
        Scanner sc = new Scanner (System.in);
        Random rand = new Random ();
        System.out.println("Let's play Rock, Paper, Scissors");
        System.out.print("How many times do you want to play?  ");
        numGames = sc.nextInt();
        while (numGames < 1 || numGames > 10) {
            System.out.println("Not a valid input.  Select a number from 1 to 10.");
            System.out.print("How many times do you want to play?  ");
            numGames = sc.nextInt();  
        }
            
        for (int i = 0; i < numGames; i++) {
             
        System.out.print("Select 1 for Rock, 2 for Paper, and 3 for Scissors:");
        playerChoice = sc.nextInt();
        computerChoice= rand.nextInt(3)+1;
        while (playerChoice < 1 || playerChoice >3) {
            System.out.println("Not a valid input.");
            System.out.print("Select 1 for Rock, 2 for Paper, and 3 for Scissors:");
            playerChoice = sc.nextInt();
        }
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
        
        if (playerChoice == computerChoice)
           {System.out.println("I also selected " + computerChoiceText + ".  It's a draw.");
            numDraws++;
           }
        else {
            if ((playerChoice == 1 && computerChoice ==3)
                  || (playerChoice == 2 && computerChoice ==1)
                    || (playerChoice == 3 && computerChoice ==2))
            { System.out.print("I selected " + computerChoiceText + ".  You win.");
              numWins++;
                } 
        else if ((playerChoice == 3 && computerChoice ==1)
                  || (playerChoice == 1 && computerChoice ==2)
                    || (playerChoice == 2 && computerChoice ==3))
                 { System.out.print("I selected " + computerChoiceText + ".  You lose.");
                   numLosses++;
                 }
        else System.out.println("There must be an error1.");
        if (playerChoice + computerChoice == 3)
            System.out.println("  Paper covers Rock.");
        else if (playerChoice + computerChoice == 4)
            System.out.println("  Rock crushes Scissors.");
        else if (playerChoice + computerChoice == 5)
            System.out.println("  Scissors cut Paper.");
        else System.out.println("There must be an error2.");
    }
        }
        
        System.out.println("You won " + numWins + " games, lost " 
                             + numLosses + " games, and we drew " 
                             + numDraws + "games.");
        
        if (numWins > numLosses)
            System.out.println("You win the match by " + (numWins - numLosses) + " games!");
        else if (numWins < numLosses)
            System.out.println("The computer won the match by " + (numWins - numLosses) + " games!");
        else System.out.println("The match is a draw.");
  }      
}    

