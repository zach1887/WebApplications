/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Arrays;

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
public class MakePiTest {
    MakePi mp = new MakePi();
    public MakePiTest() {
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
         int [] arr = {3,1,4};
     Assert.assertArrayEquals("Result not as expected", arr, mp.makePi(3));
     }
     @Test
     public void Test2() {
         int [] arr = {3,1,4,1};
     Assert.assertArrayEquals("Result not as expected", arr, mp.makePi(4));
     }
     @Test
     public void Test3() {
         int [] arr = {3,1,4,1,5};
     Assert.assertArrayEquals("Result not as expected", arr, mp.makePi(5));
     }
     @Test
     public void Test4() {
         int [] arr = {3,1,4,1,5,9};
     Assert.assertArrayEquals("Result not as expected", arr, mp.makePi(6));
     }
     @Test
     public void Test5() {
         int [] arr = {3,1,4,1,5,9,2};
     Assert.assertArrayEquals("Result not as expected", arr, mp.makePi(7));
     }
}
