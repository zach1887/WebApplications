/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingByDoing.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class IsItHereOrNot {
    public static void main(String[] args) {
        
       int randomValues [] = new int[10];
       int userNumber;  int count = 0;
       String tryAgain;
       
       Random rand = new Random();
       Scanner sc = new Scanner (System.in);
       
       do {
      System.out.print("Array:  ");
        for (int i = 0; i < 10; i++) {
            randomValues[i] = 1 + rand.nextInt(50);
            if (i<9) System.out.print(randomValues[i] + " ");
            else System.out.println(randomValues[i] + " ");
        }
        
        System.out.print("Value to find:");
        userNumber = sc.nextInt();
        
        for (int j = 0; j < 10; j++) {
        
            if (randomValues[j] == userNumber) {
                System.out.println(userNumber + " is in the array at position " + (j + 1) + " .");
                count++;
            }
        }
        
        if (count == 0) {
            System.out.println(userNumber + " is not in the array.");    
        }
       
        System.out.print("Would you like to try another number (y/n)?");
        tryAgain = sc.next();
        
       }
       while (tryAgain.equals("y"));
    
    }
    
}
        
      

