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
public class HotAndCold {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        int myNumber, userGuess;
        myNumber = rand.nextInt(1000) + 1;
        System.out.println("I've chosen a number from 1 - 1000.  Good luck guessing it.");
        System.out.print("Your guess:  ");
        userGuess = sc.nextInt();
        
        if (userGuess == myNumber)
            System.out.println("Wow, that's amazing.");
        else {
            if ((userGuess - myNumber) < 10)
                System.out.println("Hot enough to live on the sun.");
            else if ((userGuess - myNumber) < 21)
                System.out.println("Very hot.");
            else if ((userGuess - myNumber) < 51)
                System.out.println("Heating up.");
            else if ((userGuess - myNumber) < 101)
                System.out.println("Warm, but still off.");
            else if ((userGuess - myNumber) < 201)
                System.out.println("Tepid, but approaching room temp.");
            else if ((userGuess - myNumber) < 501)
                System.out.println("Pretty cold.");
            else 
                System.out.println("Practically freezing!");
            System.out.println("I ACTUALLY chose " + myNumber + "!");        
                
                
                }
    
}
}
