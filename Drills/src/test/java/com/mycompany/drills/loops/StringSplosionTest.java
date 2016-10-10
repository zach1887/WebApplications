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
public class StringSplosionTest {
    StringSplosion ssp = new StringSplosion();
    public StringSplosionTest() {
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


     @Test
     public void Test1() {
     Assert.assertEquals("Result not as expected","CCoCodCode",ssp.stringSplosion("Code"));
     }
     @Test
     public void Test2() {
     Assert.assertEquals("Result not as expected","aababc",ssp.stringSplosion("abc"));
     }
     @Test
     public void Test3() {
     Assert.assertEquals("Result not as expected","aab",ssp.stringSplosion("ab"));
     }
     @Test
     public void Test4() {
     Assert.assertEquals("Result not as expected","",ssp.stringSplosion(""));
     }
     @Test
     public void Test5() {
     Assert.assertEquals("Result not as expected","11 1 21 2 1 2 31 2 3 ",ssp.stringSplosion("1 2 3 "));
     }
     @Test
     public void Test6() {
     Assert.assertEquals("Result not as expected","     1  12  123",ssp.stringSplosion("  123"));
     }
}
