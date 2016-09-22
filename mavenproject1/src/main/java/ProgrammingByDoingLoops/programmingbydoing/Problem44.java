/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.programmingbydoing;
import java.util.Random;

/**
 *
 * @author apprentice
 */
public class Problem44 {
    
    public static void main(String[] args) {
        
    
    Random r = new Random();
    int fortuneNumber, n1, n2, n3, n4, n5, n6;
    fortuneNumber = r.nextInt(5) ;
    
    switch (fortuneNumber) {
    case 0:
      System.out.println("Today is your lucky day.");
      break;
    case 1:
      System.out.println("Tomorrow is your lucky day.");
      break;
    case 2:
      System.out.println("Yesterday was your lucky day.");
      break;
    case 3:
      System.out.println("Today is your unlucky day.");
      break;
    case 4:
      System.out.println("Tomorrow is your unlucky day.");
      break;
    case 5:
      System.out.println("Yesterday was your unlucky day.");
      break;
      default:
      System.out.println("Somethin's up here.");

}
    
      n1=r.nextInt(53)+1;  System.out.print(n1 + " - ");
      
      do {n2=r.nextInt(53)+1;}
         while (n2 == n1);
              System.out.print(n2 + " - ");
      do {n3=r.nextInt(53)+1; }
         while ((n3 ==n2) || (n3 == n1));
              System.out.print(n3 + " - ");
      
      do {n4=r.nextInt(53)+1;}
          while ((n4 ==n3) || (n4 == n2) || (n4 == n1));
      System.out.print(n4 + " - ");
      
      do {n5=r.nextInt(53)+1;}
         while ((n5 == n4) || (n5 == n3) || (n5 == n2) || (n5 == n1));
          System.out.print(n5 + " - ");
          
      do {n6=r.nextInt(53)+1;}
         while ((n6 ==n5) || (n6 == n4) || (n6 == n3) || (n6 == n2)|| (n6 == n1));
      
      System.out.print(n6);
}
    
}
