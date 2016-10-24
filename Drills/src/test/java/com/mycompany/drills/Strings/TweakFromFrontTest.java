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
public class TweakFromFrontTest {

    TweakFromFront tft = new TweakFromFront();

    public TweakFromFrontTest() {
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
        Assert.assertEquals("Result not as expected", "llo", tft.tweakFront("Hello"));
        Assert.assertEquals("Result not as expected", "llo", tft.tweakFront("  llo"));
        Assert.assertEquals("Result not as expected", "llo", tft.tweakFront("12llo"));
        Assert.assertEquals("Result not as expected", "llo123", tft.tweakFront("Hello123"));
        Assert.assertEquals("Result not as expected", "llo12345", tft.tweakFront("Hello12345"));
    }

    @Test
    public void Test2() {
        Assert.assertEquals("Result not as expected", "aay", tft.tweakFront("away"));
        Assert.assertEquals("Result not as expected", "aay", tft.tweakFront("a ay"));
        Assert.assertEquals("Result not as expected", "aay", tft.tweakFront("aaay"));
        Assert.assertEquals("Result not as expected", "aay", tft.tweakFront("a$ay"));
        Assert.assertEquals("Result not as expected", "ay", tft.tweakFront("aay"));
        Assert.assertEquals("Result not as expected", "ayxxx", tft.tweakFront("aayxxx"));
        Assert.assertEquals("Result not as expected", "by", tft.tweakFront(" by"));
        Assert.assertEquals("Result not as expected", "by", tft.tweakFront("Xby"));
        Assert.assertEquals("Result not as expected", "by", tft.tweakFront("X by"));
        Assert.assertEquals("Result not as expected", " by", tft.tweakFront("X  by"));
    }

    @Test
    public void Test3() {
        Assert.assertEquals("Result not as expected", "abed", tft.tweakFront("abed"));
        Assert.assertEquals("Result not as expected", "abedfg", tft.tweakFront("abedfg"));
        Assert.assertEquals("Result not as expected", "abedth", tft.tweakFront("abedth"));
        Assert.assertEquals("Result not as expected", "abed  fff", tft.tweakFront("abed  fff"));
        Assert.assertEquals("Result not as expected", "abed123456", tft.tweakFront("abed123456"));
    }
}
