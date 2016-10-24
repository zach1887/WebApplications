/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Strings;

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
public class MiddleTwoTest {
    MiddleTwo mdtwo = new MiddleTwo();
    public MiddleTwoTest() {
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
     Assert.assertEquals("Result not as expected", "ri", mdtwo.middleTwo("String"));
     Assert.assertEquals("Result not as expected", "ri", mdtwo.middleTwo("trin"));
     Assert.assertEquals("Result not as expected", "ri", mdtwo.middleTwo("string"));
     Assert.assertEquals("Result not as expected", "ri", mdtwo.middleTwo("XStringX"));
     Assert.assertEquals("Result not as expected", "ri", mdtwo.middleTwo("XXStringXX"));
     Assert.assertEquals("Result not as expected", "ri", mdtwo.middleTwo("1234567890String1234567890"));
     }
     
     @Test
     public void Test2() {
      Assert.assertEquals("Result not as expected","od",mdtwo.middleTwo("code"));   
      Assert.assertEquals("Result not as expected","od",mdtwo.middleTwo("od"));   
      Assert.assertEquals("Result not as expected","od",mdtwo.middleTwo(" od "));   
      Assert.assertEquals("Result not as expected","od",mdtwo.middleTwo("  od  "));   
      Assert.assertEquals("Result not as expected","od",mdtwo.middleTwo("   od   "));   
      Assert.assertEquals("Result not as expected","od",mdtwo.middleTwo("    od    "));   
      Assert.assertEquals("Result not as expected","od",mdtwo.middleTwo("x code x"));   
      Assert.assertEquals("Result not as expected","od",mdtwo.middleTwo("x x xodx x x"));          
     }
     @Test
     public void Test3() {
      Assert.assertEquals("Result not as expected","ct",mdtwo.middleTwo("Practice"));   
      Assert.assertEquals("Result not as expected","ct",mdtwo.middleTwo("practice"));   
      Assert.assertEquals("Result not as expected","CT",mdtwo.middleTwo("PRACTICE"));   
      Assert.assertEquals("Result not as expected","ct",mdtwo.middleTwo("PRActICE"));   
      Assert.assertEquals("Result not as expected","cT",mdtwo.middleTwo("PrAcTiCe"));   
      Assert.assertEquals("Result not as expected"," t",mdtwo.middleTwo("P r a c t i c e "));   
      Assert.assertEquals("Result not as expected","ti",mdtwo.middleTwo("Practice  "));   
      Assert.assertEquals("Result not as expected","ic",mdtwo.middleTwo("Practice    "));   
      Assert.assertEquals("Result not as expected","ce",mdtwo.middleTwo("Practice      "));   
      Assert.assertEquals("Result not as expected","e ",mdtwo.middleTwo("Practice        "));     
     }
     
     @Test
     public void Test4() {
      Assert.assertNull("Result not as expected",mdtwo.middleTwo(""));
      Assert.assertNull("Result not as expected",mdtwo.middleTwo(" "));
      Assert.assertNull("Result not as expected",mdtwo.middleTwo("X"));
      Assert.assertNull("Result not as expected",mdtwo.middleTwo("   "));
      Assert.assertNull("Result not as expected",mdtwo.middleTwo("XXX"));
      Assert.assertNull("Result not as expected",mdtwo.middleTwo("XXXXX"));
      Assert.assertNull("Result not as expected",mdtwo.middleTwo("12345"));
      Assert.assertNull("Result not as expected",mdtwo.middleTwo("12 45"));
      Assert.assertNull("Result not as expected",mdtwo.middleTwo("12345678987654321"));
     }
}
