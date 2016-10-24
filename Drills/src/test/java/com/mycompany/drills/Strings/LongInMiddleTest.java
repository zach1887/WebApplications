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
public class LongInMiddleTest {
    LongInMiddle lm =  new LongInMiddle();
    public LongInMiddleTest() {
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
     Assert.assertEquals("Result not as expected", "hiHelloHellohi", lm.longInMiddle("Hello", "hi"));
     Assert.assertEquals("Result not as expected", " HelloHello ", lm.longInMiddle("Hello", " "));
     Assert.assertEquals("Result not as expected", " hihi ", lm.longInMiddle(" ", "hi"));
     }
     @Test
     public void Test2() {
     Assert.assertEquals("Result not as expected", "hiHelloHellohi", lm.longInMiddle("hi", "Hello"));
     Assert.assertEquals("Result not as expected", "hihi", lm.longInMiddle("hi", ""));
     Assert.assertEquals("Result not as expected", "HelloHello", lm.longInMiddle("", "Hello"));
     }
     @Test
     public void Test3() {
     Assert.assertEquals("Result not as expected", "baaaaaab", lm.longInMiddle("aaa", "b"));
     Assert.assertEquals("Result not as expected", "abbbbbba", lm.longInMiddle("a", "bbb"));
     Assert.assertEquals("Result not as expected", "bbaaaaaabb", lm.longInMiddle("aaa", "bb"));
     Assert.assertEquals("Result not as expected", "aabbbbbbaa", lm.longInMiddle("aa", "bbb"));
     Assert.assertEquals("Result not as expected", "      ", lm.longInMiddle("  ", " "));
     Assert.assertEquals("Result not as expected", "  ", lm.longInMiddle("", " "));
     }
     @Test
     public void Test4() {
     Assert.assertNull("Result not as expected", lm.longInMiddle("hi", "hi"));
     Assert.assertNull("Result not as expected", lm.longInMiddle("Hello", "Hello"));
     Assert.assertNull("Result not as expected",lm.longInMiddle(" ", " "));
     Assert.assertNull("Result not as expected",lm.longInMiddle("", ""));
     }
}
