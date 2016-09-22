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
public class Problem49 {
    public static void main(String[] args) {
        int myNumber, userGuess;
        
        Random rand = new Random();
        Scanner sc = new Scanner (System.in);
        
        myNumber = rand.nextInt(10)+1;
        System.out.println("I am thinking of a number from 1 to 10. Try to guess it.");
        System.out.print("Your guess:  ");
        userGuess = sc.nextInt();
    
        if (userGuess == myNumber)
            System.out.println("Nice work, you got it on the first try!");
        else 
            do {
                System.out.println("That value is incorrect.  Guess again.");
                System.out.print("Your guess: ");
                userGuess = sc.nextInt();
               }
             while (userGuess != myNumber);
            System.out.println("It took a while, but you got there!");       
    }
}
