/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingByDoing.Methods;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author Jesse
 */
public class DistanceFormula {
    public static void main( String[] args )
	{
            int x1, y1, x2, y2;
            DecimalFormat df = new DecimalFormat("#.000");
            
            
		// test the formula a bit
		double d1 = distance(-2,1 , 1,5);
		System.out.println(" (-2,1) to (1,5) => " + d1 );
		double d2 = distance(-2,-3 , -4,4);
		System.out.println(" (-2,-3) to (-4,4) => " + d2 );
		System.out.println(" (2,-3) to (-1,-2) => " + distance(2,-3,-1,-2) );
		System.out.println(" (4,5) to (4,5) => " + distance(4,5,4,5) );
            
                Scanner sc = new Scanner (System.in);
                System.out.print("Enter in a value for x1:  ");
                x1 = sc.nextInt();
                System.out.print("Enter in a value for y1:  ");
                y1 = sc.nextInt();
                System.out.print("Enter in a value for x2:  ");
                x2 = sc.nextInt();
                System.out.print("Enter in a value for y2:  ");
                y2 = sc.nextInt();
                
                System.out.println("The distance from (" + x1 + ", " + y1 
                            + ") to (" + x2 + ", " + y2 + ") is " + df.format(distance(x1, y1, x2, y2)));
                
	}
 
	public static double distance( int x1, int y1, int x2, int y2 )
	{
		double dist;
                
                dist = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
                
                return dist;       
	}
}
