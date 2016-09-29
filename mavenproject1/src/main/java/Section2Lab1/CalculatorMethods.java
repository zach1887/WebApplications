/*
 * To change this license header, choose License Headers in ProjectProperties.
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
    
        static ConsoleIO console = new ConsoleIO();
    
    public static void display_Menu() {   
        int userChoice;
        System.out.println("Calculator Menu");
        System.out.println("Select from the following options.");
        }

    
    public static double input_first_operand(int userChoice) {
        double op1;
        
        switch (userChoice) {
            case 1: {
         op1 = console.readDouble("Input the first number:  ");
         break;
            }
            case 2: {
         op1 = console.readDouble("Input the subtrahend:  ");
         break;
            }
            case 3: {
         op1 = console.readDouble("Input the first factor:  ");
         break;
            }
            case 4: {
         op1 = console.readDouble("Input the numerator:  ");
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
         op2 = console.readDouble("Input the second number:  ");
         break;
            }
            case 2: {
         op2 = console.readDouble("Input the minuend:  ");
         break;
            }
            case 3: {
         op2 = console.readDouble("Input the second factor:  ");
         break;
            }
            case 4: {
         op2 = console.readDouble("Input the denominator  ");
         break;
            }
            default: op2 = 0; break;
        }
            
        return op2; 
    }
    
    }