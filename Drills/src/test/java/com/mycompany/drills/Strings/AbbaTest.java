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
public class AbbaTest {
    Abba ab = new Abba();
    public AbbaTest() {
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
     Assert.assertEquals("Result not as expected", "HiByeByeHi",ab.abba("Hi", "Bye"));
     }
     @Test
     public void Test2() {
     Assert.assertEquals("Result not as expected", "YoAliceAliceYo",ab.abba("Yo", "Alice"));
     }
     @Test
     public void Test3() {
     Assert.assertEquals("Result not as expected", "WhatUpUpWhat",ab.abba("What", "Up"));
     }
     @Test
     public void Test4() {
     Assert.assertEquals("Result not as expected", "Hi  Hi",ab.abba("Hi", " "));
     }
     @Test
     public void Test5() {
     Assert.assertEquals("Result not as expected", " ByeBye ",ab.abba(" ", "Bye"));
     }

     @Test
     public void Test6() {
     Assert.assertEquals("Result not as expected", "ByeBye",ab.abba("", "Bye"));
     }

     @Test
     public void Test7() {
     Assert.assertEquals("Result not as expected", "HiHi",ab.abba("Hi", ""));
     }
     @Test
     public void Test8() {
     Assert.assertEquals("Result not as expected", "",ab.abba("", ""));
     }
}
