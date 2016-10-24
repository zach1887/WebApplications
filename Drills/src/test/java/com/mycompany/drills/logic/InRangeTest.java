/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.logic;

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
public class InRangeTest {
    InRange inrange = new InRange();
    public InRangeTest() {
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
     Assert.assertTrue("Result not as expected",inrange.inRange(5, false));
     Assert.assertTrue("Result not as expected",inrange.inRange(6, false));
     Assert.assertTrue("Result not as expected",inrange.inRange(7, false));
     Assert.assertTrue("Result not as expected",inrange.inRange(8, false));
     Assert.assertTrue("Result not as expected",inrange.inRange(9, false));
     Assert.assertTrue("Result not as expected",inrange.inRange(10, false));
     Assert.assertTrue("Result not as expected",inrange.inRange(4, false));
     Assert.assertTrue("Result not as expected",inrange.inRange(3, false));
     Assert.assertTrue("Result not as expected",inrange.inRange(2, false));
     Assert.assertTrue("Result not as expected",inrange.inRange(1, false));
     }
     @Test
     public void Test2() {
     Assert.assertTrue("Result not as expected",inrange.inRange(11, true));
     Assert.assertTrue("Result not as expected",inrange.inRange(12, true));
     Assert.assertTrue("Result not as expected",inrange.inRange(13, true));
     Assert.assertTrue("Result not as expected",inrange.inRange(0, true));
     Assert.assertTrue("Result not as expected",inrange.inRange(-1, true));
     Assert.assertTrue("Result not as expected",inrange.inRange(-12, true));
     Assert.assertTrue("Result not as expected",inrange.inRange(20, true));
     Assert.assertTrue("Result not as expected",inrange.inRange(30, true));
     Assert.assertTrue("Result not as expected",inrange.inRange(9999, true));
     Assert.assertTrue("Result not as expected",inrange.inRange(1, true));
     Assert.assertTrue("Result not as expected",inrange.inRange(10, true));
     }
     @Test
     public void Test3() {
     Assert.assertFalse("Result not as expected",inrange.inRange(11, false));
     Assert.assertFalse("Result not as expected",inrange.inRange(12, false));
     Assert.assertFalse("Result not as expected",inrange.inRange(13, false));
     Assert.assertFalse("Result not as expected",inrange.inRange(14, false));
     Assert.assertFalse("Result not as expected",inrange.inRange(15, false));
     Assert.assertFalse("Result not as expected",inrange.inRange(99, false));
     Assert.assertFalse("Result not as expected",inrange.inRange(999, false));
     Assert.assertFalse("Result not as expected",inrange.inRange(9999, false));
     Assert.assertFalse("Result not as expected",inrange.inRange(0, false));
     }
          @Test
     public void Test4() {
     Assert.assertFalse("Result not as expected",inrange.inRange(5, true));
     Assert.assertFalse("Result not as expected",inrange.inRange(6, true));
     Assert.assertFalse("Result not as expected",inrange.inRange(7, true));
     Assert.assertFalse("Result not as expected",inrange.inRange(8, true));
     Assert.assertFalse("Result not as expected",inrange.inRange(9, true));
     Assert.assertFalse("Result not as expected",inrange.inRange(4, true));
     Assert.assertFalse("Result not as expected",inrange.inRange(3, true));
     Assert.assertFalse("Result not as expected",inrange.inRange(2, true));
  
     }
    //

}
