/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jesse
 */
public class LastDigitTest {

    LastDigit ldig = new LastDigit();

    public LastDigitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    @Test
    public void Test1() {
        Assert.assertTrue("Result not as expected", ldig.lastDigit(23, 19, 13));
        Assert.assertTrue("Result not as expected", ldig.lastDigit(23, 13, 19));
        Assert.assertTrue("Result not as expected", ldig.lastDigit(23, 13, 13));
        Assert.assertTrue("Result not as expected", ldig.lastDigit(23, 23, 13));
        Assert.assertTrue("Result not as expected", ldig.lastDigit(19, 19, 13));
        Assert.assertTrue("Result not as expected", ldig.lastDigit(0, 19, 0));
        Assert.assertTrue("Result not as expected", ldig.lastDigit(230, 19, 19));
        Assert.assertTrue("Result not as expected", ldig.lastDigit(0, 10, 88));
    }

    @Test
    public void Test2() {
        Assert.assertFalse("Result not as expected", ldig.lastDigit(23, 19, 12));
        Assert.assertFalse("Result not as expected", ldig.lastDigit(239, 192, 123));
        Assert.assertFalse("Result not as expected", ldig.lastDigit(230, 199, 122));
        Assert.assertFalse("Result not as expected", ldig.lastDigit(0, 1, 2));
        Assert.assertFalse("Result not as expected", ldig.lastDigit(0, 11, 22));
        Assert.assertFalse("Result not as expected", ldig.lastDigit(0, 12, 24));
        Assert.assertFalse("Result not as expected", ldig.lastDigit(0, 8, 9));
    }

    @Test
    public void Test3() {
        Assert.assertTrue("Result not as expected", ldig.lastDigit(23, 19, 3));
        Assert.assertTrue("Result not as expected", ldig.lastDigit(23, 13, 3));
        Assert.assertTrue("Result not as expected", ldig.lastDigit(23, 13, 8));
        Assert.assertTrue("Result not as expected", ldig.lastDigit(23, 18, 8));
   
    }

}
