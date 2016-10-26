/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Strings;

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
public class HasBadTest {
    HasBad hasbad = new HasBad();
    public HasBadTest() {
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
     Assert.assertTrue("Result not as expected",hasbad.hasBad("badxx") );
     Assert.assertTrue("Result not as expected",hasbad.hasBad("bad") );
     Assert.assertTrue("Result not as expected",hasbad.hasBad("bad ") );
     Assert.assertTrue("Result not as expected",hasbad.hasBad("bad  xx") );
     Assert.assertTrue("Result not as expected",hasbad.hasBad("bad     xx") );
     Assert.assertTrue("Result not as expected",hasbad.hasBad("badwhateveI feel like putting here") );
     }
     @Test
     public void Test2() {
     Assert.assertTrue("Result not as expected",hasbad.hasBad("xbadxx") );
     Assert.assertTrue("Result not as expected",hasbad.hasBad("xbad") );
     Assert.assertTrue("Result not as expected",hasbad.hasBad("xbad ") );
     Assert.assertTrue("Result not as expected",hasbad.hasBad("xbad  xx") );
     Assert.assertTrue("Result not as expected",hasbad.hasBad(" bad     xx") );
     Assert.assertTrue("Result not as expected",hasbad.hasBad(" badwhateveI feel like putting here") );
     }
     @Test
     public void Test3() {
     Assert.assertFalse("Result not as expected",hasbad.hasBad("xxbadxx") );
     Assert.assertFalse("Result not as expected",hasbad.hasBad("xbbadxx") );
     Assert.assertFalse("Result not as expected",hasbad.hasBad("  badxx") );
     Assert.assertFalse("Result not as expected",hasbad.hasBad("12badbadbadbadreallyreallybad") );
     Assert.assertFalse("Result not as expected",hasbad.hasBad("") );
     Assert.assertFalse("Result not as expected",hasbad.hasBad(" ") );

     }
}
