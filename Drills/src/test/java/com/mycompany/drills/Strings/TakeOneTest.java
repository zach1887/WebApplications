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
public class TakeOneTest {

    TakeOne takeone = new TakeOne();

    public TakeOneTest() {
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

    @Test
    public void Test1() {
        Assert.assertEquals("Not as expected", "H", takeone.takeOne("Hello", true));
        Assert.assertEquals("Result not as expected", "H", takeone.takeOne("Hello", true));
        Assert.assertEquals("Result not as expected", "H", takeone.takeOne("Hello, it doesn't matter what I type here", true));
        Assert.assertEquals("Result not as expected", "H", takeone.takeOne("H    ", true));
        Assert.assertEquals("Result not as expected", "H", takeone.takeOne("Hx", true));
        Assert.assertEquals("Result not as expected", "H", takeone.takeOne("Httt", true));
        Assert.assertEquals("Result not as expected", "H", takeone.takeOne("H    s    s      s", true));
        Assert.assertEquals("Result not as expected", "H", takeone.takeOne("Herterdfgfv", true));
    }
    @Test
    public void Test2() {
        Assert.assertEquals("Not as expected", "o", takeone.takeOne("Hello", false));
        Assert.assertEquals("Result not as expected", "o", takeone.takeOne("Hello", false));
        Assert.assertEquals("Result not as expected", "o", takeone.takeOne("Doesn't matter what I type here Hello", false));
        Assert.assertEquals("Result not as expected", "o", takeone.takeOne("H    o", false));
        Assert.assertEquals("Result not as expected", "o", takeone.takeOne("fdghdfghfghfgho", false));
        Assert.assertEquals("Result not as expected", "o", takeone.takeOne("oooooooooooo", false));
        Assert.assertEquals("Result not as expected", "o", takeone.takeOne("HHHXXXCCCo", false));
        Assert.assertEquals("Result not as expected", "o", takeone.takeOne("oo", false));
        Assert.assertEquals("Result not as expected", "o", takeone.takeOne("ohohohohoho", false));
    }
    @Test
    public void Test3() {
        Assert.assertEquals("Not as expected", "o", takeone.takeOne("oh", true));
        Assert.assertEquals("Result not as expected", "h", takeone.takeOne("oh", false));
        Assert.assertEquals("Result not as expected", "h", takeone.takeOne("o        h", false));
        Assert.assertEquals("Result not as expected", "o", takeone.takeOne("o        h", true));
        Assert.assertEquals("Result not as expected", " ", takeone.takeOne("  ", true));
        Assert.assertEquals("Result not as expected", " ", takeone.takeOne("  ", false));
        Assert.assertEquals("Result not as expected", " ", takeone.takeOne(" ", true));
        Assert.assertEquals("Result not as expected", " ", takeone.takeOne(" ", false));
        Assert.assertEquals("Result not as expected", "C", takeone.takeOne("C", true));
        Assert.assertEquals("Result not as expected", "C", takeone.takeOne("C", false));
        Assert.assertNull("Result not as expected",takeone.takeOne("", false));
        Assert.assertNull("Result not as expected",takeone.takeOne("", true));
    }
    
}
