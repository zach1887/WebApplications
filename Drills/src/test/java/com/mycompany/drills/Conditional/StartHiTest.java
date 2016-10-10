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
public class StartHiTest {
    StartHi sh = new StartHi();
    public StartHiTest() {
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
         
         Assert.assertTrue("Result not as expected", sh.startHi("hi there"));
     
     }
     @Test
     public void Test2() {
         
         Assert.assertTrue("Result not as expected", sh.startHi("hi"));
     
     }
     @Test
     public void Test3() {
         
         Assert.assertFalse("Result not as expected", sh.startHi("high up"));
     
     }
     @Test
     public void Test4() {
         
         Assert.assertFalse("Result not as expected", sh.startHi("hi, there"));
     
     }
     @Test
     public void Test5() {
         
         Assert.assertTrue("Result not as expected", sh.startHi("hi write whatever I want here"));
     
     }
     @Test
     public void Test6() {
         
         Assert.assertTrue("Result not as expected", sh.startHi("hi                         "));
     
     }
     @Test
     public void Test7() {
         
         Assert.assertFalse("Result not as expected", sh.startHi(" hi"));
     
     }
     @Test
     public void Test8() {
         
         Assert.assertFalse("Result not as expected", sh.startHi(""));
     
     }
}
