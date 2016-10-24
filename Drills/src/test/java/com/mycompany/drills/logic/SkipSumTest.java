/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.logic;

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
public class SkipSumTest {
    SkipSum ss = new SkipSum();
    public SkipSumTest() {
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
     Assert.assertEquals("Result not as expected", 7, ss.skipSum(3, 4));
     }
     @Test
     public void Test2() {
     Assert.assertEquals("Result not as expected", 20, ss.skipSum(9, 4));
     }
     @Test
     public void Test3() {
     Assert.assertEquals("Result not as expected", 21, ss.skipSum(10, 11));
     }
     @Test
     public void Test4() {
     Assert.assertEquals("Result not as expected", 20, ss.skipSum(5, 10));
     }
     @Test
     public void Test5() {
     Assert.assertEquals("Result not as expected", 20, ss.skipSum(3, 17));
     }
     @Test
     public void Test6() {
     Assert.assertEquals("Result not as expected", 20, ss.skipSum(9, 7));
     }
     @Test
     public void Test7() {
     Assert.assertEquals("Result not as expected", 20, ss.skipSum(3, 7));
     }
     @Test
     public void Test8() {
     Assert.assertEquals("Result not as expected", 0, ss.skipSum(0,0));
     }
}
