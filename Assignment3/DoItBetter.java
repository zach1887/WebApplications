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
public class DoItBetter {
    public static void main(String[] args) {
       int milesRun, hotDogsEaten, knownLanguages;
       Scanner sc = new Scanner (System.in);
       
        System.out.print("How many miles can you run? ");
        milesRun = sc.nextInt();
        System.out.println("Well, that's nothing.  Jim can run " + (2*milesRun + 1) + " miles.");
        
        System.out.print("How many hot dogs can you eat? ");
        hotDogsEaten = sc.nextInt();
        System.out.println("Well, that's nothing.  Kevin can eat " + (2*hotDogsEaten + 1) + " hot dogs.");
        
        System.out.print("How many languages do you know? ");
        knownLanguages = sc.nextInt();
        System.out.println("Well, that's nothing.  Lisa knows " + (2*knownLanguages + 1) + " languages.");
        
        
        
        
    }
}
