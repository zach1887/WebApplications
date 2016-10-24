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
public class PosNegTest {

    PosNeg pn = new PosNeg();

    public PosNegTest() {
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
        Assert.assertTrue("Result not as expected", pn.posNeg(-1, 1, false));
        Assert.assertTrue("Result not as expected", pn.posNeg(-1, 2, false));
        Assert.assertTrue("Result not as expected", pn.posNeg(-1, 3, false));
        Assert.assertTrue("Result not as expected", pn.posNeg(-1, 99999, false));
        Assert.assertTrue("Result not as expected", pn.posNeg(-999999, 1, false));
        Assert.assertTrue("Result not as expected", pn.posNeg(-99999, 1, false));
        Assert.assertTrue("Result not as expected", pn.posNeg(-55, 445, false));
        Assert.assertTrue("Result not as expected", pn.posNeg(-453, 233, false));
    }

    @Test
    public void Test2() {
        Assert.assertTrue("Result not as expected", pn.posNeg(1, -1, false));
        Assert.assertTrue("Result not as expected", pn.posNeg(1, -9999, false));
        Assert.assertTrue("Result not as expected", pn.posNeg(1, -34534, false));
        Assert.assertTrue("Result not as expected", pn.posNeg(12321, -456456, false));
        Assert.assertTrue("Result not as expected", pn.posNeg(14, -444, false));
        Assert.assertTrue("Result not as expected", pn.posNeg(999, -999, false));
        Assert.assertTrue("Result not as expected", pn.posNeg(999, -1, false));
    }

    @Test
    public void Test3() {
        Assert.assertTrue("Result not as expected", pn.posNeg(-4, -5, true));
        Assert.assertTrue("Result not as expected", pn.posNeg(-1, -5, true));
        Assert.assertTrue("Result not as expected", pn.posNeg(-999, -5, true));
        Assert.assertTrue("Result not as expected", pn.posNeg(-4, -999, true));
        Assert.assertTrue("Result not as expected", pn.posNeg(-999, -999, true));
        Assert.assertTrue("Result not as expected", pn.posNeg(-40000, -500004, true));
    }
    @Test
    public void Test4() {
        Assert.assertFalse("Result not as expected", pn.posNeg(-4, 5, true));
        Assert.assertFalse("Result not as expected", pn.posNeg(-4, 0, true));
        Assert.assertFalse("Result not as expected", pn.posNeg(4, -5, true));
        Assert.assertFalse("Result not as expected", pn.posNeg(0, -5, true));
        Assert.assertFalse("Result not as expected", pn.posNeg(4, 5, true));
        Assert.assertFalse("Result not as expected", pn.posNeg(0, 0, true));
        Assert.assertFalse("Result not as expected", pn.posNeg(0, 0, false));
        Assert.assertFalse("Result not as expected", pn.posNeg(0, 1, false));
        Assert.assertFalse("Result not as expected", pn.posNeg(1, 0, false));
        Assert.assertFalse("Result not as expected", pn.posNeg(1, 1, false));
        Assert.assertFalse("Result not as expected", pn.posNeg(-1, -1, false));
        Assert.assertFalse("Result not as expected", pn.posNeg(-999, -999, false));
        Assert.assertFalse("Result not as expected", pn.posNeg(999, 999, false));

    }
}
