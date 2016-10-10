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
public class HigherWinsTest {
    HigherWins hw = new HigherWins();
    public HigherWinsTest() {
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
       int [] arr1 = {3 ,3 ,3};
       int [] arr2 = {1 ,2, 3};
    
     Assert.assertArrayEquals("Output was not as expected", arr1, hw.higherWins(arr2));
     
     }
     @Test
     public void Test2() {
       int [] arr1 = {11 ,11 ,11};
       int [] arr2 = {11 ,5, 9};
    
     Assert.assertArrayEquals("Output was not as expected", arr1, hw.higherWins(arr2));
     
     }
     @Test
     public void Test3() {
       int [] arr1 = {3 ,3 ,3};
       int [] arr2 = {2 ,11, 3};
    
     Assert.assertArrayEquals("Output was not as expected", arr1, hw.higherWins(arr2));
     
     }
     @Test
     public void Test4() {
       int [] arr1 = {0 ,0 ,0};
       int [] arr2 = {0 ,234, -5};
    
     Assert.assertArrayEquals("Output was not as expected", arr1, hw.higherWins(arr2));
     
     }
     @Test
     public void Test5() {
       int [] arr1 = {10 ,10 ,10};
       int [] arr2 = {10 ,15, 10};
    
     Assert.assertArrayEquals("Output was not as expected", arr1, hw.higherWins(arr2));
     
     }
     }

