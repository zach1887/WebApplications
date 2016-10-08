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

    CheckingAccount chk = new CheckingAccount(1243, 898898, 1200);

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
    public void testMakeDeposit() {
        chk.makeDeposit((Account) chk, 300);
        CheckingAccount shouldMatch = new CheckingAccount(1243, 898898, 1500);
        Assert.assertEquals(chk, (Account) shouldMatch);
    }

    @Test
    public void test2MakeDeposit() {
        chk.makeDeposit(chk, 50000);
        CheckingAccount shouldMatch = new CheckingAccount(1243, 898898, 51200);

        Assert.assertEquals(chk, shouldMatch);
    }

    @Test
    public void testMakeWithdrawal() {
        chk.makeWithdrawal(chk, 300);
        CheckingAccount shouldMatch = new CheckingAccount(1243, 898898, 900);

        Assert.assertEquals(chk, shouldMatch);

    }
     @Test
   public void test2MakeWithdrawal() {
     chk.makeWithdrawal(chk, 10000);
      CheckingAccount shouldMatch = new CheckingAccount(1243, 898898, 1200);
     
      Assert.assertEquals(chk, shouldMatch);
     
  }
      @Test
    public void test3MakeWithdrawal() {
      chk.makeWithdrawal(chk, 1250);
      CheckingAccount shouldMatch = new CheckingAccount(1243, 898898, -60);
      
      Assert.assertEquals(chk, shouldMatch);
      
    }
    
    
    public void usingTest(){
//        int PIN, int acctNum, double currentBalance
        Account acct = new CheckingAccount(1234, 1111, 100);
        acct.makeDeposit(100);
        Assert.assertEquals(200, acct.getCurrentBalance());
    }
    

}
