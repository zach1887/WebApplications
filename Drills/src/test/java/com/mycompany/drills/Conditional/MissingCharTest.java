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
public class MissingCharTest {

    MissingChar mc = new MissingChar();

    public MissingCharTest() {
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
    Assert.assertEquals("Result not as expected","itten",mc.missingChar("kitten", 0));
    Assert.assertEquals("Result not as expected","ktten",mc.missingChar("kitten", 1));
    Assert.assertEquals("Result not as expected","kiten",mc.missingChar("kitten", 2));
    Assert.assertEquals("Result not as expected","kiten",mc.missingChar("kitten", 3));
    Assert.assertEquals("Result not as expected","kittn",mc.missingChar("kitten", 4));
    Assert.assertEquals("Result not as expected","kitte",mc.missingChar("kitten", 5));
    Assert.assertEquals("Result not as expected","kitten",mc.missingChar("kitten", 6));
    Assert.assertEquals("Result not as expected","kitten",mc.missingChar("kitten", 7));
    Assert.assertEquals("Result not as expected","kitten",mc.missingChar("kitten", 8));
    }
    @Test
    public void Test2() {
    Assert.assertEquals("Result not as expected","",mc.missingChar("", 0));
    Assert.assertEquals("Result not as expected","",mc.missingChar("", 1));
    Assert.assertEquals("Result not as expected","",mc.missingChar("", 2));
    Assert.assertEquals("Result not as expected","",mc.missingChar(" ", 0));
    Assert.assertEquals("Result not as expected"," ",mc.missingChar(" ", 1));
    Assert.assertEquals("Result not as expected"," ",mc.missingChar("  ", 0));
    Assert.assertEquals("Result not as expected"," ",mc.missingChar("  ", 1));
    Assert.assertEquals("Result not as expected","  ",mc.missingChar("  ", 2));
    Assert.assertEquals("Result not as expected","  ",mc.missingChar("  ", 3));
    Assert.assertEquals("Result not as expected","  ",mc.missingChar("   ", 0));
    Assert.assertEquals("Result not as expected","  ",mc.missingChar("   ", 1));
    Assert.assertEquals("Result not as expected","  ",mc.missingChar("   ", 2));
    Assert.assertEquals("Result not as expected","   ",mc.missingChar("   ", 3));
    Assert.assertEquals("Result not as expected","   ",mc.missingChar("   ", 4));
    }
}
