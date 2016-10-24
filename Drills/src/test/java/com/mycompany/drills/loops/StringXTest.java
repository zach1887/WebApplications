/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.loops;

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
public class StringXTest {

    StringX stX = new StringX();

    public StringXTest() {
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
        Assert.assertEquals("Result not as expected", "xHix", stX.stringX("xxHxix"));
        Assert.assertEquals("Result not as expected", "xHix", stX.stringX("xxHxixxxxxxxxxx"));
        Assert.assertEquals("Result not as expected", "xHix", stX.stringX("xxxxxxxxHxix"));
        Assert.assertEquals("Result not as expected", "xHix", stX.stringX("xxHxxxxxxxxxix"));
        Assert.assertEquals("Result not as expected", "xHix", stX.stringX("xxHixx"));
        Assert.assertEquals("Result not as expected", "xHix", stX.stringX("xxxxxxxHixx"));
    }

    @Test
    public void Test2() {
        Assert.assertEquals("Result not as expected", "abcd", stX.stringX("abxxxcd"));
        Assert.assertEquals("Result not as expected", "abcd", stX.stringX("axxxxxxxbxxxcd"));
        Assert.assertEquals("Result not as expected", "abcd", stX.stringX("axbxxxcxd"));
        Assert.assertEquals("Result not as expected", "abcd", stX.stringX("abxxcd"));
        Assert.assertEquals("Result not as expected", "abcd", stX.stringX("axxbxxxcxxd"));
        Assert.assertEquals("Result not as expected", "abcd", stX.stringX("abcd"));
    }

    @Test
    public void Test3() {
        Assert.assertEquals("Result not as expected", "xabcdx", stX.stringX("xabxxxxcdx"));
        Assert.assertEquals("Result not as expected", "xabcdx", stX.stringX("xabxxxxcdxxxxxxxxxxx"));
        Assert.assertEquals("Result not as expected", "xabcdx", stX.stringX("xxxxxxabxxxxcdx"));
        Assert.assertEquals("Result not as expected", "xabcdx", stX.stringX("xabcdx"));
        Assert.assertEquals("Result not as expected", "xabcdx", stX.stringX("xabxxxxxxcxdxxx"));
        Assert.assertEquals("Result not as expected", "xabcdx", stX.stringX("xabxxxxxxcdxxx"));

    }

    @Test
    public void Test4() {
        Assert.assertEquals("Result not as expected", "xx", stX.stringX("xx"));
        Assert.assertEquals("Result not as expected", "x x", stX.stringX("x x"));
        Assert.assertEquals("Result not as expected", "x", stX.stringX("x"));
        Assert.assertEquals("Result not as expected", "", stX.stringX(""));
        Assert.assertEquals("Result not as expected", "1", stX.stringX("1"));
        Assert.assertEquals("Result not as expected", "x     x", stX.stringX("x     x"));
        Assert.assertEquals("Result not as expected", "  ", stX.stringX(" xxxxx "));
    }

}
