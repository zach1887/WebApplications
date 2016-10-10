/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.loops;

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
public class CountLast2Test {

    CountLast2 cl2 = new CountLast2();

    public CountLast2Test() {
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
        Assert.assertEquals("Result not as expected", 1, cl2.countLast2("hixxhi"));
    }

    @Test
    public void Test2() {
        Assert.assertEquals("Result not as expected", 1, cl2.countLast2("xaxxaxaxx"));
    }

    @Test
    public void Test3() {
        Assert.assertEquals("Result not as expected", 2, cl2.countLast2("axxxaaxx"));
    }

    @Test
    public void Test4() {
        Assert.assertEquals("Result not as expected", 5, cl2.countLast2("axxxxxxaaxx"));
    }

    @Test
    public void Test5() {
        Assert.assertEquals("Result not as expected", 0, cl2.countLast2("axxxa  "));
    }

    @Test
    public void Test6() {
        Assert.assertEquals("Result not as expected", 2, cl2.countLast2("   xxxxaa  "));
    }

    @Test
    public void Test7() {
        Assert.assertEquals("Result not as expected", 0, cl2.countLast2(""));
    }

    @Test
    public void Test8() {
        Assert.assertEquals("Result not as expected", 6, cl2.countLast2("a a a a a a a "));
    }
}
