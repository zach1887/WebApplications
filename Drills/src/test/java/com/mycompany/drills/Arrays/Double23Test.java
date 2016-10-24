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
public class Double23Test {
    Double23 d23 = new Double23();
    public Double23Test() {
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
     int [] arr = {2, 2, 3};
     Assert.assertTrue("Result not as expected",d23.double23(arr));
     }
     @Test
     public void Test2() {
     int [] arr = {3, 4, 5, 3};
     Assert.assertTrue("Result not as expected",d23.double23(arr));
     }
     @Test
     public void Test3() {
     int [] arr = {2, 3, 2, 2};
     Assert.assertFalse("Result not as expected",d23.double23(arr));
     }
     @Test
     public void Test4() {
     int [] arr = {2, 2, 3, 3};
     Assert.assertTrue("Result not as expected",d23.double23(arr));
     }
     @Test
     public void Test5() {
     int [] arr = {3, 4, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
     Assert.assertTrue("Result not as expected",d23.double23(arr));
     }
     @Test
     public void Test6() {
     int [] arr = {2, 3, 2, 2, 3, 3, 3, 0};
     Assert.assertFalse("Result not as expected",d23.double23(arr));
     }
     @Test
     public void Test7() {
     int [] arr = {2, 3};
     Assert.assertFalse("Result not as expected",d23.double23(arr));
     }
     @Test
     public void Test8() {
     int [] arr = {2};
     Assert.assertFalse("Result not as expected",d23.double23(arr));
     }
     @Test
     public void Test9() {
     int [] arr = {};
     Assert.assertFalse("Result not as expected",d23.double23(arr));
     }
     @Test
     public void Test10() {
     int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     Assert.assertFalse("Result not as expected",d23.double23(arr));
     }
}
