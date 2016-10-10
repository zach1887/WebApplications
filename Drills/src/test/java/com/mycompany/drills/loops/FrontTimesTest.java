/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.loops;

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
public class FrontTimesTest {
    FrontTimes ft = new FrontTimes();
    public FrontTimesTest() {
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
         Assert.assertEquals("Output is incorrect","ChoCho",ft.frontTimes("Chocolate", 2));
     
     }
     @Test
     public void Test2() {
         Assert.assertEquals("Output is incorrect","ChoChoCho",ft.frontTimes("Chocolate", 3));
     
     }
     @Test
     public void Test3() {
         Assert.assertEquals("Output is incorrect","abcabcabc",ft.frontTimes("abc", 3));
     
     }
     @Test
     public void Test4() {
         Assert.assertEquals("Output is incorrect","",ft.frontTimes("abc", 0));
     
     }
     @Test
     public void Test5() {
         Assert.assertEquals("Output is incorrect","ggg",ft.frontTimes("g", 3));
     
     }
     @Test
     public void Test6() {
         Assert.assertEquals("Output is incorrect","a ca ca ca ca c",ft.frontTimes("a c", 5));
     
     }
     @Test
     public void Test7() {
         Assert.assertEquals("Output is incorrect","",ft.frontTimes("", 15));
     
     }
     @Test
     public void Test8() {
         Assert.assertEquals("Output is incorrect","mmmmmmmmmm",ft.frontTimes("m", 10));
     
     }
     @Test
     public void Test9() {
         Assert.assertEquals("Output is incorrect","2222",ft.frontTimes("22", 2));
     
     }
     @Test
     public void Test10() {
         Assert.assertEquals("Output is incorrect","abcabcabcabcabcabcabc",ft.frontTimes("abcd - no one will see this part.", 7));
     
     }
}
