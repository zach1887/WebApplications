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
public class CommonEndTest {
    CommonEnd cend = new CommonEnd();
    public CommonEndTest() {
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
         int [] arr1 = {1,2,3};
         int [] arr2 = {7,3};
         
         Assert.assertTrue("Result not as expected",cend.commonEnd(arr1, arr2));
     }

     @Test
     public void Test2() {
         int [] arr1 = {1,2,3};
         int [] arr2 = {7,3,2};
         
         Assert.assertFalse("Result not as expected",cend.commonEnd(arr1, arr2));
     }

     @Test
     public void Test3() {
         int [] arr1 = {1,2,3};
         int [] arr2 = {1,3};
         
         Assert.assertTrue("Result not as expected",cend.commonEnd(arr1, arr2));
     }

     @Test
     public void Test4() {
         int [] arr1 = {2,2,2,2,2,2,2,2,2,2,2};
         int [] arr2 = {0,2,2,2,2,2,2,2,2,2,0};
         
         Assert.assertFalse("Result not as expected",cend.commonEnd(arr1, arr2));
     }

     @Test
     public void Test5() {
         int [] arr1 = {};
         int [] arr2 = {1,1,1,2};
         
         Assert.assertFalse("Result not as expected",cend.commonEnd(arr1, arr2));
     }
     @Test
     public void Test6() {
         int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
         int [] arr2 = {10};
         
         Assert.assertTrue("Result not as expected",cend.commonEnd(arr1, arr2));
     }
}
