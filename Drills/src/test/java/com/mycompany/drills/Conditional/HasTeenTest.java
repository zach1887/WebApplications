/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Conditional;

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
public class HasTeenTest {
    HasTeen ht = new HasTeen();
    public HasTeenTest() {
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
     Assert.assertTrue("Result not as expected", ht.hasTeen(13, 20, 10));
     Assert.assertTrue("Result not as expected", ht.hasTeen(13, 200, 100));
     Assert.assertTrue("Result not as expected", ht.hasTeen(13, 2000, 1000));
     Assert.assertTrue("Result not as expected", ht.hasTeen(13, -200, -100));
     Assert.assertTrue("Result not as expected", ht.hasTeen(13, -200, -100));
     Assert.assertTrue("Result not as expected", ht.hasTeen(13, 0, 0));
     Assert.assertTrue("Result not as expected", ht.hasTeen(13, 13, 13));
     }
     
     @Test
     public void Test2() {
     Assert.assertTrue("Result not as expected", ht.hasTeen(20, 19, 10));
     Assert.assertTrue("Result not as expected", ht.hasTeen(200, 19, 100));
     Assert.assertTrue("Result not as expected", ht.hasTeen(2000, 19, 1000));
     Assert.assertTrue("Result not as expected", ht.hasTeen(20, 19, -10));
     Assert.assertTrue("Result not as expected", ht.hasTeen(-20, 19, -100));
     Assert.assertTrue("Result not as expected", ht.hasTeen(-20, 19, -1000));
     Assert.assertTrue("Result not as expected", ht.hasTeen(0, 19, 0));
     Assert.assertTrue("Result not as expected", ht.hasTeen(19, 19, 19));
     Assert.assertTrue("Result not as expected", ht.hasTeen(0, 0, 19));
     }
          @Test
     public void Test3() {
     Assert.assertFalse("Result not as expected", ht.hasTeen(20, 10, 12));
     Assert.assertFalse("Result not as expected", ht.hasTeen(20, 20, 20));
     Assert.assertFalse("Result not as expected", ht.hasTeen(10, 10, 10));
     Assert.assertFalse("Result not as expected", ht.hasTeen(12, 12, 12));
     Assert.assertFalse("Result not as expected", ht.hasTeen(0, 0, 0));
     Assert.assertFalse("Result not as expected", ht.hasTeen(20, 30, 40));
     Assert.assertFalse("Result not as expected", ht.hasTeen(-15, -15, -20));
     }
}
