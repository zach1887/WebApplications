/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.programmingbydoing;
import java.util.Random;
/**
 *
 * @author apprentice
 */
public class Problem45 {
    public static void main(String[] args) {
        int rollOne, rollTwo;
        
        Random rand = new Random();
        
        rollOne = rand.nextInt(5) + 1;
        rollTwo = rand.nextInt(5) + 1;
        
        System.out.println("We are simulating rolling two dice.");
        
        System.out.println("The first die is " + rollOne + ".");
        System.out.println("The second die is " + rollTwo + ".");
        System.out.println("The sum is " + (rollOne + rollTwo) + ".");
    }
    
}
