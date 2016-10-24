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
public class NearHundredTest {

    NearHundred nh = new NearHundred();

    public NearHundredTest() {
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
        Assert.assertTrue("Result not as expected", nh.nearHundred(103));
        Assert.assertTrue("Result not as expected", nh.nearHundred(105));
        Assert.assertTrue("Result not as expected", nh.nearHundred(107));
        Assert.assertTrue("Result not as expected", nh.nearHundred(110));
        Assert.assertTrue("Result not as expected", nh.nearHundred(100));
        Assert.assertTrue("Result not as expected", nh.nearHundred(203));
        Assert.assertTrue("Result not as expected", nh.nearHundred(205));
        Assert.assertTrue("Result not as expected", nh.nearHundred(206));
        Assert.assertTrue("Result not as expected", nh.nearHundred(210));
    }

    @Test
    public void Test2() {
        Assert.assertTrue("Result not as expected", nh.nearHundred(90));
        Assert.assertTrue("Result not as expected", nh.nearHundred(97));
        Assert.assertTrue("Result not as expected", nh.nearHundred(99));
        Assert.assertTrue("Result not as expected", nh.nearHundred(95));
        Assert.assertTrue("Result not as expected", nh.nearHundred(197));
        Assert.assertTrue("Result not as expected", nh.nearHundred(190));
        Assert.assertTrue("Result not as expected", nh.nearHundred(194));
        Assert.assertTrue("Result not as expected", nh.nearHundred(199));
    }

    @Test
    public void Test3() {
        Assert.assertFalse("Result not as expected", nh.nearHundred(89));
        Assert.assertFalse("Result not as expected", nh.nearHundred(88));
        Assert.assertFalse("Result not as expected", nh.nearHundred(80));
        Assert.assertFalse("Result not as expected", nh.nearHundred(111));
        Assert.assertFalse("Result not as expected", nh.nearHundred(115));
        Assert.assertFalse("Result not as expected", nh.nearHundred(999999));
        Assert.assertFalse("Result not as expected", nh.nearHundred(-999999));
        Assert.assertFalse("Result not as expected", nh.nearHundred(0));
        Assert.assertFalse("Result not as expected", nh.nearHundred(189));
        Assert.assertFalse("Result not as expected", nh.nearHundred(211));
        Assert.assertFalse("Result not as expected", nh.nearHundred(221));
        Assert.assertFalse("Result not as expected", nh.nearHundred(188));
        Assert.assertFalse("Result not as expected", nh.nearHundred(150));
    }
}
