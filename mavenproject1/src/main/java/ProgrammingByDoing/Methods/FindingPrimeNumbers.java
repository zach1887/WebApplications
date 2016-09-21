/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingByDoing.Methods;
import java.util.Scanner;

/**
 *
 * @author Jesse
 */
public class FindingPrimeNumbers {
    public static void main(String[] args) {
        int lowerBound, upperBound, diff;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Let's search for prime numbers!");
        System.out.print("Select a lower bound from 2 to 500:  ");
        lowerBound = sc.nextInt();
        while (lowerBound < 2 || lowerBound > 500) {
            System.out.println("Between 2 and 500, please.");
            System.out.print("Select a lower bound from 2 to 500:  ");
            lowerBound = sc.nextInt();
        }
        System.out.println("Now select an upper bound no more than 100 greater than the lower bound");
        System.out.println("We need the results to be readable!");
        System.out.print("Upper Bound:  ");
        upperBound = sc.nextInt();
        diff = upperBound - lowerBound;
        while (diff <=0 || diff > 100) {
            System.out.println("Make sure the upper bound is no more than 100 greater than the lower bound.");
            System.out.print("Upper Bound:  ");
            upperBound = sc.nextInt();
            diff = upperBound - lowerBound;
        }
        
        System.out.println("The prime numbers are denoted with an X.");
        for (int i = lowerBound; i < upperBound; i++) {
            if (isPrime(i)) System.out.println(i + "  X"); 
            else System.out.println(i);
        }
    }
    
    public static boolean isPrime (int n) {
            boolean isprime;
            isprime = true;
            
            for (int k = 2; k <= Math.sqrt(n); k++) {
                if (n % k == 0) {
                {isprime = false; break;
                }
                }
          
        }
        return isprime;
}
}