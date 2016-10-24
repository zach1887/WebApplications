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
public class KeepLastTest {

    KeepLast kl = new KeepLast();

    public KeepLastTest() {
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
        int[] arr1 = {4, 5, 6};
        int[] arr2 = {0, 0, 6};
        int[] arr3 = {4, 0, 6};
        int[] arr4 = {0, 5, 6};
        int[] arr5 = {-2, -2, 6};
        int[] arr6 = {999, -999, 6};
        int[] arr7 = {565, 656, 6};
        int[] arr8 = {6, 6, 6};
        int[] ans = {0, 0, 0, 0, 0, 6};
        Assert.assertArrayEquals(ans, kl.keepLast(arr1));
        Assert.assertArrayEquals(ans, kl.keepLast(arr2));
        Assert.assertArrayEquals(ans, kl.keepLast(arr3));
        Assert.assertArrayEquals(ans, kl.keepLast(arr4));
        Assert.assertArrayEquals(ans, kl.keepLast(arr5));
        Assert.assertArrayEquals(ans, kl.keepLast(arr6));
        Assert.assertArrayEquals(ans, kl.keepLast(arr7));
        Assert.assertArrayEquals(ans, kl.keepLast(arr8));
    }

    @Test
    public void Test2() {
        int[] arr1 = {1, 2};
        int[] arr2 = {0, 2};
        int[] arr3 = {-2, 2};
        int[] arr4 = {999, 2};
        int[] arr5 = {-999, 2};
        int[] arr6 = {2, 2};
        int[] arr7 = {-20, 2};
        int[] arr8 = {-2000, 2};
        int[] ans = {0, 0, 0, 2};
        Assert.assertArrayEquals(ans, kl.keepLast(arr1));
        Assert.assertArrayEquals(ans, kl.keepLast(arr2));
        Assert.assertArrayEquals(ans, kl.keepLast(arr3));
        Assert.assertArrayEquals(ans, kl.keepLast(arr4));
        Assert.assertArrayEquals(ans, kl.keepLast(arr5));
        Assert.assertArrayEquals(ans, kl.keepLast(arr6));
        Assert.assertArrayEquals(ans, kl.keepLast(arr7));
        Assert.assertArrayEquals(ans, kl.keepLast(arr8));
    }

    @Test
    public void Test3() {
        int[] arr1 = {3};
        int[] arr2 = {0, 3};
        int[] arr3 = {0};
        int[] arr4 = {0, 0};
        int[] arr5 = {-3};
        int[] arr6 = {0, -3};
        int[] arr7 = {876};
        int[] arr8 = {0, 876};
        int[] arr9 = {3};
        int[] arr10 = {0, 3};
        int[] arr11 = {1, 1, 1, 1, 1};
        int[] arr12 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] arr13 = {1, 1, 1, 1, 1, 1};
        int[] arr14 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        Assert.assertArrayEquals(arr2, kl.keepLast(arr1));
        Assert.assertArrayEquals(arr4, kl.keepLast(arr3));
        Assert.assertArrayEquals(arr6, kl.keepLast(arr5));
        Assert.assertArrayEquals(arr8, kl.keepLast(arr7));
        Assert.assertArrayEquals(arr10, kl.keepLast(arr9));
        Assert.assertArrayEquals(arr12, kl.keepLast(arr11));
        Assert.assertArrayEquals(arr14, kl.keepLast(arr13));
    }
}
