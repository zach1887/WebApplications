/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavenproject3;
import java.util.Scanner;
/**
 *
 * @author Jesse
 */
public class DontForgetToStoreIt {
    public static void main(String[] args) {
        
        int meaningOfLifeAndEverything = 42;
        double pi = 3.14159;
        String cheese, color;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Give me pi to five decimal places:");
        pi = inputReader.nextDouble();
        
        System.out.println("What is the meaing of life, the universe, and everything?");
        meaningOfLifeAndEverything = inputReader.nextInt();
        
        System.out.println("What is your favorite kind of cheese?");
        cheese = inputReader.next();
        
        System.out.println("Do you like the color red or blue more?");
        color = inputReader.next();
        
            System.out.println("I must say " + color + " " + cheese + " sounds pretty good.");
            System.out.println("The circumference of life is " + (2*pi*meaningOfLifeAndEverything) + ".") ;
    }  
    
}

