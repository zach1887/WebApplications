/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingByDoingLoops;
import java.util.Scanner;
/**
 *
 * @author Jesse
 */
public class CollatzSequence {
    public static void main(String[] args) {
        int startNumber, workingNumber;
        int count=1;
        
        System.out.print("Starting Number:  ");
        Scanner sc = new Scanner(System.in);
        startNumber = sc.nextInt();
        
        while (startNumber < 2 || startNumber > 1e7){
        System.out.print("Please enter a whole number from 1 to 10,000,000.");
        System.out.println("Starting Number:  ");
        startNumber = sc.nextInt();
    }
        workingNumber = startNumber;
        
        while (workingNumber > 1) {
            if (workingNumber % 2 == 0)
                workingNumber = workingNumber/2;
            else workingNumber = 3*workingNumber + 1; 
            System.out.print(workingNumber + "  ");
            count++;
        }    
        System.out.println("We required " + count + " iterations of the loop.");
        if (workingNumber != 1) System.out.println("Something went wrong here.");
        
    }
}
