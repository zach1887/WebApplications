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
public class StripXTest {
    StripX stx = new StripX();
    public StripXTest() {
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
     Assert.assertEquals("Result not as expected","Hi",stx.stripX("xHix"));
     Assert.assertEquals("Result not as expected","Hello",stx.stripX("xHellox"));
     Assert.assertEquals("Result not as expected","xHellox",stx.stripX("xxHelloxx"));
     Assert.assertEquals("Result not as expected","1Hello2",stx.stripX("x1Hello2x"));
     }
     @Test
     public void Test2() {
     Assert.assertEquals("Result not as expected","Hi",stx.stripX("xHi"));
     Assert.assertEquals("Result not as expected","HiHows it going?",stx.stripX("xHiHows it going?"));
     Assert.assertEquals("Result not as expected","x xx xx ",stx.stripX("xx xx xx "));
     Assert.assertEquals("Result not as expected","123456789",stx.stripX("x123456789"));
     }
     @Test
     public void Test3() {
     Assert.assertEquals("Result not as expected","Hi",stx.stripX("Hix"));
     Assert.assertEquals("Result not as expected","HiHows it going?",stx.stripX("HiHows it going?x"));
     Assert.assertEquals("Result not as expected","x xx xx ",stx.stripX("xx xx xx x"));
     Assert.assertEquals("Result not as expected","123456789",stx.stripX("123456789x"));
     }
     @Test
     public void Test4() {
     Assert.assertEquals("Result not as expected","Hi",stx.stripX("Hi"));
     Assert.assertEquals("Result not as expected","HiHows it going?",stx.stripX("HiHows it going?"));
     Assert.assertEquals("Result not as expected","",stx.stripX(""));
     Assert.assertEquals("Result not as expected"," ",stx.stripX(" "));
     Assert.assertEquals("Result not as expected","  ",stx.stripX("  "));
     Assert.assertEquals("Result not as expected","123456789",stx.stripX("123456789"));
     }
}
