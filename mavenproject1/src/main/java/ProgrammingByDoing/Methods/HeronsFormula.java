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
public class HeronsFormula {
    public static void main(String[] args) {
        int lengthSideA, lengthSideB, lengthSideC;
        double areaTriangle;
        
        Scanner sc = new Scanner (System.in); 
        System.out.println("Enter the sides of a triangle and we will determine the area using Heron's Formula.");  
        System.out.print("Enter shortest of the three sides (integers only):");       
        lengthSideA = sc.nextInt();
        while (lengthSideA <1 || lengthSideA > 1e6) {
            System.out.println("Invalid input:");
            System.out.print("Enter shortest of the three sides (integers only):");
            lengthSideA = sc.nextInt();
        }  
        System.out.print("Enter next shortest side (integers only, may equal the previous input):");       
        lengthSideB = sc.nextInt();
         while (lengthSideB <lengthSideA || lengthSideB > 2e6) {
            System.out.println("Invalid input:");
            System.out.print("Enter next shortest side (integers only, may equal the previous input):");
            lengthSideB = sc.nextInt();
        }        
        System.out.println("The longest side cannot be larger than the other two combined.");
        System.out.print("Enter the longest side (integers only, may equal the previous input)");               
        lengthSideC = sc.nextInt();
         while (lengthSideC <lengthSideB || lengthSideC > 3e6 || lengthSideC > (lengthSideA + lengthSideB)) {
            System.out.println("Invalid input:");
            System.out.print("Enter the longest side (integers only, may equal the previous input)");
            lengthSideB = sc.nextInt();
        }
         
       areaTriangle = AreaOfTriangle(lengthSideA, lengthSideB, lengthSideC);
        System.out.println("The area of a triangle with sides " + lengthSideA + ", "
                            + lengthSideB + ", " + lengthSideC + " is " + areaTriangle + ".");
    }    

    public static double AreaOfTriangle (int a, int b, int c) {
            double semiPerimeter, area;
            semiPerimeter = 0.5*(a + b + c);
            area = Math.sqrt(semiPerimeter*(semiPerimeter - a)*(semiPerimeter - b)
                               * (semiPerimeter - c));
            return area;
    }
            
}
