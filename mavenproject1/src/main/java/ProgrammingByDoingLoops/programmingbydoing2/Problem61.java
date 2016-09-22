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
public class Problem61 {

    public static void main(String[] args) {
        int side1, side2, side3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Let's see if three sides make up a right triangle.");
        System.out.println("Enter three integers in ascending order");
        System.out.print("First side:  ");
        side1 = sc.nextInt();
        while (side1 > 10000) {
            System.out.println("That's too large.  Select again.");
            System.out.print("First side:  ");
            side1 = sc.nextInt();
        }
        System.out.print("Second side:  ");
        side2 = sc.nextInt();

        while (side2 < side1) {
            System.out.println("The second side cannot be shorter than the first side.");
            System.out.print("Second side:  ");
            side2 = sc.nextInt();
        }
        while (side2 > 2000) {
            System.out.println("That's too large.  Select again.");
            System.out.print("Second side:  ");
            side2 = sc.nextInt();
        }
        System.out.print("Third side:  ");
        side3 = sc.nextInt();  
        
        while (side3 < side2) {
            System.out.println("The third side cannot be shorter than the second side");
            System.out.print("Third side:  ");
            side3 = sc.nextInt(); 
    }
        while (side3 >= (side1 + side2)) {
            System.out.println("The third side cannot be longer than the sum of the other two.");
            System.out.print("Third side:  ");
            side3 = sc.nextInt(); 
        }
        System.out.println("Your sides are " + side1 + ", " + side2 + ", " + side3 + ".");
        
        if (Math.pow(side3,2) == Math.pow(side1,2) + Math.pow(side2, 2))
                {System.out.println("These values make up a right triangle.");}
                else
                {System.out.println("These values do not make up a right triangle.");}
                
    }
}
