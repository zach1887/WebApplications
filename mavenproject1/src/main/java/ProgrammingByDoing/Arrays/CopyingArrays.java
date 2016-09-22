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
public class CopyingArrays {
      public static void main(String[] args) {
        
       int randomValues [] = new int[10];
       int copiedValues [] = new int[10]; 
       
       Random rand = new Random();
       Scanner sc = new Scanner (System.in);
       
      System.out.print("Array 1:  ");
        for (int i = 0; i < 10; i++) {
            randomValues[i] = 1 + rand.nextInt(100);
            if (i<9) System.out.print(randomValues[i] + "  ");
            else System.out.println(randomValues[i] + " ");
        }
        
        System.out.print("Array 2:  ");
        for (int j = 0; j < 10; j++) {
            if (j<9) {
                copiedValues[j] = randomValues[j];
                System.out.print(copiedValues[j] + "  ");
            }
            else {
                copiedValues[j] = -7;
                System.out.println(copiedValues[j]);
            }
        }
        
 
       
   
       
    
    }  
}
