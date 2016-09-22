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
public class Problem43 {
    public static void main(String[] args) {
    
        int yourGuess, myNumber;
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("I'm thinking of a number from 1 to 10."); 
        System.out.print("Your guess:  ");
        yourGuess = input.nextInt();
        myNumber = rand.nextInt(10) +1;
        
        if (yourGuess < 1 || yourGuess > 10)
            System.out.println("C'mon, man, be serious.");
        
        else if (yourGuess == myNumber){
            System.out.println("Good guess, my number was " + myNumber);
        }
        
        else
            System.out.println("Incorrect guess, my number was " + myNumber);
            
    }
}
