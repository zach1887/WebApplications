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
public class ReverseTest {

    Reverse rev = new Reverse();

    public ReverseTest() {
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
        int[] arr2 = {3, 2, 1};

        Assert.assertArrayEquals(arr1, rev.reverse(arr2));
        Assert.assertArrayEquals(arr2, rev.reverse(arr1));
        Assert.assertArrayEquals(arr1, rev.reverse(rev.reverse(arr1)));
        Assert.assertArrayEquals(arr2, rev.reverse(rev.reverse(arr2)));
    }

    @Test
    public void Test2() {
        int[] arr1 = {1, 1, 1};
        int[] arr2 = {1, 2, 1};
        int[] arr3 = {1, 0, 1};
        int[] arr4 = {1, -13, 1};
        int[] arr5 = {13, -13, 13};
        int[] arr6 = {196, -133, 196};

        Assert.assertArrayEquals(arr1, rev.reverse(arr1));
        Assert.assertArrayEquals(arr2, rev.reverse(arr2));
        Assert.assertArrayEquals(arr3, rev.reverse(arr3));
        Assert.assertArrayEquals(arr4, rev.reverse(arr4));
        Assert.assertArrayEquals(arr5, rev.reverse(arr5));
        Assert.assertArrayEquals(arr6, rev.reverse(arr6));
    }

    @Test
    public void Test3() {
        int[] arr1 = {1, 2, 2};
        int[] arr2 = {2, 2, 1};
        Assert.assertArrayEquals(arr1, rev.reverse(arr2));
        Assert.assertArrayEquals(arr2, rev.reverse(arr1));
        Assert.assertArrayEquals(arr1, rev.reverse(rev.reverse(arr1)));
        Assert.assertArrayEquals(arr2, rev.reverse(rev.reverse(arr2)));
    }
}
