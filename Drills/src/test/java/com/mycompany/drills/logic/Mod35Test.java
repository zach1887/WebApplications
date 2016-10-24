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
public class Mod35Test {
    Mod35 m35 = new Mod35();
    public Mod35Test() {
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
     Assert.assertTrue("Result not as expected", m35.mod35(3));
     Assert.assertTrue("Result not as expected", m35.mod35(5));
     Assert.assertTrue("Result not as expected", m35.mod35(6));
     Assert.assertTrue("Result not as expected", m35.mod35(9));
     Assert.assertTrue("Result not as expected", m35.mod35(10));
     Assert.assertTrue("Result not as expected", m35.mod35(12));
     Assert.assertTrue("Result not as expected", m35.mod35(18));
     Assert.assertTrue("Result not as expected", m35.mod35(36));
     Assert.assertTrue("Result not as expected", m35.mod35(54));
     Assert.assertTrue("Result not as expected", m35.mod35(162));
     Assert.assertTrue("Result not as expected", m35.mod35(125));
     Assert.assertTrue("Result not as expected", m35.mod35(625));
     }
     @Test
     public void Test2() {
     Assert.assertFalse("Result not as expected", m35.mod35(0));
     Assert.assertFalse("Result not as expected", m35.mod35(15));
     Assert.assertFalse("Result not as expected", m35.mod35(15*1));
     Assert.assertFalse("Result not as expected", m35.mod35(15*3));
     Assert.assertFalse("Result not as expected", m35.mod35(15*5));
     Assert.assertFalse("Result not as expected", m35.mod35(15*12));
     Assert.assertFalse("Result not as expected", m35.mod35(15*244));
     Assert.assertFalse("Result not as expected", m35.mod35(15*1045));
     Assert.assertFalse("Result not as expected", m35.mod35(15*9999));
     }
     @Test
     public void Test3() {
     Assert.assertFalse("Result not as expected", m35.mod35(2));
     Assert.assertFalse("Result not as expected", m35.mod35(4));
     Assert.assertFalse("Result not as expected", m35.mod35(8));
     Assert.assertFalse("Result not as expected", m35.mod35(7));
     Assert.assertFalse("Result not as expected", m35.mod35(11));
     Assert.assertFalse("Result not as expected", m35.mod35(13*13));
     Assert.assertFalse("Result not as expected", m35.mod35(2*7*11*13*17*19*23));
     Assert.assertFalse("Result not as expected", m35.mod35(3*3*3*3*3*5 + 1));
     Assert.assertFalse("Result not as expected", m35.mod35(5*5*5*5*5*5*3 + 1));
     }
}
