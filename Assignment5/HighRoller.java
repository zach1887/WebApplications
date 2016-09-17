/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavenproject4;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jesse
 */
public class HighRoller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Let's roll some dice.  How many sides do you want the die to have?");
        System.out.print("Enter a whole number from 2 to 100:");
        int numberOfFaces = sc.nextInt();
        if (numberOfFaces == 2)
            System.out.println("Technically that's a coin, but okay.");
        else if (numberOfFaces < 2 || numberOfFaces > 100)
            { System.out.println("Do you want to play this game or not?");
               System.out.print("Enter a whole number from 2 to 100:");
                numberOfFaces = sc.nextInt();
                if (numberOfFaces < 2 || numberOfFaces > 100)
                { System.out.println("Nevermind, we'll just go with a six-sided die.");
                    numberOfFaces = 6;}
                    }
                                
        
        int rollResult = rand.nextInt(numberOfFaces) + 1;
        System.out.println("Time to play!");
        System.out.println("I rolled a " + rollResult + ".");
        
        if (rollResult == 1){
            System.out.println("Critical value!  Ouch.");}
            else if (rollResult == numberOfFaces)
                System.out.println("Critical hit!  Nice work.");
        }
        
    }
    
