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
public class RotateLeftTest {

    RotateLeft rl = new RotateLeft();

    public RotateLeftTest() {
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
        int[] arr2 = {2, 3, 1};
        int[] arr3 = {3, 1, 2};
        Assert.assertArrayEquals(arr2, rl.rotateLeft(arr1));
        Assert.assertArrayEquals(arr3, rl.rotateLeft(arr2));
        Assert.assertArrayEquals(arr1, rl.rotateLeft(arr3));
    }

    @Test
    public void Test2() {
        int[] arr1 = {5, 11, 9};
        int[] arr2 = {11, 9, 5};
        int[] arr3 = {9, 5, 11};
        Assert.assertArrayEquals(arr2, rl.rotateLeft(arr1));
        Assert.assertArrayEquals(arr3, rl.rotateLeft(arr2));
        Assert.assertArrayEquals(arr1, rl.rotateLeft(arr3));
    }

    @Test
    public void Test3() {
        int[] arr1 = {7, 0, 0};
        int[] arr2 = {0, 0, 7};
        int[] arr3 = {0, 7, 0};
        Assert.assertArrayEquals(arr2, rl.rotateLeft(arr1));
        Assert.assertArrayEquals(arr3, rl.rotateLeft(arr2));
        Assert.assertArrayEquals(arr1, rl.rotateLeft(arr3));
    }

    @Test
    public void Test4() {
        int[] arr1 = {7, 7, 7, 7, 7, 7, 7};
        int[] arr2 = {0};
        int[] arr3 = {1, 1, 1, 1, 1};
        Assert.assertArrayEquals(arr1, rl.rotateLeft(arr1));
        Assert.assertArrayEquals(arr2, rl.rotateLeft(arr2));
        Assert.assertArrayEquals(arr3, rl.rotateLeft(arr3));
    }

    @Test
    public void Test5() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr4 = {2, 3, 4, 5, 1};
        int[] arr5 = {2, 3, 4, 5, 6, 1};
        int[] arr6 = {2, 3, 4, 5, 6, 7, 1};
        Assert.assertArrayEquals(arr4, rl.rotateLeft(arr1));
        Assert.assertArrayEquals(arr5, rl.rotateLeft(arr2));
        Assert.assertArrayEquals(arr6, rl.rotateLeft(arr3));
    }
}
