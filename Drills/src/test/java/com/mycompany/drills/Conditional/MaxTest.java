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
public class MaxTest {

    Max max = new Max();

    public MaxTest() {
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
    //
    @Test
    public void Test1() {
        Assert.assertEquals("Results not as expected", 3, max.max(1, 2, 3));
    }
    @Test
    public void Test2() {
        Assert.assertEquals("Results not as expected", 3, max.max(1, 3, 2));
    }
    @Test
    public void Test3() {
        Assert.assertEquals("Results not as expected", 3, max.max(3, 2, 1));
    }
    @Test
    public void Test4() {
        Assert.assertEquals("Results not as expected", 10, max.max(1, 2, 10));
    }
    @Test
    public void Test5() {
        Assert.assertEquals("Results not as expected", 10, max.max(1, 10, 2));
    }
    @Test
    public void Test6() {
        Assert.assertEquals("Results not as expected", 10, max.max(10, 2, 1));
    }
    @Test
    public void Test7() {
        Assert.assertEquals("Results not as expected", 1, max.max(0, 0, 1));
    }
    @Test
    public void Test8() {
        Assert.assertEquals("Results not as expected", 1, max.max(1,0,0));
    }
    @Test
    public void Test9() {
        Assert.assertEquals("Results not as expected", 1, max.max(0, 1, 0));
    }
    @Test
    public void Test10() {
        Assert.assertEquals("Results not as expected", 0, max.max(0, 0, 0));
    }
    @Test
    public void Test11() {
        Assert.assertEquals("Results not as expected", 0, max.max(0, -1, 0));
    }
    @Test
    public void Test12() {
        Assert.assertEquals("Results not as expected", -1, max.max(-2, -1, -2));
    }
}
