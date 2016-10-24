/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Arrays;

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
public class HasEvenTest {

    HasEven haseven = new HasEven();

    public HasEvenTest() {
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
        int[] arr1 = {2, 5};
        int[] arr2 = {2, 55};
        int[] arr3 = {2, 555};
        int[] arr4 = {2, 55, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        int[] arr5 = {2, 25604245};

        Assert.assertTrue("Result not as expected", haseven.hasEven(arr1));
        Assert.assertTrue("Result not as expected", haseven.hasEven(arr2));
        Assert.assertTrue("Result not as expected", haseven.hasEven(arr3));
        Assert.assertTrue("Result not as expected", haseven.hasEven(arr4));
        Assert.assertTrue("Result not as expected", haseven.hasEven(arr5));
    }

    @Test
    public void Test2() {
        int[] arr1 = {4, 3};
        int[] arr2 = {4, 0};
        int[] arr3 = {4};
        int[] arr4 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4};
        int[] arr5 = {1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1};

        Assert.assertTrue("Result not as expected", haseven.hasEven(arr1));
        Assert.assertTrue("Result not as expected", haseven.hasEven(arr2));
        Assert.assertTrue("Result not as expected", haseven.hasEven(arr3));
        Assert.assertTrue("Result not as expected", haseven.hasEven(arr4));
        Assert.assertTrue("Result not as expected", haseven.hasEven(arr5));
    }

    @Test
    public void Test3() {
        int[] arr1 = {-4, 3};
        int[] arr2 = {-4, 0};
        int[] arr3 = {-4};
        int[] arr4 = {1, 1, 1, 1, 1, 1, -1, -1, -1, -1, -4};
        int[] arr5 = {1, 1, 1, 1, 1, -4, 1, 1, 1, 1, 1};

        Assert.assertTrue("Result not as expected", haseven.hasEven(arr1));
        Assert.assertTrue("Result not as expected", haseven.hasEven(arr2));
        Assert.assertTrue("Result not as expected", haseven.hasEven(arr3));
        Assert.assertTrue("Result not as expected", haseven.hasEven(arr4));
        Assert.assertTrue("Result not as expected", haseven.hasEven(arr5));
    }

    @Test
    public void Test4() {
        int[] arr1 = {7, 5};
        int[] arr2 = {-7, -5};
        int[] arr3 = {1};
        int[] arr4 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -47};
        int[] arr5 = {1, 1, 1, 1, 1, -43, -1, -1, -1, -1, -1};

        Assert.assertFalse("Result not as expected", haseven.hasEven(arr1));
        Assert.assertFalse("Result not as expected", haseven.hasEven(arr2));
        Assert.assertFalse("Result not as expected", haseven.hasEven(arr3));
        Assert.assertFalse("Result not as expected", haseven.hasEven(arr4));
        Assert.assertFalse("Result not as expected", haseven.hasEven(arr5));
    }
}
