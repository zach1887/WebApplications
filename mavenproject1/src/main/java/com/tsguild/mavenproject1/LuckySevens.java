/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.mavenproject1;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Jesse
 */
public class LuckySevens {
    public static void main(String[] args) {
        int rolls = 0; 
        int maxRolls = 0;  // this value may stay 0 if the initial value is never exceeded.
        int startingAmt;
        int s;  //placeholder for the sum of the two dice each roll
        
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many dollars you have?  Whole numbers, please.");
        startingAmt = sc.nextInt();
        
        while (startingAmt < 0)
        { System.out.println("You gotta have money to play.  Try again.");
          System.out.print("How many dollars you have?  Whole numbers, please.");
          startingAmt = sc.nextInt();  
        }
        while (startingAmt > 1e6)  //selection of one million is arbitrary
       { System.out.println("Number is too large.  Try again.");
          System.out.print("How many dollars you have?  Whole numbers, please.");
          startingAmt = sc.nextInt();  
       }
       
        int maxAmt = startingAmt;
        int runAmt = startingAmt;
        
       do { 
           rolls++;
           s = rand.nextInt(6) + rand.nextInt(5) + 2;
           
           if (s == 7)  {
               runAmt +=4;
                  if (runAmt > maxAmt) {
                      maxAmt = runAmt;
                      maxRolls = rolls;
                                        } 
                  }
           else {
               runAmt -=1;
                }       
                   }
            while (runAmt >=1);
        
        System.out.println("");
        System.out.println("You are broke after " + rolls + " rolls.");
        System.out.println("");
        System.out.println("You should have quit after " + maxRolls + " rolls "
                             + "when you had $" + maxAmt + ".");
    }
}
