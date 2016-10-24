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
public class PlayOutsideTest {
    PlayOutside pout = new PlayOutside();
    public PlayOutsideTest() {
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
         Assert.assertTrue("Result not as expected", pout.playOutside(70, false));
     }
     @Test
     public void Test2() {
         Assert.assertFalse("Result not as expected", pout.playOutside(95, false));
     }
     @Test
     public void Test3() {
         Assert.assertTrue("Result not as expected", pout.playOutside(95, true));
     }
     @Test
     public void Test4() {
         Assert.assertFalse("Result not as expected", pout.playOutside(100, false));
     }
     @Test
     public void Test5() {
         Assert.assertTrue("Result not as expected", pout.playOutside(100, true));
     }
     @Test
     public void Test6() {
         Assert.assertFalse("Result not as expected", pout.playOutside(105, true));
     }
     @Test
     public void Test7() {
         Assert.assertFalse("Result not as expected", pout.playOutside(105, false));
     }
     @Test
     public void Test8() {
         Assert.assertFalse("Result not as expected", pout.playOutside(55, true));
     }
     @Test
     public void Test9() {
         Assert.assertFalse("Result not as expected", pout.playOutside(55, false));
     }
}
