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
public class CaughtSpeedingTest {
    CaughtSpeeding cs = new CaughtSpeeding();
    
    public CaughtSpeedingTest() {
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
     Assert.assertEquals(0,cs.caughtSpeeding(60, true));
     }
     @Test
     public void Test2() {
     Assert.assertEquals(1,cs.caughtSpeeding(65, false));
     }
     @Test
     public void Test3() {
     Assert.assertEquals(0,cs.caughtSpeeding(65, true));
     }
     @Test
     public void Test4() {
     Assert.assertEquals(1,cs.caughtSpeeding(80, true));
     }
     @Test
     public void Test5() {
     Assert.assertEquals(1,cs.caughtSpeeding(80, false));
     }
     @Test
     public void Test6() {
     Assert.assertEquals(1,cs.caughtSpeeding(85, true));
     }
     @Test
     public void Test7() {
     Assert.assertEquals(2,cs.caughtSpeeding(85, false));
     }
     @Test
     public void Test8() {
     Assert.assertEquals(2,cs.caughtSpeeding(90, true));
     }
     @Test
     public void Test9() {
     Assert.assertEquals(2,cs.caughtSpeeding(90, false));
     }
}
