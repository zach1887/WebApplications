/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.inhertianceandinterface.bank;

import java.text.DecimalFormat;

/**
 *
 * @author apprentice
 */
abstract public class Account {

    protected int PIN;
    protected int acctNum;
    protected double currentBalance;
    DecimalFormat df = new DecimalFormat("#.00");

    public Account(int PIN, int acctNum, double currentBalance) {

        this.PIN = PIN;
        this.acctNum = acctNum;
        this.currentBalance = currentBalance;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public int getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(int acctNum) {
        this.acctNum = acctNum;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    abstract public Account makeDeposit(Account acct, double depositAmt);

    abstract public Account makeWithdrawal(Account acct, double withdrawalAmt);

}
