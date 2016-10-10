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
public class SumDoubleTest {
    SumDouble sd = new SumDouble();
    
    public SumDoubleTest() {
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
     Assert.assertEquals("Result was not as expected.",3, sd.sumDouble(1, 2));
     
     }
     
     @Test
     public void Test2() {
     Assert.assertEquals("Result was not as expected.",5, sd.sumDouble(3, 2));
     
     }
     
     @Test
     public void Test3() {
     Assert.assertEquals("Result was not as expected.",8, sd.sumDouble(2, 2));
     
     }
     
     @Test
     public void Test4() {
     Assert.assertEquals("Result was not as expected.",-4, sd.sumDouble(-1, -1));
     
     }
     
     @Test
     public void Test5() {
     Assert.assertEquals("Result was not as expected.",0, sd.sumDouble(1, -1));
     
     }
     
     @Test
     public void Test6() {
     Assert.assertEquals("Result was not as expected.",0, sd.sumDouble(0, 0));
     
     
     }
     @Test
     public void Test7() {
     Assert.assertEquals("Result was not as expected.",0, sd.sumDouble(1, -1));
     
     }
}
