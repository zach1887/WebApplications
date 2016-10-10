/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.loops;

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
public class EveryOtherTest {
    EveryOther eo = new EveryOther();
    
    public EveryOtherTest() {
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
     
     Assert.assertEquals("Output is incorrect","Hlo",eo.everyOther("Hello"));
     }
     @Test
     public void Test2() {
     
     Assert.assertEquals("Output is incorrect","H",eo.everyOther("Hi"));
     }
     @Test
     public void Test3() {
     
     Assert.assertEquals("Output is incorrect","Hello",eo.everyOther("Heeololeo"));
     }
     @Test
     public void Test4() {
     
     Assert.assertEquals("Output is incorrect","Hidden",eo.everyOther("H i d d e n"));
     }
     
     @Test // this test failed... don't know how to handle the spaces
     public void Test5() {
     
     Assert.assertEquals("Output is incorrect","   ",eo.everyOther(" B l a n k"));
     }
}
