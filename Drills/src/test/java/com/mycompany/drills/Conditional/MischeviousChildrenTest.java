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
public class MischeviousChildrenTest {
    MischeviousChildren mc = new MischeviousChildren();
    
    public MischeviousChildrenTest() {
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
     public void Test1 () {
     
     Assert.assertTrue("Result was not true as expected.", mc.areWeInTrouble(true, true));
     }
     @Test
     public void Test2 () {
     
     Assert.assertFalse("Result was not true as expected.", mc.areWeInTrouble(false, true));
     }
     @Test
     public void Test3 () {
     
     Assert.assertFalse("Result was not true as expected.", mc.areWeInTrouble(true, false));
     }
     @Test
     public void Test4 () {
     
     Assert.assertTrue("Result was not true as expected.", mc.areWeInTrouble(false, false));
     }

}
