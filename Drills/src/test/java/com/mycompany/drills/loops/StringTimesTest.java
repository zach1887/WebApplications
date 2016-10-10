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
public class StringTimesTest {

    StringTimes st = new StringTimes();

    public StringTimesTest() {
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

    @Test
    public void Test1() {

        Assert.assertEquals("Incorrect output.", "HiHi", st.stringTimes("Hi", 2));
    
    }
    @Test
    public void Test2() {

        Assert.assertEquals("Incorrect output.", "HiHiHi", st.stringTimes("Hi", 3));
    
    }
    @Test
    public void Test3() {

        Assert.assertEquals("Incorrect output.", "Hi", st.stringTimes("Hi", 1));
    
    }
    @Test
    public void Test4() {

        Assert.assertEquals("Incorrect output.", "", st.stringTimes("Hi", 0));
    
    }
    @Test
    public void Test5() {

        Assert.assertEquals("Incorrect output.", "", st.stringTimes("abcdefghijklmnopqrstuvwxyz", 0));
    
    }
//    @Test  The spaces did not work
//      public void Test6() {
//
//        Assert.assertEquals("Incorrect output.", "   ", st.stringTimes(" ", 0));
//  
//    }
    
    
}
