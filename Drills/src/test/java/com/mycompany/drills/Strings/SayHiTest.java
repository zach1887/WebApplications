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
public class SayHiTest {
    SayHi sh = new SayHi();
    
    public SayHiTest() {
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
     Assert.assertEquals("Output not as expected", "Hello Bob", sh.sayHi("Bob"));
     }
     @Test
     public void Test2() {
     Assert.assertEquals("Output not as expected", "Hello Alice", sh.sayHi("Alice"));
     }
     @Test
     public void Test3() {
     Assert.assertEquals("Output not as expected", "Hello X", sh.sayHi("X"));
     }
     @Test
     public void Test4() {
     Assert.assertEquals("Output not as expected", "Hello ", sh.sayHi(""));
     }
     @Test
     public void Test5() {
     Assert.assertEquals("Output not as expected", "Hello  ", sh.sayHi(" "));
     }
}
