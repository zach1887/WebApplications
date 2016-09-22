/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.programmingbydoing2;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Problem57 {
    public static void main(String[] args) {
        int coinFlip;
        String coinResult, userChoice;
        
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        coinFlip = rand.nextInt(2);
        if (coinFlip == 0) coinResult = "HEADS";
        else if (coinFlip == 1) coinResult = "TAILS";
        else coinResult = "ERROR";
        
        do {
            System.out.println("You flip a coin and it lands on..." + coinResult);
            System.out.print("Would you like to play again (y/n)?");
            userChoice = sc.next();
            coinFlip = rand.nextInt(2);
              if (coinFlip == 0) coinResult = "HEADS";
              else if (coinFlip == 1) coinResult = "TAILS";
              else coinResult = "ERROR";
        }
        while ("y".equals(userChoice));
                
        
        
    }
    
}
