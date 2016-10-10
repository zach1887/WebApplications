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
public class SumTest {
    Sum sum = new Sum();
    
    public SumTest() {
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
         int[] arr = {1,2,3};
         Assert.assertEquals(6,sum.sum(arr));

     }
     @Test
     public void Test2() {
         int[] arr = {5,11,2};
         Assert.assertEquals(18,sum.sum(arr));

     }
     @Test
     public void Test3() {
         int[] arr = {7,0,0};
         Assert.assertEquals(7,sum.sum(arr));

     }
     @Test
     public void Test4() {
         int[] arr = {1,0,-1,0,1,0,-1,0,1,0,-1};
         Assert.assertEquals(0,sum.sum(arr));

     }
     @Test
     public void Test5() {
         int[] arr = {0,0,0,0,0,5,0,0,0,0,0};
         Assert.assertEquals(5,sum.sum(arr));

     }
     @Test
     public void Test6() {
         int[] arr = {-14,-10,6,16};
         Assert.assertEquals(-2,sum.sum(arr));

     }
     @Test
     public void Test7() {
         int[] arr = {-234,-1,-1,-1};
         Assert.assertEquals(-237,sum.sum(arr));

     }
}

//
//sum({1, 2, 3}) -> 6
//sum({5, 11, 2}) -> 18
//sum({7, 0, 0}) -> 7
//
