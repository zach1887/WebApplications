/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2Lab2;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Jesse
 */
public class FactorizerMethods {
    public static int validate_input (){
     Scanner sc = new Scanner(System.in);
     System.out.print("What number would you like to factor?");
     int userInput = sc.nextInt();
     
     while (userInput < 1 || userInput > 1e7) {
         System.out.println("Please enter a whole number from 1 to 10 million.");
         System.out.println("What number would you like to factor?");
         userInput = sc.nextInt();
     }
     return userInput;
    }
     public static boolean is_a_factor(int x, int k) {
        if (x % k == 0)
            return true;
        else return false;  
     }
    }
    
    
