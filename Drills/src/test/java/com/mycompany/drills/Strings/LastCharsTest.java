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
public class LastCharsTest {

    LastChars lc = new LastChars();

    public LastCharsTest() {
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
        Assert.assertEquals("Result not as expected", "ls", lc.lastChars("last", "chars"));
        Assert.assertEquals("Result not as expected", "ls", lc.lastChars("lastxxx", "yyychars"));
        Assert.assertEquals("Result not as expected", "ls", lc.lastChars("l", "chars"));
        Assert.assertEquals("Result not as expected", "ls", lc.lastChars("last", "s"));
        Assert.assertEquals("Result not as expected", "ls", lc.lastChars("l", "s"));
    }

    @Test
    public void Test2() {
        Assert.assertEquals("Result not as expected", "ya", lc.lastChars("yo", "mama"));
        Assert.assertEquals("Result not as expected", "ym", lc.lastChars("yo", "mamam"));
        Assert.assertEquals("Result not as expected", "ya", lc.lastChars("yo", "mamama"));
        Assert.assertEquals("Result not as expected", "y ", lc.lastChars("yo", "mamama "));
        Assert.assertEquals("Result not as expected", "yx", lc.lastChars("yo", "mama        x"));
    }

    @Test
    public void Test3() {
        Assert.assertEquals("Result not as expected", "h@", lc.lastChars("hi", ""));
        Assert.assertEquals("Result not as expected", "h@", lc.lastChars("h", ""));
        Assert.assertEquals("Result not as expected", "7@", lc.lastChars("7", ""));
        Assert.assertEquals("Result not as expected", " @", lc.lastChars(" ", ""));
        Assert.assertEquals("Result not as expected", "@i", lc.lastChars("", "hi"));
        Assert.assertEquals("Result not as expected", "@x", lc.lastChars("", "hixxxx"));
        Assert.assertEquals("Result not as expected", "@h", lc.lastChars("", "h" ));
        Assert.assertEquals("Result not as expected", "@ ", lc.lastChars("", "  " ));
        Assert.assertEquals("Result not as expected", "  ", lc.lastChars("  ", "  " ));
        Assert.assertEquals("Result not as expected", "@@", lc.lastChars("@@", "@@" ));
        Assert.assertEquals("Result not as expected", "@@", lc.lastChars("@", "@" ));
        Assert.assertEquals("Result not as expected", "@@", lc.lastChars("", "@" ));
        Assert.assertEquals("Result not as expected", "@@", lc.lastChars("@", "" ));
    }
    
}
