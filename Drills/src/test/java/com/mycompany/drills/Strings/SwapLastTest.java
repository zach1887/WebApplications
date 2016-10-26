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
public class SwapLastTest {
    SwapLast swap = new SwapLast();
    public SwapLastTest() {
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
         Assert.assertEquals("Result not as expected","codign",swap.swapLast("coding"));
         Assert.assertEquals("Result not as expected","codni",swap.swapLast("codin"));
         Assert.assertEquals("Result not as expected","coid",swap.swapLast("codi"));
         Assert.assertEquals("Result not as expected","cdo",swap.swapLast("cod"));
         Assert.assertEquals("Result not as expected","oc",swap.swapLast("co"));
     }
     @Test
     public void Test2() {
         Assert.assertEquals("Result not as expected","cta",swap.swapLast("cat"));
         Assert.assertEquals("Result not as expected","caxt",swap.swapLast("catx"));
         Assert.assertEquals("Result not as expected","catxx",swap.swapLast("catxx"));
         Assert.assertEquals("Result not as expected","catxxx",swap.swapLast("catxxx"));
         Assert.assertEquals("Result not as expected","catx ",swap.swapLast("cat x"));
         Assert.assertEquals("Result not as expected","cat x",swap.swapLast("catx "));
         Assert.assertEquals("Result not as expected","cat  ",swap.swapLast("cat  "));
     }
     @Test
     public void Test3() {
         Assert.assertEquals("Result not as expected","ba",swap.swapLast("ab"));
         Assert.assertEquals("Result not as expected","21",swap.swapLast("12"));
         Assert.assertEquals("Result not as expected"," f",swap.swapLast("f "));
         Assert.assertEquals("Result not as expected","g ",swap.swapLast(" g"));
         Assert.assertEquals("Result not as expected"," ",swap.swapLast(" "));
         Assert.assertEquals("Result not as expected","8",swap.swapLast("8"));
         Assert.assertEquals("Result not as expected"," ",swap.swapLast(" "));
         Assert.assertEquals("Result not as expected","",swap.swapLast(""));

     }
}
