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
public class Front3Test {
    Front3 f3 = new Front3();
    public Front3Test() {
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
     Assert.assertEquals("MicMicMic", f3.front3("Microsoft"));
     }
     @Test
     public void Test2() {
     Assert.assertEquals("ChoChoCho", f3.front3("Chocolate"));
     }
     @Test
     public void Test3() {
     Assert.assertEquals("atatat", f3.front3("at"));
     }
     @Test
     public void Test4() {
     Assert.assertEquals("MNOMNOMNO", f3.front3("MNODoesn't matter what I put here"));
     }
     @Test
     public void Test5() {
     Assert.assertEquals("MMM", f3.front3("M"));
     }
     @Test
     public void Test6() {
     Assert.assertEquals("   ", f3.front3(" "));
     }
}

//front3("Microsoft") -> "MicMicMic"
//front3("Chocolate") -> "ChoChoCho"
//front3("at") -> "atatat"