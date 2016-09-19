/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Jesse
 */
public class GuessMeMore {
    public static void main(String[] args) {
        Random rand = new Random ();
        Scanner sc = new Scanner (System.in);
        
        int myNumber, userGuess;
       myNumber = rand.nextInt(201) - 100;
        
        System.out.println("I've chosen a number between -100 and 100.  Good luck trying to guess it!");
        System.out.print("Your guess: " );
        userGuess = sc.nextInt();
        
        if (userGuess == myNumber)
            System.out.println("Wow, I am impressed!");
        else{
           if (userGuess < myNumber)
           System.out.println("Nope.. too low.  Try again.");
           else if (userGuess > myNumber)
           System.out.println("Nope.. too high.  Try again.");
                
           System.out.print("Your guess: " );
           userGuess = sc.nextInt();
           if (userGuess == myNumber)
               System.out.println("Nice guess.  That was my number");
           else System.out.println("Nice try.  My number was actually " + myNumber + ".");
        }
    }
}
