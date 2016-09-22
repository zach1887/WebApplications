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
public class Calculator_Assignment {
    public static void main(String[] args) {
      int userChoice;
      double input1, input2;
      double response;
      
      Scanner sc = new Scanner(System.in);
      
        System.out.println("Welcome to our calculator program!");
        System.out.println("Select froom the following options.");
        System.out.print("Add(1), Subtract(2), Multiply(3), Divide(4), Quit Program(5):  ");
        userChoice = sc.nextInt();
        while (userChoice <1 || userChoice > 5) {
            System.out.println("Please select from the available options:");
            System.out.print("Add(1), Subtract(2), Multiply(3), Divide(4), Quit Program(5):  ");
            userChoice = sc.nextInt();
        }
        while (userChoice !=5) {
        switch (userChoice) {
            case 1: {
                System.out.print("Input the first number:  ");
                input1 = sc.nextDouble();
                System.out.print("Input the second number:  ");
                input2 = sc.nextDouble();
                response = add_two(input1, input2);
                System.out.println("The answer is " + response + ".");
                System.out.println("Please select from the available options:");
                System.out.print("Add(1), Subtract(2), Multiply(3), Divide(4), Quit Program(5):  ");
                userChoice = sc.nextInt();
                       while (userChoice <1 || userChoice > 5) {
                       System.out.println("Please select from the available options:");
                       System.out.print("Add(1), Subtract(2), Multiply(3), Divide(4), Quit Program(5):  ");
                       userChoice = sc.nextInt();
        }
                break;
            }
            case 2: {
                System.out.print("Input the subtrahend:  ");
                input1 = sc.nextDouble();
                System.out.print("Input the minuend:  ");
                input2 = sc.nextDouble();
                response = subtract_two(input1, input2);
                System.out.println("The answer is " + response + ".");
                System.out.println("Please select from the available options:");
                System.out.print("Add(1), Subtract(2), Multiply(3), Divide(4), Quit Program(5):  ");
                userChoice = sc.nextInt();
                break;
            }
            case 3: {
                System.out.print("Input the first factor:  ");
                input1 = sc.nextDouble();
                System.out.print("Input the second factor:  ");
                input2 = sc.nextDouble();
                response = multiply_two(input1, input2);
                System.out.println("The answer is " + response + ".");
                System.out.println("Please select from the available options:");
                System.out.print("Add(1), Subtract(2), Multiply(3), Divide(4), Quit Program(5):  ");
                userChoice = sc.nextInt();
                       while (userChoice <1 || userChoice > 5) {
                       System.out.println("Please select from the available options:");
                       System.out.print("Add(1), Subtract(2), Multiply(3), Divide(4), Quit Program(5):  ");
                       userChoice = sc.nextInt();
                       }
                break;
            }
            case 4: {
                System.out.print("Input the numerator:  ");
                input1 = sc.nextDouble();
                System.out.print("Input the denominator (non-zero, please!):  ");
                input2 = sc.nextDouble();
                if (input2 == 0)  {
                    System.out.println("Invalid denominator.  Let's try this again.");
                    userChoice = 4; 
                    break;
                } 
                response = divide_two(input1, input2);
                System.out.println("The answer is " + response + ".");
                System.out.println("Please select from the available options:");
                System.out.print("Add(1), Subtract(2), Multiply(3), Divide(4), Quit Program(5):  ");
                userChoice = sc.nextInt();
                       while (userChoice <1 || userChoice > 5) {
                       System.out.println("Please select from the available options:");
                       System.out.print("Add(1), Subtract(2), Multiply(3), Divide(4), Quit Program(5):  ");
                       userChoice = sc.nextInt();
                       }
                break;
            }
                default:  break;
                
        }
            
    }
                    System.out.println("Thanks for stopping by!");
    }
    public static double add_two(double x, double y) {
          double sum;
          sum = x + y;
          return sum;
}
    public static double subtract_two(double x, double y) {
          double diff;
          diff = x - y;
          return diff;
}
    public static double multiply_two(double x, double y) {
          double product;
          product = x*y;
          return product;
}
    public static double divide_two(double x, double y) {
          double quotient;
          quotient = x/y;
          return quotient;
}
}
