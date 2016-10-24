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
public class RotateLeft2Test {
    RotateLeft2 rl2 = new RotateLeft2();
    public RotateLeft2Test() {
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
     Assert.assertEquals("Result not as expected", "lloHe",rl2.rotateLeft2("Hello"));
     Assert.assertEquals("Result not as expected", "lloxxHe",rl2.rotateLeft2("Helloxx"));
     Assert.assertEquals("Result not as expected", "Helloxx",rl2.rotateLeft2("xxHello"));
     }
     @Test
     public void Test2() {
     Assert.assertEquals("Result not as expected", "vaja",rl2.rotateLeft2("java"));
     Assert.assertEquals("Result not as expected", "java  ",rl2.rotateLeft2("  java"));
     Assert.assertEquals("Result not as expected", "va  ja",rl2.rotateLeft2("java  "));
     }
     @Test
     public void Test3() {
     Assert.assertEquals("Result not as expected", "Hi",rl2.rotateLeft2("Hi"));
     Assert.assertEquals("Result not as expected", " Hi",rl2.rotateLeft2("Hi "));
     Assert.assertEquals("Result not as expected", "  Hi",rl2.rotateLeft2("Hi  "));
     }

     @Test
     public void Test4() {
     Assert.assertNull("Result not as expected",rl2.rotateLeft2(""));
     Assert.assertNull("Result not as expected",rl2.rotateLeft2(" "));
     Assert.assertNull("Result not as expected",rl2.rotateLeft2("2"));
     Assert.assertNull("Result not as expected",rl2.rotateLeft2("@"));
     Assert.assertNull("Result not as expected",rl2.rotateLeft2("x"));

     }
}
