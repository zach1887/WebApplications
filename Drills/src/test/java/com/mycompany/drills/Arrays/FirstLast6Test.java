/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Arrays;

import com.mycompany.drills.Arrays.FirstLast6;
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
public class FirstLast6Test {

    FirstLast6 fl = new FirstLast6();

    public FirstLast6Test() {
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

    @Test
    public void Test1() {
        int [] arr1 = {1,2,6};
        Assert.assertTrue("Test did not return true.", fl.firstLast6(arr1));
    }
    @Test
    public void Test2() {
        int [] arr2 = {6,1,2,3};
        Assert.assertTrue("Test did not return true.", fl.firstLast6(arr2));
    }
    @Test
    public void Test3() {
        int [] arr3 = {13,6,1,2,3};
        Assert.assertFalse("Test did not return false.", fl.firstLast6(arr3));
    }
    @Test
    public void Test4() {
        int [] arr4 = {13,6,6,6,6,6,6,6,6,0};
        Assert.assertFalse("Test did not return false.", fl.firstLast6(arr4));
    }
    @Test
    public void Test5() {
        int [] arr5 = {0,0,0,0,0,0,0,0,6,0};
        Assert.assertFalse("Test did not return false.", fl.firstLast6(arr5));
    }
    @Test
    public void Test6() {
        int [] arr6 = {0,0,0,0,0,0,0,0,6,0};
        Assert.assertFalse("Test did not return false.", fl.firstLast6(arr6));
    }
    @Test
    public void Test7() {
        int [] arr7 = {0,0,0,0,0,0,0,0,0,6};
        Assert.assertTrue("Test did not return true.", fl.firstLast6(arr7));
    }
    @Test
    public void Test8() {
        int [] arr8 = {6,0,0,0,0,0,0,0,0,0};
        Assert.assertTrue("Test did not return true.", fl.firstLast6(arr8));
    }
    @Test
    public void Test9() {
        int [] arr9 = {6};
        Assert.assertTrue("Test did not return true.", fl.firstLast6(arr9));
    }
    @Test
    public void Test10() {
        int [] arr10 = {0};
        Assert.assertFalse("Test did not return false.", fl.firstLast6(arr10));
    }
}

