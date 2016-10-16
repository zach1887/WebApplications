/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.inhertianceandinterface.bank;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class CheckingAccount extends Account {

    private final double OVERDRAFT_FEE = 10;
    private final double OVERDRAFT_MAX = 100; 
    private double depositAmount;
    private double withdrawalAmount;
    Scanner sc = new Scanner(System.in);

    CheckingAccount(int PIN, int acctNum, double currentBalance) {  //constructor
        super(PIN, acctNum, currentBalance);
//        this.depositAmount = depositAmount;
//        this.withdrawalAmount = withdrawalAmount;
    }

    @Override
    public Account makeDeposit(Account acct, double depositAmount) {
        if (depositAmount <= 0) {
            System.out.println("That deposit amount is invalid.");
            return acct;
        }
        double currentAmt = acct.currentBalance;
        acct.setCurrentBalance(currentAmt + depositAmount);
        System.out.println("Your updated balance is " + df.format(acct.getCurrentBalance()));
        return acct;
    }

    @Override
    public Account makeWithdrawal(Account acct, double withdrawalAmount) {
        if (withdrawalAmount <= 0) {
            System.out.println("That deposit amount is invalid.");
            return acct;
        }
            double currentAmt = acct.currentBalance;
            if (withdrawalAmount > currentBalance + OVERDRAFT_MAX) {
                System.out.println("Your transaction has been declined.");
                return acct;
            }
            if (withdrawalAmount > currentBalance) {
                System.out.println("You do not have sufficient funds to make this withdrawal.");
                System.out.println("Continuing with this transaction will result in a $" + OVERDRAFT_FEE + " fee.");
//            System.out.println("Would you like to continue? (y/n)?");
//            String userResponse = sc.nextLine();
//            if (userResponse.equalsIgnoreCase("n")) return acct;
                acct.setCurrentBalance(currentAmt - withdrawalAmount - OVERDRAFT_FEE);
                System.out.println("Your updated balance is " + df.format(acct.getCurrentBalance()));
                return acct;
            }

            acct.setCurrentBalance(currentAmt - withdrawalAmount);
            System.out.println("Your updated balance is " + df.format(acct.getCurrentBalance()));
            return acct;
        }

    }
