/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingByDoing.Arrays;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class LargestValue {
        public static void main(String[] args) {
        
       int randomValues [] = new int[10]; 
       int maxValue;
       Random rand = new Random();
       
      System.out.print("Array 1:  ");
        for (int i = 0; i < 10; i++) {
            randomValues[i] = 1 + rand.nextInt(100);
            if (i<9) System.out.print(randomValues[i] + "  ");
            else System.out.println(randomValues[i] + " ");
        }
        
        maxValue = randomValues[0];
        int maxLocation = 1;
        
        for (int j = 1; j < 10; j++) {
            if (randomValues[j] > maxValue){
                maxValue = randomValues[j];
                maxLocation = (j+1);
            }
            
        }
            System.out.println("The largest value is " + maxValue 
                    + ", which appears for the first time at position " 
                    + maxLocation + " ." );
        
        
      
         
}
        
}
