/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2Lab2;

import java.util.Scanner;

/**
 *
 * @author Jesse
 */
public class InterestCalculatorMethods {
  public static double validate_principal () {
         Scanner sc = new Scanner(System.in); 
         System.out.print("What is the principal?  ");
         double input = sc.nextDouble();
         while (input < 0 || input > 1e7)
        { System.out.println("Not a valid input");
          System.out.print("What is the principal?"  );
          input = sc.nextDouble();
        }
         return input;
      
  }
public static double validate_interest (){
        Scanner sc = new Scanner(System.in); 
        System.out.print("What is the interest rate (as a %)?  ");
        System.out.print("Enter a value from 0 to 100  ");
        double interestRate = sc.nextDouble();
        while (interestRate < 0 || interestRate > 100)
        { System.out.println("Not a valid input");
          System.out.print("What is the interest rate (as a %)?");
          interestRate = sc.nextDouble();
        }
        return interestRate;
}  
public static int validate_numYears (){
        Scanner sc = new Scanner(System.in); 
        System.out.print("How many years will the money be in the fund?  ");
        int numYears = sc.nextInt();
        while (numYears < 1 || numYears > 100)
        { System.out.println("Not a valid input");
          System.out.print("How many years will the money be in the fund?");
          numYears = sc.nextInt();       
        }
        return numYears;
}  
public static String validate_compounds (){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Will the money be compounded quarterly (q), monthly(m). or daily(d)?  ");
        String inputCompounds = sc.nextLine();
        while ((!inputCompounds.equals("q")) && (!inputCompounds.equals("m")) && (!inputCompounds.equals("d")))
        { System.out.println("Not a valid input");
        System.out.print("Will the money be compounded quarterly (q), monthly(m). or daily(d)?  ");
        inputCompounds = sc.nextLine();     
        }    
        return inputCompounds;
}
public static int convert_compounds (String s) {
        int nCom;
      switch (s) {
          case "q":
              nCom = 4;
              break; 
          case "m":
              nCom  = 12;
              break;
          case "d":
              nCom  = 365;
              break;
          default:
              nCom  = 1;
              break;
      }
        return nCom;
}
}
