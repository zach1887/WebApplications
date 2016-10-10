/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.loops;

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
public class Array123Test {
    Array123 arr123 = new Array123();
    public Array123Test() {
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
         int [] arr = {1, 1, 2, 3, 1};
         Assert.assertTrue("Result not as expected", arr123.array123(arr));
 
     }
     @Test
     public void Test2() {
         int [] arr = {1, 1, 2, 4, 1};
         Assert.assertFalse("Result not as expected", arr123.array123(arr));
 
     }
     @Test
     public void Test3() {
         int [] arr = {1, 1, 2, 1, 2, 3};
         Assert.assertTrue("Result not as expected", arr123.array123(arr));
 
     }
     @Test
     public void Test4() {
         int [] arr = { 1, 2, 3};
         Assert.assertTrue("Result not as expected", arr123.array123(arr));
 
     }
     @Test
     public void Test5() {
         int [] arr = {1, 2};
         Assert.assertFalse("Result not as expected", arr123.array123(arr));
 
     }
     @Test
     public void Test6() {
         int [] arr = {1, 2, 1, 2, 1, 2, 1, 3};
         Assert.assertFalse("Result not as expected", arr123.array123(arr));
 
     }
     @Test
     public void Test7() {
         int [] arr = {0, 0, 0, 0, 0, 1, 2, 3, 0, 99999};
         Assert.assertTrue("Result not as expected", arr123.array123(arr));
 
     }
     @Test
     public void Test8() {
         int [] arr = {1, 0, 2, 0, 3};
         Assert.assertFalse("Result not as expected", arr123.array123(arr));
 
     }
}
