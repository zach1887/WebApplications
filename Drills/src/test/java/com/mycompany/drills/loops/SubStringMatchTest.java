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
public class SubStringMatchTest {

    SubStringMatch ssm = new SubStringMatch();

    public SubStringMatchTest() {
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
        Assert.assertEquals("Result not as expected", 3, ssm.subStringMatch("xxcaazz", "xxbaaz"));
        Assert.assertEquals("Result not as expected", 4, ssm.subStringMatch("xxcaazz", "xxbaazz"));
        Assert.assertEquals("Result not as expected", 6, ssm.subStringMatch("xxcaazz12", "xxbaazz12"));
        Assert.assertEquals("Result not as expected", 6, ssm.subStringMatch("xxcaazz12yy", "xxbaazz12zz"));
        Assert.assertEquals("Result not as expected", 8, ssm.subStringMatch("11xxcaazz12yy", "11xxbaazz12zz"));
    }

    @Test
    public void Test2() {
        Assert.assertEquals("Result not as expected", 2, ssm.subStringMatch("abc", "abc"));
        Assert.assertEquals("Result not as expected", 2, ssm.subStringMatch("abc", "abcdefghijklmnopqrstuvwxyz"));
        Assert.assertEquals("Result not as expected", 2, ssm.subStringMatch("abcdefghijklmnopqrstuvwxyz", "abc"));
        Assert.assertEquals("Result not as expected",
                25, ssm.subStringMatch("abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void Test3() {
        Assert.assertEquals("Result not as expected", 0, ssm.subStringMatch("abc", "axc"));
        Assert.assertEquals("Result not as expected", 0, ssm.subStringMatch("abcdefg", "axcxexg"));
        Assert.assertEquals("Result not as expected", 0, ssm.subStringMatch("abcdefg", ""));
        Assert.assertEquals("Result not as expected", 0, ssm.subStringMatch("","abcdefg"));
        Assert.assertEquals("Result not as expected", 0, ssm.subStringMatch("", ""));
        Assert.assertEquals("Result not as expected", 0, ssm.subStringMatch("1","1"));
    }
}
