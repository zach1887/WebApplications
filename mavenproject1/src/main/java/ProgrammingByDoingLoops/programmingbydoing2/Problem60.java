/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.programmingbydoing2;
import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class Problem60 {
    public static void main(String[] args) {
        double userInput, squareRoot;
        System.out.println("SQUARE ROOT!");
        System.out.print("Enter a number:  ");
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextDouble();
        
        while (userInput < 0) {
            System.out.println("You can't take the square root of a negative number.");
            System.out.print("Try again:  ");
            userInput = sc.nextDouble();
        }
        
        squareRoot = Math.sqrt(userInput);
        System.out.println("The square root is " + squareRoot);
        
        
        
        
    }
}
