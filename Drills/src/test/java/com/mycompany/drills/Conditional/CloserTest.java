/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Conditional;

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
public class CloserTest {
    Closer c = new Closer();
    
    public CloserTest() {
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
     Assert.assertEquals("Results not as expected", 8, c.closer(8, 13));
     }
     @Test
     public void Test2() {
     Assert.assertEquals("Results not as expected", 8, c.closer(13, 8));
     }
     @Test
     public void Test3() {
     Assert.assertEquals("Results not as expected", 0, c.closer(7, 13));
     }
     @Test
     public void Test4() {
     Assert.assertEquals("Results not as expected", 0, c.closer(13, 7));
     }
     @Test
     public void Test5() {
     Assert.assertEquals("Results not as expected", 0, c.closer(20, 20));
     }
     @Test
     public void Test6() {
     Assert.assertEquals("Results not as expected", 0, c.closer(0,0));
     }
     @Test
     public void Test7() {
     Assert.assertEquals("Results not as expected", 0, c.closer(0, 35000));
     }
     @Test
     public void Test8() {
     Assert.assertEquals("Results not as expected", 0, c.closer(200, 0));
     }
     @Test
     public void Test9() {
     Assert.assertEquals("Results not as expected", -10, c.closer(-10, -20));
     }
     @Test
     public void Test10() {
     Assert.assertEquals("Results not as expected", -10, c.closer(-20, -10));
     }
     @Test
     public void Test11() {
     Assert.assertEquals("Results not as expected", -999, c.closer(-999, -9999));
     }
     @Test
     public void Test12() {
     Assert.assertEquals("Results not as expected", 999, c.closer(999, 9999));
     }
}
