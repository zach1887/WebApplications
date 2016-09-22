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
public class Problem46 {
    
    public static void main(String[] args) {
        
    
    int myNumber, userGuess;
    
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    myNumber = rand.nextInt(100) + 1;
    
    System.out.println("I'm thinking of a number from 1 to 100.  Try to guess it");
    userGuess = sc.nextInt();
    
    if (userGuess == myNumber)      
            { System.out.println("You lucky bastard.");}
    else if (userGuess > myNumber)
            {System.out.println("You guessed too high, since my number was " + myNumber +".");}
    else if (userGuess < myNumber)
            {System.out.println("You guessed too low, since my number was " + myNumber +".");}
            else {System.out.println("Something is wrong here.");}
    
}
}

