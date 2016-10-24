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
public class Make10Test {

    Make10 m10 = new Make10();

    public Make10Test() {
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
        Assert.assertTrue("Results not as expected", m10.makes10(9, 10));
        Assert.assertTrue("Results not as expected", m10.makes10(5, 10));
        Assert.assertTrue("Results not as expected", m10.makes10(0, 10));
        Assert.assertTrue("Results not as expected", m10.makes10(-4444, 10));
        Assert.assertTrue("Results not as expected", m10.makes10(4444, 10));
        Assert.assertTrue("Results not as expected", m10.makes10(10, 10));
        Assert.assertTrue("Results not as expected", m10.makes10(10, 0));
        Assert.assertTrue("Results not as expected", m10.makes10(10, -5));
        Assert.assertTrue("Results not as expected", m10.makes10(10, -999));
        Assert.assertTrue("Results not as expected", m10.makes10(10, 999));
    }

    @Test
    public void Test2() {
        Assert.assertFalse("Results not as expected", m10.makes10(9, 9));
        Assert.assertFalse("Results not as expected", m10.makes10(9, 9));
        Assert.assertFalse("Results not as expected", m10.makes10(-8, -9));
        Assert.assertFalse("Results not as expected", m10.makes10(-9, -9));
        Assert.assertFalse("Results not as expected", m10.makes10(1, -9));
        Assert.assertFalse("Results not as expected", m10.makes10(0, 0));
        Assert.assertFalse("Results not as expected", m10.makes10(5, 4));
        Assert.assertFalse("Results not as expected", m10.makes10(4, 5));
        Assert.assertFalse("Results not as expected", m10.makes10(9, 11));
    }

    @Test
    public void Test3() {
        Assert.assertTrue("Results not as expected", m10.makes10(1, 9));
        Assert.assertTrue("Results not as expected", m10.makes10(2, 8));
        Assert.assertTrue("Results not as expected", m10.makes10(0, 10));
        Assert.assertTrue("Results not as expected", m10.makes10(-5, 15));
        Assert.assertTrue("Results not as expected", m10.makes10(5, 5));
        Assert.assertTrue("Results not as expected", m10.makes10(2, 8));
        Assert.assertTrue("Results not as expected", m10.makes10(20, -10));
        Assert.assertTrue("Results not as expected", m10.makes10(-20, 30));
        Assert.assertTrue("Results not as expected", m10.makes10(-1000, 1010));
        Assert.assertTrue("Results not as expected", m10.makes10(-2000, 2010));
        Assert.assertTrue("Results not as expected", m10.makes10(3000, -2990));
    }
    
}
