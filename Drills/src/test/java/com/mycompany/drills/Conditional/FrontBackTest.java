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
public class FrontBackTest {
    FrontBack fb = new FrontBack();
    
    public FrontBackTest() {
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
         
         Assert.assertEquals("edoc",fb.frontBack("code"));
     
     }
     @Test
     public void Test2() {
         
         Assert.assertEquals("a",fb.frontBack("a"));
     
     }
     @Test
     public void Test3() {
         
         Assert.assertEquals("ba",fb.frontBack("ab"));
     
     }
     @Test
     public void Test4() {
         
         Assert.assertEquals("x x",fb.frontBack("x x"));
     
     }
     @Test
     public void Test5() {
         
         Assert.assertEquals(" x ",fb.frontBack(" x "));
     
     }
     @Test
     public void Test6() {
         
         Assert.assertEquals("xh1hh",fb.frontBack("hh1hx"));
     
     }
     @Test
     public void Test7() {
         
         Assert.assertEquals("234",fb.frontBack("432"));
     
     }
     @Test
     public void Test8() {
         
         Assert.assertEquals("5 4 3 2 1",fb.frontBack("1 2 3 4 5"));
     
     }
     @Test
     public void Test9() {
         
         Assert.assertEquals("",fb.frontBack(""));
     
     }
}
//frontBack("code") -> "eodc"
//frontBack("a") -> "a"
//frontBack("ab") -> "ba"