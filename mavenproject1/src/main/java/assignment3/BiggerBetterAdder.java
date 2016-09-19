/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavenproject3;
import java.util.Scanner;
/**
 *
 * @author Jesse
 */
public class BiggerBetterAdder {
    public static void main(String[] args) {
        double x1, x2, x3, sum;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Give me a value:");
        x1 = sc.nextDouble();
        System.out.println("Give me a second value:");
        x2 = sc.nextDouble();
        System.out.println("Give me a third value:");
        x3 = sc.nextDouble();
        
        
        sum = x1 + x2 + x3;
        
        System.out.println("Sum of three variables is " + sum);
        System.out.println("Sum of three variables is " + sum);  
   }
  }
