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
public class Problem53 {
    public static void main(String[] args) {
        int myNumber, userGuess;
        int i = 1;
    Random rand = new Random ();
    Scanner sc = new Scanner (System.in);    
    myNumber = rand.nextInt(10)+1;
    
    System.out.println("I have chosen a number from 1 to 10.  Try to guess it.");
    System.out.print("Your guess:  ");
    userGuess = sc.nextInt();
    if (userGuess== myNumber)
            System.out.println("That's amazing - you got it on the first guess!");
    else while (userGuess != myNumber)
       {
        i++;
        System.out.println("You are incorrect.  Guess again.");
        System.out.print("Your guess:  ");
        userGuess = sc.nextInt();  
        }
            
        System.out.println("It took you " + i + " guesses to get the right number.");    
    
    }
}
