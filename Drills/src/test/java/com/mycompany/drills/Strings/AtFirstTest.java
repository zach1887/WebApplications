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
public class AtFirstTest {
    AtFirst af = new AtFirst();
    public AtFirstTest() {
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
     Assert.assertEquals("Result not as expected","he",af.atFirst("hello"));
     Assert.assertEquals("Result not as expected","he",af.atFirst("hesfasdf"));
     Assert.assertEquals("Result not as expected","he",af.atFirst("he            cvcvb"));
     Assert.assertEquals("Result not as expected","he",af.atFirst("he1233245 123124"));
     }
     @Test
     public void Test2() {
     Assert.assertEquals("Result not as expected","Hi",af.atFirst("Hi"));
     Assert.assertEquals("Result not as expected","mm",af.atFirst("mm"));
     Assert.assertEquals("Result not as expected","12",af.atFirst("12"));
     Assert.assertEquals("Result not as expected","@@",af.atFirst("@@"));
     }
     @Test
     public void Test3() {
     Assert.assertEquals("Result not as expected","h@",af.atFirst("h"));
     Assert.assertEquals("Result not as expected"," @",af.atFirst(" "));
     Assert.assertEquals("Result not as expected","  ",af.atFirst("  "));
     Assert.assertEquals("Result not as expected","@@",af.atFirst(""));
     Assert.assertEquals("Result not as expected","@@",af.atFirst("@"));
     Assert.assertEquals("Result not as expected","2@",af.atFirst("2"));
     Assert.assertEquals("Result not as expected","g@",af.atFirst("g"));
     Assert.assertEquals("Result not as expected","X@",af.atFirst("X"));
     Assert.assertEquals("Result not as expected","#@",af.atFirst("#"));
     }
}
