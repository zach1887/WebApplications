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
public class NoTriplesTest {
    NoTriples notrip = new NoTriples();
    public NoTriplesTest() {
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
      int[] arr1 = {1, 1, 2, 2, 1};
      int[] arr2 = {1, 1, 2, 2, 2, 1};
      int[] arr3 = {1, 1, 1, 2, 2, 2, 1};
     Assert.assertTrue("Result not as expected", notrip.noTriples(arr1));
     Assert.assertFalse("Result not as expected", notrip.noTriples(arr2));
     Assert.assertFalse("Result not as expected", notrip.noTriples(arr3));
     }
     @Test
     public void Test2() {
      int[] arr1 = {1, 1, 1};
      int[] arr2 = {0, 1, 0, 2, 0, 1};
      int[] arr3 = {0, 0, 2, 2, 3, 4, 5, 6, 7, 8, 8, 7, 7, 6, 6, 6};
     Assert.assertFalse("Result not as expected", notrip.noTriples(arr1));
     Assert.assertTrue("Result not as expected", notrip.noTriples(arr2));
     Assert.assertFalse("Result not as expected", notrip.noTriples(arr3));
     }
     @Test
     public void Test3() {
      int[] arr1 = {3, 4, 5, 6, 6, 7, 8, 8, 8, 8, 8};
      int[] arr2 = {1};
      int[] arr3 = {1, 3};
     Assert.assertFalse("Result not as expected", notrip.noTriples(arr1));
     Assert.assertTrue("Result not as expected", notrip.noTriples(arr2));
     Assert.assertTrue("Result not as expected", notrip.noTriples(arr3));
     }
}
