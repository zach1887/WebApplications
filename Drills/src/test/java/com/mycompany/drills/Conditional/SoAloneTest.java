/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Conditional;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jesse
 */
public class SoAloneTest {

    SoAlone soalone = new SoAlone();

    public SoAloneTest() {
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
        Assert.assertTrue("Result not as expected", soalone.soAlone(13, 99));
        Assert.assertTrue("Result not as expected", soalone.soAlone(13, 999));
        Assert.assertTrue("Result not as expected", soalone.soAlone(13, 9999));
        Assert.assertTrue("Result not as expected", soalone.soAlone(13, 0));
        Assert.assertTrue("Result not as expected", soalone.soAlone(13, -1));
        Assert.assertTrue("Result not as expected", soalone.soAlone(13, -13));
        Assert.assertTrue("Result not as expected", soalone.soAlone(13, 20));
        Assert.assertTrue("Result not as expected", soalone.soAlone(13, 12));
    }

    @Test
    public void Test2() {
        Assert.assertTrue("Result not as expected", soalone.soAlone(210, 19));
        Assert.assertTrue("Result not as expected", soalone.soAlone(2100, 19));
        Assert.assertTrue("Result not as expected", soalone.soAlone(21000, 19));
        Assert.assertTrue("Result not as expected", soalone.soAlone(0, 19));
        Assert.assertTrue("Result not as expected", soalone.soAlone(-6, 19));
        Assert.assertTrue("Result not as expected", soalone.soAlone(-19, 19));
        Assert.assertTrue("Result not as expected", soalone.soAlone(20, 19));
        Assert.assertTrue("Result not as expected", soalone.soAlone(12, 19));
    }

    @Test
    public void Test3() {
        Assert.assertFalse("Result not as expected", soalone.soAlone(13, 13));
        Assert.assertFalse("Result not as expected", soalone.soAlone(14, 14));
        Assert.assertFalse("Result not as expected", soalone.soAlone(13, 14));
        Assert.assertFalse("Result not as expected", soalone.soAlone(14, 13));
        Assert.assertFalse("Result not as expected", soalone.soAlone(19, 19));
        Assert.assertFalse("Result not as expected", soalone.soAlone(13, 19));
        Assert.assertFalse("Result not as expected", soalone.soAlone(19, 13));
        Assert.assertFalse("Result not as expected", soalone.soAlone(0, 99));
        Assert.assertFalse("Result not as expected", soalone.soAlone(20, 40));
        Assert.assertFalse("Result not as expected", soalone.soAlone(10, 12));
        Assert.assertFalse("Result not as expected", soalone.soAlone(20, 40));
        Assert.assertFalse("Result not as expected", soalone.soAlone(1000, 10));
        Assert.assertFalse("Result not as expected", soalone.soAlone(10, 1000));
    }
}
