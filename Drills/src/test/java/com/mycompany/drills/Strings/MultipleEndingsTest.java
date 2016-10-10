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
public class MultipleEndingsTest {
    MultipleEndings me = new MultipleEndings();
    
    public MultipleEndingsTest() {
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
     Assert.assertEquals("lololo",me.multipleEndings("Hello"));
     }
     @Test
     public void Test2() {
     Assert.assertEquals("ababab",me.multipleEndings("ab"));
     }
     @Test
     public void Test3() {
     Assert.assertEquals("HiHiHi",me.multipleEndings("Hi"));
     }
     @Test
     public void Test4() {
     Assert.assertEquals("",me.multipleEndings("H"));
     }
     @Test
     public void Test5() {
     Assert.assertEquals(" i i i",me.multipleEndings("H i"));
     }
     @Test
     public void Test6() {
     Assert.assertEquals("HiHiHi",me.multipleEndings(" Hi"));
     }
     @Test
     public void Test7() {
     Assert.assertEquals("X2X2X2",me.multipleEndings("XXXXXX2"));
     }
     @Test
     public void Test8() {
     Assert.assertEquals("333333",me.multipleEndings("Hi Hi Hi Hi 33"));
     }
     @Test
     public void Test9() {
     Assert.assertEquals("      ",me.multipleEndings("fgghfgh  "));
     }
     @Test
     public void Test10() {
     Assert.assertEquals("",me.multipleEndings(""));
     }
}
