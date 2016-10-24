/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.loops;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jesse
 */
public class Array667Test {
    Array667 array = new Array667();
    
    public Array667Test() {
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
      int [] arr1 = {6, 6, 2};
      int [] arr2 = {6, 6, 2, 6};
      int [] arr3 = {6, 7, 2, 6};
      int [] arr4 = {6, 7, 2, 6, 7};
  
     Assert.assertEquals("Result not as expected",1, array.array667(arr1));
     Assert.assertEquals("Result not as expected",1, array.array667(arr2));
     Assert.assertEquals("Result not as expected",1, array.array667(arr3));
     Assert.assertEquals("Result not as expected",2, array.array667(arr4));
     }
     @Test
     public void Test2() {
      int [] arr1 = {6, 0, 2};
      int [] arr2 = {6, 0, 2, 6};
      int [] arr3 = {6, 0, 2, 6};
      int [] arr4 = {6, 0, 2, 0, 7};
  
     Assert.assertEquals("Result not as expected",0, array.array667(arr1));
     Assert.assertEquals("Result not as expected",0, array.array667(arr2));
     Assert.assertEquals("Result not as expected",0, array.array667(arr3));
     Assert.assertEquals("Result not as expected",0, array.array667(arr4));
     }
     @Test
     public void Test3() {
      int [] arr1 = {6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
      int [] arr2 = {6, 6, 2, 6, 6, 6, 7};
      int [] arr3 = {6, 7, 2, 6, 7};
      int [] arr4 = {6, 7, 2, 6, 7, 6, 6, 6, 6, 6};
  
     Assert.assertEquals("Result not as expected",9, array.array667(arr1));
     Assert.assertEquals("Result not as expected",4, array.array667(arr2));
     Assert.assertEquals("Result not as expected",2, array.array667(arr3));
     Assert.assertEquals("Result not as expected",6, array.array667(arr4));
     }
}
