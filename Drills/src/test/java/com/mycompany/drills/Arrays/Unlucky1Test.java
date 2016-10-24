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
public class Unlucky1Test {
    Unlucky1 unlck = new Unlucky1();
    public Unlucky1Test() {
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
     int [] arr1 = {1, 3, 4, 5};
     Assert.assertTrue("Result not as expected",unlck.unlucky1(arr1));
     }
     @Test
     public void Test2() {
     int [] arr1 = {2, 1, 3, 4, 5};
     Assert.assertTrue("Result not as expected",unlck.unlucky1(arr1));
     }
     @Test
     public void Test3() {
     int [] arr1 = {1, 1,1};
     Assert.assertFalse("Result not as expected",unlck.unlucky1(arr1));
     }
     @Test
     public void Test4() {
     int [] arr1 = {3, 1, 1, 1};
     Assert.assertFalse("Result not as expected",unlck.unlucky1(arr1));
     }
     @Test
     public void Test5() {
     int [] arr1 = {1, 1, 4, 5, 1, 1, 1, 3, 1, 1, 1};
     Assert.assertFalse("Result not as expected",unlck.unlucky1(arr1));
     }
     @Test
     public void Test6() {
     int [] arr1 = {3, 1, 3, 1};
     Assert.assertTrue("Result not as expected",unlck.unlucky1(arr1));
     }
     @Test
     public void Test7() {
     int [] arr1 = {1, 1, 4, 5, 1, 1, 1, 3};
     Assert.assertTrue("Result not as expected",unlck.unlucky1(arr1));
     }
     @Test
     public void Test8() {
     int [] arr1 = {0, 0, 1, 3};
     Assert.assertTrue("Result not as expected",unlck.unlucky1(arr1));
     }
     @Test
     public void Test9() {
     int [] arr1 = {10};
     Assert.assertFalse("Result not as expected",unlck.unlucky1(arr1));
     }
     @Test
     public void Test10() {
     int [] arr1 = {};
     Assert.assertFalse("Result not as expected",unlck.unlucky1(arr1));
     }
}
