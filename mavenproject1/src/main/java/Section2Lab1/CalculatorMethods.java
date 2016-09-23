/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2Lab1;
import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class CalculatorMethods {
    
    public static int display_Menu() {
        
        int userChoice;
        System.out.println("Select from the following options.");
        System.out.print("Add(1), Subtract(2), Multiply(3), Divide(4), Quit Program(5):  ");
        Scanner sc = new Scanner(System.in);
        userChoice = sc.nextInt();
        while (userChoice <1 || userChoice > 5) {
        System.out.println("Please select from the available options:");
        System.out.print("Add(1), Subtract(2), Multiply(3), Divide(4), Quit Program(5):  ");
        userChoice = sc.nextInt();
        }
        return userChoice;
}
    
    public static double input_first_operand(int userChoice) {
        double op1;
        
        switch (userChoice) {
            case 1: {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the first number:  ");
         op1 = sc.nextDouble();
         break;
            }
            case 2: {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the subtrahend:  ");
         op1 = sc.nextDouble();
         break;
            }
            case 3: {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the first factor:  ");
         op1 = sc.nextDouble();
         break;
            }
            case 4: {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the numerator:  ");
         op1 = sc.nextDouble();
         break;
            }
            default: op1 = 0; break;
        }
            
        return op1; 
    }
    public static double input_second_operand(int userChoice) {
        double op2;
        
        switch (userChoice) {
            case 1: {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the second number:  ");
         op2 = sc.nextDouble();
         break;
            }
            case 2: {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the minuend:  ");
         op2 = sc.nextDouble();
         break;
            }
            case 3: {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the second factor:  ");
         op2 = sc.nextDouble();
         break;
            }
            case 4: {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the denominator:  ");
         op2 = sc.nextDouble();
         break;
            }
            default: op2 = 0; break;
        }
            
        return op2; 
    }
    public static int input_first_int_operand(int userChoice) {
        int op1;
        
        switch (userChoice) {
            case 1: {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the first number (integers only):  ");
         op1 = sc.nextInt();
         break;
            }
            case 2: {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the subtrahend (integers only):  ");
         op1 = sc.nextInt();
         break;
            }
            case 3: {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the first factor (integers only):  ");
         op1 = sc.nextInt();
         break;
            }
            case 4: {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the numerator (integers only):  ");
         op1 = sc.nextInt();
         break;
            }
            default: op1 = 0; break;
        }
            
        return op1; 
    }
    public static int input_second_int_operand(int userChoice) {
        int op2;
        
        switch (userChoice) {
            case 1: {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the second number(integers only):  ");
         op2 = sc.nextInt();
         break;
            }
            case 2: {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the minuend (integers only):  ");
         op2 = sc.nextInt();
         break;
            }
            case 3: {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the second factor (integers only) :  ");
         op2 = sc.nextInt();
         break;
            }
            case 4: {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the denominator (integers only):  ");
         op2 = sc.nextInt();
         break;
            }
            default: op2 = 0; break;
        }
            
        return op2; 
    }
    public static float input_first_float_operand(int userChoice) {
        float op1;
        
        switch (userChoice) {
            case 1: {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the first number (decimals okay):  ");
         op1 = sc.nextFloat();
         break;
            }
            case 2: {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the subtrahend (decimals okay):  ");
         op1 = sc.nextFloat();
         break;
            }
            case 3: {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the first factor (decimals okay):  ");
         op1 = sc.nextFloat();
         break;
            }
            case 4: {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the numerator (decimals okay):  ");
         op1 = sc.nextFloat();
         break;
            }
            default: op1 = 0; break;
        }
            
        return op1; 
    }
    public static float input_second_float_operand(int userChoice) {
        float op2;
        
        switch (userChoice) {
            case 1: {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the second number(decimals okay):  ");
         op2 = sc.nextFloat();
         break;
            }
            case 2: {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the minuend (decimals okay):  ");
         op2 = sc.nextFloat();
         break;
            }
            case 3: {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the second factor ((decimals okay): ");
         op2 = sc.nextFloat();
         break;
            }
            case 4: {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the denominator (decimals okay):  ");
         op2 = sc.nextFloat();
         break;
            }
            default: op2 = 0; break;
        }
            
        return op2; 
    }
    
    }