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
public class Pattern51Test {

    Pattern51 p51 = new Pattern51();

    public Pattern51Test() {
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
        int[] arr1 = {1, 2, 7, 1};
        int[] arr2 = {1, 2, 8, 1};
        int[] arr3 = {2, 7, 1};

        Assert.assertTrue("Result not as expected", p51.pattern51(arr1));
        Assert.assertFalse("Result not as expected", p51.pattern51(arr2));
        Assert.assertTrue("Result not as expected", p51.pattern51(arr3));
    }

    @Test
    public void Test2() {
        int[] arr1 = {1, 2, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] arr2 = {1, 2, 8, 1, 0, 0, 0, 0, 0, 0, 0};
        int[] arr3 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 7, 1};

        Assert.assertTrue("Result not as expected", p51.pattern51(arr1));
        Assert.assertFalse("Result not as expected", p51.pattern51(arr2));
        Assert.assertTrue("Result not as expected", p51.pattern51(arr3));
    }
    @Test
    public void Test3() {
        int[] arr1 = {1, 2, 7, 1};
        int[] arr2 = {2, 3, 8, 2};
        int[] arr3 = {11, 12, 17, 11};
        int[] arr4 = {9999, 23, 28, 22};
        int[] arr5 = {100, 62, 67, 61};
        int[] arr6 = {0, -3, 2, -4};
        int[] arr7 = {1, 2001, 2006, 2000};


        Assert.assertTrue("Result not as expected", p51.pattern51(arr1));
        Assert.assertTrue("Result not as expected", p51.pattern51(arr2));
        Assert.assertTrue("Result not as expected", p51.pattern51(arr3));
        Assert.assertTrue("Result not as expected", p51.pattern51(arr4));
        Assert.assertTrue("Result not as expected", p51.pattern51(arr5));
        Assert.assertTrue("Result not as expected", p51.pattern51(arr6));
        Assert.assertTrue("Result not as expected", p51.pattern51(arr7));
    }
}
