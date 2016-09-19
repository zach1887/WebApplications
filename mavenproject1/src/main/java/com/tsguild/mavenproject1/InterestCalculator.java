/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.mavenproject1;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author Jesse
 */
public class InterestCalculator {
    public static void main(String[] args) {
        double principalAmt, interestRate, runningAmt, interest;  
        int numberYears;
        DecimalFormat df = new DecimalFormat("#.00");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What is the principal?  ");
        principalAmt = sc.nextDouble();
        while (principalAmt < 0 || principalAmt > 1e7)
        { System.out.println("Not a valid input");
          System.out.print("What is the principal?"  );
          principalAmt = sc.nextDouble();
        }
        System.out.print("What is the interest rate (as a %)?  ");
        interestRate = sc.nextDouble();
        while (interestRate < 0 || interestRate > 100)
        { System.out.println("Not a valid input");
          System.out.print("What is the interest rate (as a %)?");
          interestRate = sc.nextDouble();
        }
        
        System.out.print("How many years will the money be in the fund?  ");
        numberYears = sc.nextInt();
        while (numberYears < 1 || numberYears > 100)
        { System.out.println("Not a valid input");
          System.out.print("How many years will the money be in the fund?");
          numberYears = sc.nextInt();       
        }    
       
        runningAmt = principalAmt;
        interest = 0;
        
        for (int i = 1; i <= 4*numberYears; i++) {
            interest += runningAmt*(interestRate/400); 
            runningAmt = runningAmt*(1+ interestRate/400);
            if (i % 4 == 0)
            {System.out.println("Year " + i/4 + " " + df.format(runningAmt - interest)
                                 + " " + df.format(runningAmt) + " " 
                                  + " " + df.format(interest)) ;
              interest = 0;
            }
                
        }
            
    }   
    
}