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
public class Make2Test {

    Make2 m2 = new Make2();

    public Make2Test() {
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
        int[] arr1 = {4, 5};
        int[] arr2 = {};
        int[] arr3 = {0};
        int[] arr4 = {0, 1};
        int[] arr5 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] arr6 = {2, 3, 2, 2};
        int[] arr7 = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        Assert.assertArrayEquals(arr1, m2.make2(arr1, arr2));
        Assert.assertArrayEquals(arr1, m2.make2(arr1, arr3));
        Assert.assertArrayEquals(arr1, m2.make2(arr1, arr4));
        Assert.assertArrayEquals(arr1, m2.make2(arr1, arr5));
        Assert.assertArrayEquals(arr1, m2.make2(arr1, arr6));
        Assert.assertArrayEquals(arr1, m2.make2(arr1, arr7));
    }

    @Test
    public void Test2() {
        int[] arr1 = {4};
        int[] arr2 = {4};
        int[] ans1 = {4, 4};
        int[] arr3 = {0};
        int[] arr4 = {0, 1};
        int[] ans2 = {4, 0};
        int[] arr5 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] arr6 = {1, 3, 2, 2};
        int[] arr7 = {1, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] ans3 = {4, 1};

        Assert.assertArrayEquals(ans1, m2.make2(arr1, arr2));
        Assert.assertArrayEquals(ans2, m2.make2(arr1, arr3));
        Assert.assertArrayEquals(ans2, m2.make2(arr1, arr4));
        Assert.assertArrayEquals(ans3, m2.make2(arr1, arr5));
        Assert.assertArrayEquals(ans3, m2.make2(arr1, arr6));
        Assert.assertArrayEquals(ans3, m2.make2(arr1, arr7));
    }

    @Test
    public void Test3() {
        int[] arr1 = {};
        int[] arr2 = {0, 0};
        int[] arr3 = {0, 1};
        int[] arr4 = {2, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] arr5 = {2, 3, 2, 2};
        int[] arr6 = {2, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] ans = {2, 3};
        int[] arr7 = {99, -99, 0, 0, 0, 0, 0, 0, 0};
        int[] ans2 = {99, -99};

        Assert.assertArrayEquals(arr2, m2.make2(arr1, arr2));
        Assert.assertArrayEquals(arr3, m2.make2(arr1, arr3));
        Assert.assertArrayEquals(ans, m2.make2(arr1, arr4));
        Assert.assertArrayEquals(ans, m2.make2(arr1, arr5));
        Assert.assertArrayEquals(ans, m2.make2(arr1, arr6));
        Assert.assertArrayEquals(ans2, m2.make2(arr1, arr7));
    }
}
