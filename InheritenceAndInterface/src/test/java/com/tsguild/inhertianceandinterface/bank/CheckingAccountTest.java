/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.inhertianceandinterface.bank;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class CheckingAccountTest {

    Account chk = new CheckingAccount(1243, 898898, 1200);
    Account sav = new SavingsAccount(3003, 898898, 686);

    public CheckingAccountTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of makeDeposit method, of class CheckingAccount.
     */
    @Test
    public void chkAcctNumTest() {
        Assert.assertEquals(898898, chk.getAcctNum());
    }

    @Test
    public void savAcctNumTest() {
        Assert.assertEquals(898898, sav.getAcctNum());
    }

    @Test
    public void chkAcctPINTest() {
        Assert.assertEquals(1243, chk.getPIN());
    }

    @Test
    public void savAcctPINTest() {
        Assert.assertEquals(3003, sav.getPIN());
    }

    @Test
    public void chkAcctBalanceTest() {
        Assert.assertEquals(1200.00, chk.getCurrentBalance(), 0.01);
    }

    @Test
    public void savAcctBalanceTest() {
        Assert.assertEquals(686.00, sav.getCurrentBalance(), 0.01);
    }
    @Test
    public void chkAcctDepositTest() {
        Account checking = new CheckingAccount(1203, 144523, 1300.00);
        Assert.assertEquals(1500.00,checking.makeDeposit(checking, 200.0).getCurrentBalance(),0.01);
    }
    @Test
    public void chkAcctDepositTest2() {
        Account checking = new CheckingAccount(1203, 144523, 0.00);
        Assert.assertEquals(200.00,checking.makeDeposit(checking, 200.0).getCurrentBalance(),0.01);
    }
    @Test
    public void chkAcctDepositTest3() {
        Account checking = new CheckingAccount(1203, 144523, 1300.00);
        Assert.assertEquals(51300.00,checking.makeDeposit(checking, 50000).getCurrentBalance(),0.01);
    }
    @Test
    public void chkAcctWithdrawalTest() {
        Account checking = new CheckingAccount(1203, 144523, 1300.00);
        Assert.assertEquals(1100.00,checking.makeWithdrawal(checking, 200.0).getCurrentBalance(),0.01);
    }
    @Test
    public void chkAcctWithdrawalTest2() {
        Account checking = new CheckingAccount(1203, 144523, 0.00);
        Assert.assertEquals(-60.00,checking.makeWithdrawal(checking, 50.0).getCurrentBalance(),0.01);
    }
    @Test
    public void chkAcctWithdrawalTest3() {
        Account checking = new CheckingAccount(1203, 144523, 1300.00);
        Assert.assertEquals(1300.00,checking.makeWithdrawal(checking, 50000).getCurrentBalance(),0.01);
    }
    @Test
    public void savAcctDepositTest() {
        Account saving= new SavingsAccount(1203, 144523, 1300.00);
        Assert.assertEquals(1500.00,saving.makeDeposit(saving, 200.0).getCurrentBalance(),0.01);
    }
    @Test
    public void savAcctDepositTest2() {
        Account saving = new SavingsAccount(1203, 144523, 0.00);
        Assert.assertEquals(200.00,saving.makeDeposit(saving, 200.0).getCurrentBalance(),0.01);
    }
    @Test
    public void savAcctDepositTest3() {
        Account saving = new SavingsAccount(1203, 144523, 1300.00);
        Assert.assertEquals(1300.00,saving.makeDeposit(saving, 50000).getCurrentBalance(),0.01);
    }
    @Test
    public void savAcctWithdrawalTest() {
        Account saving= new SavingsAccount(1203, 144523, 1300.00);
        Assert.assertEquals(0.00,saving.makeWithdrawal(saving, 1297.0).getCurrentBalance(),0.01);
    }
    @Test
    public void savAcctWithdrawalTest2() {
        Account saving = new SavingsAccount(1203, 144523, 150.00);
        Assert.assertEquals(150.00,saving.makeWithdrawal(saving, 200.0).getCurrentBalance(),0.01);
    }
    @Test
    public void savAcctWithdrawalTest3() {
        Account saving = new SavingsAccount(1203, 144523, 1800);
        Assert.assertEquals(1800.00,saving.makeWithdrawal(saving, -200).getCurrentBalance(),0.01);
    }

 

}
