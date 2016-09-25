/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2Lab2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Jesse
 */
public class InterestCalculator_v2 {
 public static void main(String[] args) {
        double principalAmt, interestRate, runningAmt, interest;  
        int numberYears, numCompounds;
        String inputCompounds;
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner sc = new Scanner(System.in);
       
        principalAmt = InterestCalculatorMethods.validate_principal(); 
        interestRate = InterestCalculatorMethods.validate_interest();
        numberYears = InterestCalculatorMethods.validate_numYears();
        inputCompounds = InterestCalculatorMethods.validate_compounds();
 
     // I decided to provide three outcomes for the compounding period instead of asking for an integer.
     
        runningAmt = principalAmt;
        interest = 0;
        numCompounds = InterestCalculatorMethods.convert_compounds(inputCompounds);
        
        for (int i = 1; i <= numCompounds*numberYears; i++) {
            interest += runningAmt*(interestRate/(numCompounds*100)); 
            runningAmt = runningAmt*(1+ interestRate/(numCompounds*100));
            if (i % numCompounds == 0)
            {System.out.println("Year " + i/4 + " " + df.format(runningAmt - interest)
                                 + " " + df.format(runningAmt) + " " 
                                  + " " + df.format(interest)) ;
              interest = 0;
            }
                
        }
            
    }   
        
}
