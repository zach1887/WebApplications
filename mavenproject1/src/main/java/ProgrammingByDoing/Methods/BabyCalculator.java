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
public class BabyCalculator {
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		double a, b, c;
		String op;

		do
		{
			System.out.print("> ");
			a  = keyboard.nextDouble();
			op = keyboard.next();
			b  = keyboard.nextDouble();

			if ( op.equals("+") )
				c = add_two(a,b);
                        
                        else if ( op.equals("-"))
                                c = subtract_two(a,b);
                        
                        else if ( op.equals("*"))
                               c = multiply_two(a,b);
                        
                        else if ( op.equals("/") && b == 0){
                             System.out.println("This operation is not defined.");
                             c = 999999999;
                        }
                        
                        else if (op.equals("/"))     
                             c = divide_two(a,b);                        
                        else
			{
				System.out.println("Undefined operator: '" + op + "'.");
				c = 0;
			}

			System.out.println(c);

		} while ( a != 0 );
                System.out.println("Catch ya later!");
	}
        
        public static double add_two (double x, double y) {
            double sum;
            
            sum = x + y;
            
            return sum;
        }
        public static double subtract_two (double x, double y) {
            double diff;
            
            diff = x - y;
            
            return diff;
        }
        public static double multiply_two (double x, double y) {
            double product;
            
            product = x*y;
            
            return product;
        }
        public static double divide_two (double x, double y) {
            double quotient;
            
            quotient = x/y;
            
            return quotient;
        }
}
   

