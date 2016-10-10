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
public class Count9Test {

    Count9 c9 = new Count9();

    public Count9Test() {
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
        int[] arr = {1, 2, 9};
        Assert.assertEquals("Result not as expected", 1, c9.count9(arr));
    }

    @Test
    public void Test2() {
        int[] arr = {1, 9, 9};
        Assert.assertEquals("Result not as expected", 2, c9.count9(arr));
    }

    @Test
    public void Test3() {
        int[] arr = {1, 9, 9, 3, 9};
        Assert.assertEquals("Result not as expected", 3, c9.count9(arr));
    }

    @Test
    public void Test4() {
        int[] arr = {1, 2, 9, 8, 8, 8, 8, 8, 8};
        Assert.assertEquals("Result not as expected", 1, c9.count9(arr));
    }

    @Test
    public void Test5() {
        int[] arr = {9};
        Assert.assertEquals("Result not as expected", 1, c9.count9(arr));
    }

    @Test
    public void Test6() {
        int[] arr = {0, 9, 9, 9, 9, 9, 9, 9, 0};
        Assert.assertEquals("Result not as expected", 7, c9.count9(arr));
    }

    @Test
    public void Test7() {
        int[] arr = {0, 0, 0, 0, 9};
        Assert.assertEquals("Result not as expected", 1, c9.count9(arr));
    }
    @Test
    public void Test8() {
        int[] arr = {0, 0, 0, 0, 8};
        Assert.assertEquals("Result not as expected", 0, c9.count9(arr));
    }
    @Test
    public void Test9() {
        int[] arr = {0};
        Assert.assertEquals("Result not as expected", 0, c9.count9(arr));
    }
    @Test
    public void Test10() {
        int[] arr = {};
        Assert.assertEquals("Result not as expected", 0, c9.count9(arr));
    }
}
