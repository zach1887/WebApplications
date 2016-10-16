/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.inhertianceandinterface.bank;

/**
 *
 * @author apprentice
 */
public class SavingsAccount extends Account {

    private final double TRANSACTION_COST = 3;

    SavingsAccount(int PIN, int acctNum, double currentBalance) {
        super(PIN, acctNum, currentBalance);

    }

    @Override
    public Account makeDeposit(Account acct, double depositAmount) {
        if (depositAmount <= 0) {
            System.out.println("That deposit amount is invalid.");
            return acct;
        }
        double currentAmt = acct.currentBalance;
        if (depositAmount > 10000) {
            System.out.println("Deposits of $10,000 or more must be cleared before depositing.");
            return acct;
        }
        acct.setCurrentBalance(currentAmt + depositAmount);
        System.out.println("Your updated balance is " + df.format(acct.getCurrentBalance()));
        return acct;
    }

    @Override
    public Account makeWithdrawal(Account acct, double withdrawalAmt) {
        if (withdrawalAmt <= 0) {
            System.out.println("That deposit amount is invalid.");
            return acct;
        }
        double currentAmt = acct.currentBalance;

        if (withdrawalAmt > (currentAmt - TRANSACTION_COST)) {
            System.out.println("You do not have sufficient funds to make this transaction.");
            return acct;
        }
        acct.setCurrentBalance(currentAmt - withdrawalAmt - TRANSACTION_COST);
        System.out.println("Your updated balance is " + df.format(acct.getCurrentBalance()));
        return acct;
    }

}
