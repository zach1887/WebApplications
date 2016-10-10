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
public class Multiple3or5Test {
    Multiple3or5 m35 = new Multiple3or5();
    
    public Multiple3or5Test() {
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
     Assert.assertTrue("Result not as expected",m35.multiple3or5(3));
     }
     @Test
     public void Test2() {
     Assert.assertTrue("Result not as expected",m35.multiple3or5(10));
     }
     @Test
     public void Test3() {
     Assert.assertFalse("Result not as expected",m35.multiple3or5(8));
     }
     @Test
     public void Test4() {
     Assert.assertTrue("Result not as expected",m35.multiple3or5(0));
     }
     @Test
     public void Test5() {
     Assert.assertTrue("Result not as expected",m35.multiple3or5(80));
     }
     @Test
     public void Test6() {
     Assert.assertTrue("Result not as expected",m35.multiple3or5(1232678770));
     }
     @Test
     public void Test7() {
     Assert.assertTrue("Result not as expected",m35.multiple3or5(501));
     }
     @Test
     public void Test8() {
     Assert.assertFalse("Result not as expected",m35.multiple3or5(299));
     }
}
