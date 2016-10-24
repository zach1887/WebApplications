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
public class RotateRight2Test {

    RotateRight2 rr2 = new RotateRight2();

    public RotateRight2Test() {
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
        Assert.assertEquals("Result not as expected", "loHel", rr2.rotateRight2("Hello"));
        Assert.assertEquals("Result not as expected", "  Hello", rr2.rotateRight2("Hello  "));
        Assert.assertEquals("Result not as expected", "lo  Hel", rr2.rotateRight2("  Hello"));
    }

    @Test
    public void Test2() {
        Assert.assertEquals("Result not as expected", "vaja", rr2.rotateRight2("java"));
        Assert.assertEquals("Result not as expected", "a  jav", rr2.rotateRight2(" java "));
        Assert.assertEquals("Result not as expected", "vaxja", rr2.rotateRight2("xjava"));
        Assert.assertEquals("Result not as expected", "axjav", rr2.rotateRight2("javax"));
        Assert.assertEquals("Result not as expected", "a xjav", rr2.rotateRight2("xjava "));
        Assert.assertEquals("Result not as expected", "ax jav", rr2.rotateRight2(" javax"));
        Assert.assertEquals("Result not as expected", "axxjav", rr2.rotateRight2("xjavax"));
    }

    @Test
    public void Test3() {
        Assert.assertEquals("Result not as expected", "Hi", rr2.rotateRight2("Hi"));
        Assert.assertEquals("Result not as expected", "iiH", rr2.rotateRight2("Hii"));
        Assert.assertEquals("Result not as expected", "iiHi", rr2.rotateRight2("Hiii"));
        Assert.assertEquals("Result not as expected", "iiHii", rr2.rotateRight2("Hiiii"));
        Assert.assertEquals("Result not as expected", "iiHiii", rr2.rotateRight2("Hiiiii"));
        Assert.assertEquals("Result not as expected", "iiHiiii", rr2.rotateRight2("Hiiiiii"));
    }
    @Test
    public void Test4() {
        Assert.assertNull("Result not as expected", rr2.rotateRight2(""));
        Assert.assertNull("Result not as expected", rr2.rotateRight2(" "));
        Assert.assertNull("Result not as expected", rr2.rotateRight2("X"));
        Assert.assertNull("Result not as expected", rr2.rotateRight2("1"));
        Assert.assertNull("Result not as expected", rr2.rotateRight2("c"));
        Assert.assertNull("Result not as expected", rr2.rotateRight2("@"));
    }

}
