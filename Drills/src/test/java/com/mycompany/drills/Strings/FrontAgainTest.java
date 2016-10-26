/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Strings;

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
public class FrontAgainTest {

    FrontAgain fa = new FrontAgain();

    public FrontAgainTest() {
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
        Assert.assertTrue("Result not as expected", fa.frontAgain("EDITED"));
        Assert.assertTrue("Result not as expected", fa.frontAgain("edited"));
        Assert.assertTrue("Result not as expected", fa.frontAgain("xxeditedxx"));
        Assert.assertTrue("Result not as expected", fa.frontAgain("12edited12"));
        Assert.assertTrue("Result not as expected", fa.frontAgain("  edited  "));
    }

    @Test
    public void Test2() {
        Assert.assertFalse("Result not as expected", fa.frontAgain("EDIT"));
        Assert.assertFalse("Result not as expected", fa.frontAgain("edit"));
        Assert.assertFalse("Result not as expected", fa.frontAgain("efeefefefefe"));
        Assert.assertFalse("Result not as expected", fa.frontAgain("1234567891011122222222"));
        Assert.assertFalse("Result not as expected", fa.frontAgain("1234567891011122222222"));
        Assert.assertFalse("Result not as expected", fa.frontAgain(""));
        Assert.assertFalse("Result not as expected", fa.frontAgain(" "));
        Assert.assertFalse("Result not as expected", fa.frontAgain("1"));
        Assert.assertFalse("Result not as expected", fa.frontAgain("X"));
        Assert.assertFalse("Result not as expected", fa.frontAgain("@"));
    }

    @Test
    public void Test3() {
        Assert.assertTrue("Result not as expected", fa.frontAgain("ED"));
        Assert.assertTrue("Result not as expected", fa.frontAgain("ed"));
        Assert.assertTrue("Result not as expected", fa.frontAgain("xx"));
        Assert.assertTrue("Result not as expected", fa.frontAgain("q1"));
        Assert.assertTrue("Result not as expected", fa.frontAgain("12"));
        Assert.assertTrue("Result not as expected", fa.frontAgain("  "));


    }
}
