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
public class SleepingInTest {
    SleepingIn sleep = new SleepingIn();
    
    public SleepingInTest() {
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
     Assert.assertTrue("Not true as expected.", sleep.canSleepIn(false, false));
 }
 @Test
 public void Test2() {
     Assert.assertFalse("Not true as expected.", sleep.canSleepIn(true, false));
 }
 @Test
 public void Test3() {
     Assert.assertTrue("Not true as expected.", sleep.canSleepIn(false, true));
 }
 @Test
 public void Test4() {
     Assert.assertTrue("Not true as expected.", sleep.canSleepIn(true, true));
 }
}
