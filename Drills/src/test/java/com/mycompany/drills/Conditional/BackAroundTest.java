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
public class BackAroundTest {
    BackAround ba = new BackAround();
    public BackAroundTest() {
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
     Assert.assertEquals("tcatt",ba.backAround("cat"));
     }
     @Test
     public void Test2() {
     Assert.assertEquals("tcatt",ba.backAround("cat"));
     }
     @Test
     public void Test3() {
     Assert.assertEquals("oHelloo",ba.backAround("Hello"));
     }
     @Test
     public void Test4() {
     Assert.assertEquals("xxoxx",ba.backAround("xox"));
     }
     @Test
     public void Test5() {
     Assert.assertEquals("  x  ",ba.backAround(" x "));
     }
     @Test
     public void Test6() {
     Assert.assertEquals("2122",ba.backAround("12"));
     }
}
//backAround("cat") -> "tcatt"
//backAround("Hello") -> "oHelloo"
//backAround("a") -> "aaa"