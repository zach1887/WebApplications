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
public class ArrayFront9Test {
    ArrayFront9 af9 = new ArrayFront9();
    
    public ArrayFront9Test() {
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
         int [] arr = {1, 2, 9, 3, 4};
     Assert.assertTrue("Result not as expected", af9.arrayFront9(arr));
     }
     @Test
     public void Test2() {
         int [] arr = {1, 2, 3, 4, 9};
     Assert.assertFalse("Result not as expected", af9.arrayFront9(arr));
     }
     @Test
     public void Test3() {
         int [] arr = {1, 2, 3, 4, 5};
     Assert.assertFalse("Result not as expected", af9.arrayFront9(arr));
     }
     @Test
     public void Test4() {
         int [] arr = {9, 9, 9, 9};
     Assert.assertTrue("Result not as expected", af9.arrayFront9(arr));
     }
     @Test
     public void Test5() {
         int [] arr = {};
     Assert.assertFalse("Result not as expected", af9.arrayFront9(arr));
     }
     @Test
     public void Test6() {
         int [] arr = {0, 0, 0, 0, 9, 9, 9, 9 , 9, 9, 9};
     Assert.assertFalse("Result not as expected", af9.arrayFront9(arr));
     }
     @Test
     public void Test7() {
         int [] arr = {9};
     Assert.assertTrue("Result not as expected", af9.arrayFront9(arr));
     }
     @Test
     public void Test8() {
         int [] arr = {0, 9};
     Assert.assertTrue("Result not as expected", af9.arrayFront9(arr));
     }
     @Test
     public void Test9() {
         int [] arr = {0, 0, 9};
     Assert.assertTrue("Result not as expected", af9.arrayFront9(arr));
     }
     @Test
     public void Test10() {
         int [] arr = {0, 0, 0, 9};
     Assert.assertTrue("Result not as expected", af9.arrayFront9(arr));
     }
}
