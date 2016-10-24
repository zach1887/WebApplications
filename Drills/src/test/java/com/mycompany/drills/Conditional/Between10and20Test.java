/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Conditional;

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
public class Between10and20Test {

    Between10and20 btw = new Between10and20();

    public Between10and20Test() {
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
    //
    @Test
    public void Test1() {
        Assert.assertTrue("Result not as expected", btw.between10and20(12, 99));
        Assert.assertTrue("Result not as expected", btw.between10and20(12, 999));
        Assert.assertTrue("Result not as expected", btw.between10and20(12, 9999));
        Assert.assertTrue("Result not as expected", btw.between10and20(10, 99));
        Assert.assertTrue("Result not as expected", btw.between10and20(10, 999));
        Assert.assertTrue("Result not as expected", btw.between10and20(10, 9999));
        Assert.assertTrue("Result not as expected", btw.between10and20(10, -99));
        Assert.assertTrue("Result not as expected", btw.between10and20(10, -999));
        Assert.assertTrue("Result not as expected", btw.between10and20(10, -9999));
    }

    @Test
    public void Test2() {
        Assert.assertTrue("Result not as expected", btw.between10and20(21, 12));
        Assert.assertTrue("Result not as expected", btw.between10and20(210, 12));
        Assert.assertTrue("Result not as expected", btw.between10and20(2100, 12));
        Assert.assertTrue("Result not as expected", btw.between10and20(21000, 12));
        Assert.assertTrue("Result not as expected", btw.between10and20(21, 20));
        Assert.assertTrue("Result not as expected", btw.between10and20(210, 20));
        Assert.assertTrue("Result not as expected", btw.between10and20(2100, 20));
        Assert.assertTrue("Result not as expected", btw.between10and20(-21, 20));
        Assert.assertTrue("Result not as expected", btw.between10and20(-210, 20));
        Assert.assertTrue("Result not as expected", btw.between10and20(-2100, 20));
    }

    @Test
    public void Test3() {
        Assert.assertTrue("Result not as expected", btw.between10and20(10, 10));
        Assert.assertTrue("Result not as expected", btw.between10and20(10, 20));
        Assert.assertTrue("Result not as expected", btw.between10and20(20, 10));
        Assert.assertTrue("Result not as expected", btw.between10and20(20, 20));
        Assert.assertTrue("Result not as expected", btw.between10and20(15, 15));
        Assert.assertTrue("Result not as expected", btw.between10and20(12, 17));
        Assert.assertTrue("Result not as expected", btw.between10and20(14, 14));
    }
    @Test
    public void Test4() {
        Assert.assertFalse("Result not as expected", btw.between10and20(8, 99));
        Assert.assertFalse("Result not as expected", btw.between10and20(8, 999));
        Assert.assertFalse("Result not as expected", btw.between10and20(8, 9999));
        Assert.assertFalse("Result not as expected", btw.between10and20(9, 21));
        Assert.assertFalse("Result not as expected", btw.between10and20(9, 210));
        Assert.assertFalse("Result not as expected", btw.between10and20(9, 2100));
        Assert.assertFalse("Result not as expected", btw.between10and20(-8, 99));
        Assert.assertFalse("Result not as expected", btw.between10and20(-8, 999));
        Assert.assertFalse("Result not as expected", btw.between10and20(-8, -9999));
        Assert.assertFalse("Result not as expected", btw.between10and20(9, -21));
        Assert.assertFalse("Result not as expected", btw.between10and20(9, -210));
        Assert.assertFalse("Result not as expected", btw.between10and20(9, -2100));
    }
    
    
}

