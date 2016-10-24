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
public class IcyHotTest {
    IcyHot icyhot = new IcyHot();
    public IcyHotTest() {
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
     Assert.assertTrue("Result not as expected",icyhot.icyHot(120, -1));
     Assert.assertTrue("Result not as expected",icyhot.icyHot(101, -1));
     Assert.assertTrue("Result not as expected",icyhot.icyHot(120, -100));
     Assert.assertTrue("Result not as expected",icyhot.icyHot(101, -100));
     Assert.assertFalse("Result not as expected",icyhot.icyHot(120, 0));
     Assert.assertFalse("Result not as expected",icyhot.icyHot(100, -1));
     }
     @Test
     public void Test2() {
     Assert.assertTrue("Result not as expected",icyhot.icyHot(-1, 120));
     Assert.assertTrue("Result not as expected",icyhot.icyHot(-1, 101));
     Assert.assertTrue("Result not as expected",icyhot.icyHot(-120, 101));
     Assert.assertTrue("Result not as expected",icyhot.icyHot(101, -100));
     Assert.assertFalse("Result not as expected",icyhot.icyHot(0, 120));
     Assert.assertFalse("Result not as expected",icyhot.icyHot(-1, 100));
     }
     @Test
     public void Test3() {
     Assert.assertFalse("Result not as expected",icyhot.icyHot(2, 120));
     Assert.assertFalse("Result not as expected",icyhot.icyHot(120, 2));
     Assert.assertFalse("Result not as expected",icyhot.icyHot(-2, -2));
     Assert.assertFalse("Result not as expected",icyhot.icyHot(120, 120));
     Assert.assertFalse("Result not as expected",icyhot.icyHot(60, 60));
     Assert.assertFalse("Result not as expected",icyhot.icyHot(0, 100));
     Assert.assertFalse("Result not as expected",icyhot.icyHot(100, 0));
     Assert.assertFalse("Result not as expected",icyhot.icyHot(0, 0));

     }
}
