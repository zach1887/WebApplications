/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.logic;

import com.mycompany.drills.logic.AreInOrder;
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
public class AreInOrderTest {
    AreInOrder order = new AreInOrder();
    
    public AreInOrderTest() {
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
     public void test1() {
         
         Assert.assertTrue("Test 1 should return true.", order.areInOrder(1, 2, 4, false));
     }
     @Test
     public void test2() {
         
         Assert.assertFalse("Test 2 should return false.", order.areInOrder(1, 2, 1, false));
     }
     @Test
     public void test3() {
         
         Assert.assertTrue("Test 3 should return true.", order.areInOrder(1, 1, 2, true));
     }
     @Test
     public void test4() {
         
         Assert.assertFalse("Test 4 should return false.", order.areInOrder(3, 3, 3, false));
     }
     @Test
     public void test5() {
         
         Assert.assertFalse("Test 5 should return true.", order.areInOrder(3, 3, 4, false));
     }
     @Test
     public void test6() {
         
         Assert.assertTrue("Test 6 should return true.", order.areInOrder(4, 4, 4, true));
     }


}
