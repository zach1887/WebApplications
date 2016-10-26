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
public class TakeTwoFromPositionTest {
    TakeTwoFromPosition tt = new TakeTwoFromPosition();
            
    public TakeTwoFromPositionTest() {
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
     Assert.assertEquals("Result not as expected","ja",tt.takeTwoFromPosition("java", 0));
     Assert.assertEquals("Result not as expected","av",tt.takeTwoFromPosition("java", 1));
     Assert.assertEquals("Result not as expected","va",tt.takeTwoFromPosition("java", 2));
     Assert.assertEquals("Result not as expected","ja",tt.takeTwoFromPosition("java", 3));
     Assert.assertEquals("Result not as expected","ja",tt.takeTwoFromPosition("java", 4));
     Assert.assertEquals("Result not as expected","ja",tt.takeTwoFromPosition("java", 5));
     Assert.assertEquals("Result not as expected","ja",tt.takeTwoFromPosition("java", 993));
}
     @Test
     public void Test2() {
     Assert.assertEquals("Result not as expected","ab",tt.takeTwoFromPosition("abcdefg", 0));
     Assert.assertEquals("Result not as expected","bc",tt.takeTwoFromPosition("abcdefg", 1));
     Assert.assertEquals("Result not as expected","cd",tt.takeTwoFromPosition("abcdefg", 2));
     Assert.assertEquals("Result not as expected","de",tt.takeTwoFromPosition("abcdefg", 3));
     Assert.assertEquals("Result not as expected","ef",tt.takeTwoFromPosition("abcdefg", 4));
     Assert.assertEquals("Result not as expected","fg",tt.takeTwoFromPosition("abcdefg", 5));
     Assert.assertEquals("Result not as expected","ab",tt.takeTwoFromPosition("abcdefg", 6));
     Assert.assertEquals("Result not as expected","ab",tt.takeTwoFromPosition("abcdefg", 7));
     Assert.assertEquals("Result not as expected","ab",tt.takeTwoFromPosition("abcdefg", 8));
     Assert.assertEquals("Result not as expected","ab",tt.takeTwoFromPosition("abcdefg", 12));
}
          @Test
     public void Test3() {
     Assert.assertEquals("Result not as expected","  ",tt.takeTwoFromPosition("  ", 0));
     Assert.assertEquals("Result not as expected","  ",tt.takeTwoFromPosition("  ", 1));
     Assert.assertEquals("Result not as expected","1 ",tt.takeTwoFromPosition("1 2 3 ", 0));
     Assert.assertEquals("Result not as expected"," 2",tt.takeTwoFromPosition("1 2 3 ", 1));
     Assert.assertEquals("Result not as expected","2 ",tt.takeTwoFromPosition("1 2 3 ", 2));
     Assert.assertEquals("Result not as expected"," 3",tt.takeTwoFromPosition("1 2 3 ", 3));
     Assert.assertEquals("Result not as expected","3 ",tt.takeTwoFromPosition("1 2 3 ", 4));
     Assert.assertEquals("Result not as expected","1 ",tt.takeTwoFromPosition("1 2 3 ", 5));
     Assert.assertEquals("Result not as expected","1 ",tt.takeTwoFromPosition("1 2 3 ", 6));
     Assert.assertEquals("Result not as expected","1 ",tt.takeTwoFromPosition("1 2 3 ", 18));
     Assert.assertEquals("Result not as expected","1 ",tt.takeTwoFromPosition("1 2 3 ", 44));

     }
}
