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
public class FirstHalfTest {
    FirstHalf fh = new FirstHalf();
    public FirstHalfTest() {
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
     Assert.assertEquals("Result not as expected", "Woo",fh.firstHalf("Woohoo"));
     Assert.assertEquals("Result not as expected", "Woo",fh.firstHalf("Wooccc"));
     Assert.assertEquals("Result not as expected", "Woo",fh.firstHalf("Woo x "));
     }
     @Test
     public void Test2() {
     Assert.assertEquals("Result not as expected", "Hello",fh.firstHalf("HelloThere"));
     Assert.assertEquals("Result not as expected", "Hello",fh.firstHalf("Hello12344"));
     Assert.assertEquals("Result not as expected", "Hello",fh.firstHalf("Hello    x"));
     }
     @Test
     public void Test3() {
     Assert.assertEquals("Result not as expected", "abc",fh.firstHalf("abcdef"));
     Assert.assertEquals("Result not as expected", "abc",fh.firstHalf("abcabc"));
     Assert.assertEquals("Result not as expected", "abc",fh.firstHalf("abc v "));
     }
     @Test
     public void Test4() {
     Assert.assertEquals("Result not as expected", "",fh.firstHalf(""));
     Assert.assertEquals("Result not as expected", " ",fh.firstHalf("  "));
     Assert.assertEquals("Result not as expected", "  ",fh.firstHalf("    "));
     }
     
     @Test
     public void Test5() {
     Assert.assertEquals("Result not as expected", "",fh.firstHalf("abc"));
     Assert.assertEquals("Result not as expected", "",fh.firstHalf("abcde"));
     Assert.assertEquals("Result not as expected", "",fh.firstHalf("1234567"));
     }
     @Test
     public void Test6() {
     Assert.assertEquals("Result not as expected", "abcde",fh.firstHalf("abcdefghij"));
     Assert.assertEquals("Result not as expected", "",fh.firstHalf("abcdefghijk"));
     Assert.assertEquals("Result not as expected", "abcdef",fh.firstHalf("abcdefghijkl"));
     }
     
}
