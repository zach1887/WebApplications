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
public class ConCatTest {
    ConCat cc = new ConCat();
    
    public ConCatTest() {
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
     Assert.assertEquals("Results not as expected","abcat",cc.conCat("abc", "cat"));
     Assert.assertEquals("Results not as expected","abcat",cc.conCat("ab", "cat"));
     Assert.assertEquals("Results not as expected","abcat",cc.conCat("abc", "at"));
     Assert.assertEquals("Results not as expected","abcxcat",cc.conCat("abcx", "xcat"));
     Assert.assertEquals("Results not as expected","ac",cc.conCat("a", "c"));
     Assert.assertEquals("Results not as expected","axc",cc.conCat("ax", "xc"));
     }
     @Test
     public void Test2() {
     Assert.assertEquals("Results not as expected","dogcat",cc.conCat("dog", "cat"));
     Assert.assertEquals("Results not as expected","xxxcat",cc.conCat("xxx", "cat"));
     Assert.assertEquals("Results not as expected","   cat",cc.conCat("   ", "cat"));
     Assert.assertEquals("Results not as expected","  cat",cc.conCat("  ", "cat"));
     Assert.assertEquals("Results not as expected"," cat",cc.conCat(" ", "cat"));
     Assert.assertEquals("Results not as expected","dog",cc.conCat("dog", ""));
     Assert.assertEquals("Results not as expected","dog ",cc.conCat("dog", " "));
     Assert.assertEquals("Results not as expected","dog  ",cc.conCat("dog", "  "));
     Assert.assertEquals("Results not as expected","dog   ",cc.conCat("dog", "   "));
     }
     @Test
     public void Test3() {
     Assert.assertEquals("Results not as expected","abc",cc.conCat("abc", ""));
     Assert.assertEquals("Results not as expected","abce",cc.conCat("abce", ""));
     Assert.assertEquals("Results not as expected","abcef",cc.conCat("abcef", ""));
     Assert.assertEquals("Results not as expected","abcefg",cc.conCat("abcefg", ""));
     Assert.assertEquals("Results not as expected","abc",cc.conCat("","abc"));
     Assert.assertEquals("Results not as expected"," abce",cc.conCat(" ","abce"));
     Assert.assertEquals("Results not as expected"," abcef",cc.conCat(" ","abcef"));
     Assert.assertEquals("Results not as expected"," abcefg",cc.conCat(" ","abcefg"));
     Assert.assertEquals("Results not as expected"," ",cc.conCat(" "," "));
     Assert.assertEquals("Results not as expected"," ",cc.conCat(" ",""));
     Assert.assertEquals("Results not as expected","",cc.conCat("",""));

     }
}
