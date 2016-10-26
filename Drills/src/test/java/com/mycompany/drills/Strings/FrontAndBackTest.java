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
public class FrontAndBackTest {
    FrontAndBack fb = new FrontAndBack();
    public FrontAndBackTest() {
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
     Assert.assertEquals("Result not as expected", "Helo",fb.frontAndBack("Hello", 2));
     Assert.assertEquals("Result not as expected", "Helllo",fb.frontAndBack("Hello", 3));
     Assert.assertEquals("Result not as expected", "Hellello",fb.frontAndBack("Hello", 4));
     Assert.assertEquals("Result not as expected", "HelloHello",fb.frontAndBack("Hello", 5));
     }
     @Test
     public void Test2() {
     Assert.assertEquals("Result not as expected", "Choate",fb.frontAndBack("Chocolate", 3));
     Assert.assertEquals("Result not as expected", "Choclate",fb.frontAndBack("Chocolate", 4));
     Assert.assertEquals("Result not as expected", "Chocoolate",fb.frontAndBack("Chocolate", 5));
     }
     @Test
     public void Test3() {
     Assert.assertEquals("Result not as expected", "Ce",fb.frontAndBack("Chocolate", 1));
     Assert.assertEquals("Result not as expected", "",fb.frontAndBack("Chocolate", 0));
     Assert.assertEquals("Result not as expected", "CeCe",fb.frontAndBack("Ce", 2));
     Assert.assertEquals("Result not as expected", "Ce",fb.frontAndBack("Ce", 1));
     Assert.assertEquals("Result not as expected", "XX",fb.frontAndBack("X", 1));
     }
}
