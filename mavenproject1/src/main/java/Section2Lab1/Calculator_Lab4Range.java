/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2Lab1;

//import java.util.Scanner;2


/**
 *
 * @author apprentice
 */
public class Calculator_Lab4Range {

    public static void main(String[] args) {
        int userChoice;
        double input1, input2;
        double response;
        final int INPUT_MIN = (int) -1e8;
        final int INPUT_MAX = (int) 1e8;
//        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to our calculator program!");
        userChoice = CalculatorMethods.display_Menu();

        while (userChoice != 5) {
            input1 = CalculatorMethods.input_first_operand(userChoice);
            while (CalculatorMethodsRange.is_out_of_range(input1, INPUT_MIN, INPUT_MAX)){
                System.out.println("That value is out of range.  Please select again.");
                input1 = CalculatorMethods.input_first_operand(userChoice);
            }
                
            input2 = CalculatorMethods.input_second_operand(userChoice);
            while (CalculatorMethodsRange.is_out_of_range(input2, INPUT_MIN, INPUT_MAX)){
                System.out.println("That value is out of range.  Please select again.");
                input2 = CalculatorMethods.input_second_operand(userChoice);
            }           
            
//            input1 = CalculatorMethods.input_first_int_operand(userChoice);
//            input2 = CalculatorMethods.input_second_int__operand(userChoice);
//            input1 = CalculatorMethods.input_first__float_operand(userChoice);
//            input2 = CalculatorMethods.input_second_float_operand(userChoice);

            switch (userChoice) {
                case 1: {
                    response = add_two(input1, input2);
                    System.out.println("The answer is " + response + ".");
                    userChoice = CalculatorMethods.display_Menu();

                    break;
                }
                case 2: {
                    response = subtract_two(input1, input2);
                    System.out.println("The answer is " + response + ".");
                    userChoice = CalculatorMethods.display_Menu();
                    break;
                }
                case 3: {
                    response = multiply_two(input1, input2);
                    System.out.println("The answer is " + response + ".");
                    userChoice = CalculatorMethods.display_Menu();
                    break;
                }
                case 4: {

                    if (input2 == 0) {
                        System.out.println("Invalid denominator.  Let's try this again.");
                        userChoice = 4;
                        break;
                    }
                    response = divide_two(input1, input2);
                    System.out.println("The answer is " + response + ".");
                    userChoice = CalculatorMethods.display_Menu();
                    break;
                }
                default:
                    break;

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
        product = x * y;
        return product;
    }

    public static double divide_two(double x, double y) {
        double quotient;
        quotient = x / y;
        return quotient;
    }
    public static int add_two(int x, int y) {
        int sum;
        sum = x + y;
        return sum;
    }

    public static int subtract_two(int x, int y) {
        int diff;
        diff = x - y;
        return diff;
    }

    public static int multiply_two(int x, int y) {
        int product;
        product = x * y;
        return product;
    }

    public static int divide_two(int x, int y) {
        int quotient;
        quotient = x / y;
        return quotient;
    }

        
    public static float subtract_two(float x, float y) {
        float diff;
        diff = x - y;
        return diff;
    }

    public static float multiply_two(float x, float y) {
        float product;
        product = x * y;
        return product;
    }

    public static float divide_two(float x, float y) {
        float quotient;
        quotient = x / y;
        return quotient;
    }
}
