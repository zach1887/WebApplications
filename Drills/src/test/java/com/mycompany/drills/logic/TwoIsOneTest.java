/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.logic;

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
public class TwoIsOneTest {
    TwoIsOne two = new TwoIsOne();
    public TwoIsOneTest() {
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
    Assert.assertTrue("Result is not true as expected.", two.twoIsOne(1, 2, 3));
    }
     @Test
    public void Test2() {
    Assert.assertTrue("Result is not true as expected.", two.twoIsOne(3, 1, 2));
    }
     @Test
    public void Test3() {
    Assert.assertFalse("Result is not false as expected.", two.twoIsOne(3, 2, 2));
    }
     @Test
    public void Test4() {
    Assert.assertTrue("Result is not true as expected.", two.twoIsOne(3, 0, -3));
    }
     @Test
    public void Test5() {
    Assert.assertTrue("Result is not true as expected.", two.twoIsOne(0, 0, 0));
    }
     @Test
    public void Test6() {
    Assert.assertFalse("Result is not false as expected.", two.twoIsOne(19, 8, 5));
    }
     @Test
    public void Test7() {
    Assert.assertTrue("Result is not true as expected.", two.twoIsOne(-3, -8, -5));
    }
     @Test
    public void Test8() {
    Assert.assertFalse("Result is not false as expected.", two.twoIsOne(0, 0, 5));
    }
}
