/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Conditional;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.Assert;

/**
 *
 * @author Jesse
 */
public class Diff21Test {
    Diff21 d21 = new Diff21();
    public Diff21Test() {
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
     Assert.assertEquals("Input not as expected",4,d21.diff21(23));
     }
     @Test
     public void Test2() {
     Assert.assertEquals("Input not as expected",11,d21.diff21(10));
     }
     @Test
     public void Test3() {
     Assert.assertEquals("Input not as expected",0,d21.diff21(21));
     }
     @Test
     public void Test4() {
     Assert.assertEquals("Input not as expected",29,d21.diff21(-8));
     }
     @Test
     public void Test5() {
     Assert.assertEquals("Input not as expected",68,d21.diff21(55));
     }
     @Test
     public void Test6() {
     Assert.assertEquals("Input not as expected",200,d21.diff21(121));
     }
   
}
