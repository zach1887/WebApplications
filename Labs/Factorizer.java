/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftwareGuildLabs;
import java.util.Scanner;

/**
 *
 * @author Jesse
 */
public class Factorizer {
    public static void main(String[] args) {
        int userInput;
        int factors = 0; int sumFactors = 0;
        
     Scanner sc = new Scanner(System.in);
     System.out.print("What number would you like to factor?");
     userInput = sc.nextInt();
     
     while (userInput < 1 || userInput > 1e7) {
         System.out.println("Please enter a whole number from 1 to 10 million.");
         System.out.println("What number would you like to factor?");
         userInput = sc.nextInt();
     }
         
        for (int k = 1; k <= userInput/2 ; k++) {  //no need to check factors greater than half the userInput
            
            if (userInput % k == 0) {
                factors++;
                sumFactors +=k;
                System.out.println(k);
            }       
        }
     if (sumFactors == userInput) 
            System.out.println(userInput + " is a perfect number."); 
     else   System.out.println(userInput + " is not a perfect number.");
     
     if (factors == 1)  // technically this isn't necessary if userInput is prime, but it doesn't slow the program down much
            System.out.println(userInput + " is a prime number.");
     else System.out.println(userInput + " is not a prime number.");
    }
}
