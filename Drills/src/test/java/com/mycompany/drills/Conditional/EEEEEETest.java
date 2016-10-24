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
public class EEEEEETest {
    EEEEEE ee = new EEEEEE();
    public EEEEEETest() {
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
     Assert.assertTrue("Not as expected", ee.gotE("Hello"));
     }
     @Test
     public void Test2() {
     Assert.assertTrue("Not as expected", ee.gotE("Heelle"));
     }
     @Test
     public void Test3() {
     Assert.assertFalse("Not as expected", ee.gotE("Heelele"));
     }
     @Test
     public void Test4() {
     Assert.assertFalse("Not as expected", ee.gotE("H"));
     }
     @Test
     public void Test5() {
     Assert.assertTrue("Not as expected", ee.gotE("e"));
     }
     @Test
     public void Test6() {
     Assert.assertFalse("Not as expected", ee.gotE("E"));
     }
     @Test
     public void Test7() {
     Assert.assertFalse("Not as expected", ee.gotE(""));
     }
     @Test
     public void Test8() {
     Assert.assertTrue("Not as expected", ee.gotE("                              ee"));
     }
     @Test
     public void Test9() {
     Assert.assertFalse("Not as expected", ee.gotE("       e        e            e                e"));
     }
}
