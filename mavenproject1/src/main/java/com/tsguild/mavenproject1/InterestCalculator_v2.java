/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.mavenproject1;

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

        System.out.print("What is the principal?  ");
        principalAmt = sc.nextDouble();
        while (principalAmt < 0 || principalAmt > 1e7) {
            System.out.println("Not a valid input");
            System.out.print("What is the principal?");
            principalAmt = sc.nextDouble();
        }
        System.out.print("What is the interest rate (as a %)?  ");
        interestRate = sc.nextDouble();
        while (interestRate < 0 || interestRate > 100) {
            System.out.println("Not a valid input");
            System.out.print("What is the interest rate (as a %)?");
            interestRate = sc.nextDouble();
        }

        System.out.print("How many years will the money be in the fund?  ");
        numberYears = sc.nextInt();
        while (numberYears < 1 || numberYears > 100) {
            System.out.println("Not a valid input");
            System.out.print("How many years will the money be in the fund?");
            numberYears = sc.nextInt();
        }

        System.out.print("Will the money be compounded quarterly (q), monthly(m). or daily(d)?  ");
        inputCompounds = sc.nextLine();
        while ((!inputCompounds.equals("q")) && (!inputCompounds.equals("m")) && (!inputCompounds.equals("d"))) {
            System.out.println("Not a valid input");
            System.out.print("Will the money be compounded quarterly (q), monthly(m). or daily(d)?  ");
            inputCompounds = sc.nextLine();
        }
        // I decided to provide three outcomes for the compounding period instead of asking for an integer.

        runningAmt = principalAmt;
        interest = 0;
        if (inputCompounds.equals("q")) {
            numCompounds = 4;
        } else if (inputCompounds.equals("m")) {
            numCompounds = 12;
        } else if (inputCompounds.equals("d")) {
            numCompounds = 365;
        } else {
            numCompounds = 1;  // if this happens, something went wrong
        }
        for (int i = 1; i <= numCompounds * numberYears; i++) {
            interest += runningAmt * (interestRate / (numCompounds * 100));
            runningAmt = runningAmt * (1 + interestRate / (numCompounds * 100));
            if (i % numCompounds == 0) {
                System.out.println("Year " + i / (numCompounds) + " " + df.format(runningAmt - interest)
                        + " " + df.format(runningAmt) + " "
                        + " " + df.format(interest));
                interest = 0;
            }

        }

    }

}
