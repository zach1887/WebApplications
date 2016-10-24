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
public class EndUpTest {
    EndUp eu = new EndUp();
    public EndUpTest() {
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
    Assert.assertEquals("Result not as expected", "HeLLO", eu.endUp("Hello"));
}
     @Test
     public void Test2() {
    Assert.assertEquals("Result not as expected", "hi thERE", eu.endUp("hi there"));
}
     @Test
     public void Test3() {
    Assert.assertEquals("Result not as expected", "HI", eu.endUp("hi"));
}
     @Test
     public void Test4() {
    Assert.assertEquals("Result not as expected", "M M", eu.endUp("m m"));
}
     @Test
     public void Test5() {
    Assert.assertEquals("Result not as expected", "ABCDEFGHIJKL", eu.endUp("ABCDEFGHIjkl"));
}
     @Test
     public void Test6() {
    Assert.assertEquals("Result not as expected", "   ABC", eu.endUp("   abc"));
}
     @Test
     public void Test7() {
    Assert.assertEquals("Result not as expected", "  aBCD", eu.endUp("  abcd"));
}
     @Test
     public void Test8() {
    Assert.assertEquals("Result not as expected", "abc   ", eu.endUp("abc   "));
}
     @Test
     public void Test9() {
    Assert.assertEquals("Result not as expected", "123", eu.endUp("123"));
}
     @Test
     public void Test10() {
    Assert.assertEquals("Result not as expected", "abc def ghi jkl MN", eu.endUp("abc def ghi jkl mn"));
}
}
