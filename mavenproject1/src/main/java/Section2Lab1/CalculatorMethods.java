/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2Lab1;

/**
 *
 * @author apprentice
 */
public class CalculatorMethods {
    
static ConsoleIO console = new ConsoleIO();
double op1, op2;
    double input_first_operand(int userChoice) {
        switch(userChoice) {
            case 1: {
               op1 = console.readDouble("Please enter the first number:  ");
               break;
        }  
            case 2: {
               op1 = console.readDouble("Please enter the subtrahend  ");
               break;
        }  
            case 3: {
               op1 = console.readDouble("Please enter the first factor:  ");
               break;
        }  
            case 4: {
               op1 = console.readDouble("Please enter the numerator:  ");
               break;
        } 
            default: break;
    }
        return op1;
    }
    double input_second_operand(int userChoice) {
        switch(userChoice) {
            case 1: {
               op2 = console.readDouble("Please enter the second number:  ");
               break;
        }  
            case 2: {
               op2 = console.readDouble("Please enter the minuend;  ");
               break;
        }  
            case 3: {
               op2 = console.readDouble("Please enter the second factor:  ");
               break;
        }  
            case 4: {
               op2 = console.readDouble("Please enter the denominator:  ");
               break;
        } 
            default: break;
    }
        return op2;
    }
    
}



    

