/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.programmingbydoing;
import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class Problem55 {
    public static void main(String[] args) {
        int inputValue, totalValue;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("I will add the numbers you give me.  Integers only, please.  Enter 0 to return the sum.");
        System.out.print("Number:  ");
        inputValue = sc.nextInt();
        totalValue = inputValue;
        if (inputValue == 0)
            System.out.println("Fine, be that way.  The sum is " + inputValue + ".");
        else  {  System.out.println("The total so far is " + totalValue + ".");  
          while (inputValue != 0)
          {  System.out.print("Number: ");
                inputValue = sc.nextInt();
                totalValue += inputValue;
               System.out.println("The total so far is " + totalValue + ".");
            }   
      
             
         System.out.println("The total is " + totalValue); 
        }
    }
    
}
