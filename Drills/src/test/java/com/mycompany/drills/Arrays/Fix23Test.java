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
public class Fix23Test {
    Fix23 f23 = new Fix23();
    public Fix23Test() {
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
     int[] arr1 = {1, 2, 3};
     int[] arr2 = {1, 2, 0};
     Assert.assertArrayEquals("Result not as expected", arr2,f23.fix23(arr1));
     }
     @Test
     public void Test2() {
     int[] arr1 = {2, 3, 5};
     int[] arr2 = {2, 0, 5};
     Assert.assertArrayEquals("Result not as expected", arr2,f23.fix23(arr1));
     }
     @Test
     public void Test3() {
     int[] arr1 = {1, 2, 1};
     Assert.assertArrayEquals("Result not as expected", arr1,f23.fix23(arr1));
     }
     @Test
     public void Test4() {
     int[] arr1 = {2, 5, 3};
     Assert.assertArrayEquals("Result not as expected", arr1,f23.fix23(arr1));
     }
     @Test
     public void Test5() {
     int[] arr1 = {1, 2, 3, 4};
     int[] arr2 = {1, 2, 3, 4};
     Assert.assertArrayEquals("Result not as expected", arr2,f23.fix23(arr1));
     }
     @Test
     public void Test6() {
     int[] arr1 = {2, 3, 3};
     int[] arr2 = {2, 0, 3};
     Assert.assertArrayEquals("Result not as expected", arr2,f23.fix23(arr1));
     }
}
