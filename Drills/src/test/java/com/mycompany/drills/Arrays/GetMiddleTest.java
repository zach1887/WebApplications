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
public class GetMiddleTest {

    GetMiddle gm = new GetMiddle();

    public GetMiddleTest() {
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
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {0, 2, 0};
        int[] arr3 = {-1111, 2, -3333};
        int[] arr4 = {10000, 2, 30000};
        int[] arr5 = {4, 5, 6};
        int[] arr6 = {400, 5, 600};
        int[] arr7 = {-4004, 5, -600};
        int[] arr8 = {0, 5, 0};
        int[] ans = {2, 5};

        Assert.assertArrayEquals(ans, gm.getMiddle(arr1, arr5));
        Assert.assertArrayEquals(ans, gm.getMiddle(arr1, arr6));
        Assert.assertArrayEquals(ans, gm.getMiddle(arr1, arr7));
        Assert.assertArrayEquals(ans, gm.getMiddle(arr1, arr8));
        Assert.assertArrayEquals(ans, gm.getMiddle(arr2, arr5));
        Assert.assertArrayEquals(ans, gm.getMiddle(arr2, arr6));
        Assert.assertArrayEquals(ans, gm.getMiddle(arr2, arr7));
        Assert.assertArrayEquals(ans, gm.getMiddle(arr2, arr8));
        Assert.assertArrayEquals(ans, gm.getMiddle(arr3, arr5));
        Assert.assertArrayEquals(ans, gm.getMiddle(arr3, arr6));
        Assert.assertArrayEquals(ans, gm.getMiddle(arr3, arr7));
        Assert.assertArrayEquals(ans, gm.getMiddle(arr3, arr8));
        Assert.assertArrayEquals(ans, gm.getMiddle(arr4, arr5));
        Assert.assertArrayEquals(ans, gm.getMiddle(arr4, arr6));
        Assert.assertArrayEquals(ans, gm.getMiddle(arr4, arr7));
        Assert.assertArrayEquals(ans, gm.getMiddle(arr4, arr8));
    }

    @Test
    public void Test2() {
        int[] arr1 = {7, 7, 7};
        int[] arr2 = {3, 8, 0};

        int[] ans = {7, 8};
        int[] ansBack = {8, 7};

        Assert.assertArrayEquals(ans, gm.getMiddle(arr1, arr2));
        Assert.assertArrayEquals(ansBack, gm.getMiddle(arr2, arr1));
    }
    @Test
    public void Test3() {
        int[] arr1 = {5, 2, 9};
        int[] arr2 = {1, 4, 5};

        int[] ans = {2, 4};
        int[] ansBack = {4, 2};

        Assert.assertArrayEquals(ans, gm.getMiddle(arr1, arr2));
        Assert.assertArrayEquals(ansBack, gm.getMiddle(arr2, arr1));
    }

}
