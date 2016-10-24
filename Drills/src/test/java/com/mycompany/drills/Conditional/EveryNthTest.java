/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Conditional;

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
public class EveryNthTest {
    EveryNth enth = new EveryNth ();
    public EveryNthTest() {
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
     Assert.assertEquals("Results as expected", "Mrce",enth.everyNth("Miracle", 2));
     }
     @Test
     public void Test2() {
     Assert.assertEquals("Results as expected", "aceg",enth.everyNth("abcdefg", 2));
     }
     @Test
     public void Test3() {
     Assert.assertEquals("Results as expected", "adg",enth.everyNth("abcdefg", 3));
     }
     @Test
     public void Test4() {
     Assert.assertEquals("Results as expected", "ae",enth.everyNth("abcdefg", 4));
     }
     @Test
     public void Test5() {
     Assert.assertEquals("Results as expected", "",enth.everyNth("Miracle", 0));
     }
     @Test
     public void Test6() {
     Assert.assertEquals("Results as expected", "",enth.everyNth("", 6));
     }
     @Test
     public void Test7() {
     Assert.assertEquals("Results as expected", "",enth.everyNth("", 0));
     }
     @Test
     public void Test8() {
     Assert.assertEquals("Results as expected", "147",enth.everyNth("123456789", 3));
     }
     @Test
     public void Test9() {
     Assert.assertEquals("Results as expected", "15948",enth.everyNth("123456789123456789", 4));
     }
}
