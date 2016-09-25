/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2Lab2;
import java.util.Scanner;

/**
 *
 * @author Jesse
 */
public class Factorizer {
    public static void main(String[] args) {
        int userInput;
        int factors = 0; int sumFactors = 0;

     userInput = FactorizerMethods.validate_input();
         
        for (int k = 1; k <= userInput/2 ; k++) {  //no need to check factors greater than half the userInput
            
            if (FactorizerMethods.is_a_factor(userInput, k)) {
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
