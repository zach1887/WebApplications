/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.programmingbydoing;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Problem54 {
    public static void main(String[] args) {
        int i, myNumber, userGuess;
        final int MAX_GUESSES = 7;
        i = 1;
        
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("I'm thinking of a number from 1 to 100.  You have "+ MAX_GUESSES + " guesses.");    
        System.out.print("First guess:");
        userGuess = sc.nextInt();
        myNumber = rand.nextInt(100)+1;
        
        if (userGuess == myNumber)
            System.out.println("That is remarkable.  You got it on the first try!");
        else while (i<=MAX_GUESSES && userGuess != myNumber)
            {
               i++;
               if (userGuess > myNumber)
               {System.out.println("Your number is too high.  Guess again.");
                   System.out.print("Guess #" + i + ":  ");
                   userGuess = sc.nextInt();}
                   else 
               {   System.out.println("Your number is too low.  Guess again.");
                   System.out.print("Guess #" + i + ":  ");
                   userGuess = sc.nextInt();}
           }
      
       
        if (userGuess == myNumber)
            System.out.println("You are correct.  It took you " + i + " tries.");
        else if (i > MAX_GUESSES)
            System.out.println("You only had " + MAX_GUESSES + "tries, so you lose.");
        else System.out.println("Something went wrong here.");
        
    }
    
   
}
