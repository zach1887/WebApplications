/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavenproject5;
import java.util.Random;
/**
 *
 * @author Jesse
 */
public class Opinionator {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Which animal do I like best?");
        System.out.println("Let's have Random decide!");
    
        int x = rand.nextInt(6);  // we need a total of six choices
        
        System.out.println("The number we chose was: " + x);
        
        if (x == 0) {
            System.out.println("Llamas are the best.");
        } else if (x == 1) {
            System.out.println("Dodos are the best.");
        } else if (x == 2) {
            System.out.println("Wooly Mammoths are the best.");
        } else if (x == 3) {
            System.out.println("Sharks are the best.");
        } else if (x == 4) {
            System.out.println("Cockatoos are the best.");
        } else if (x == 5) {
            System.out.println("Mole rats are the best.");
        }
        System.out.println("Thanks, Random.");
    
    
    }
    
            
}
