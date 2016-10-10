/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.logic;

import com.mycompany.drills.logic.Mod20;
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
public class Mod20Test {
    Mod20 m20 = new Mod20();
    
    public Mod20Test() {
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
  public void test1 () {
      
      Assert.assertFalse("Test 1 should return as false.", m20.mod20(20));
   
  }
  @Test
  public void test2 () {
      
      Assert.assertTrue("Test 2 should return as true.", m20.mod20(21));
   
  }
  @Test
  public void test3 () {
      
      Assert.assertTrue("Test 3 should return as true.", m20.mod20(22));
   
  }
  @Test
  public void test4 () {
      
      Assert.assertFalse("Test 4 should return as false.", m20.mod20(23));
   
  }

}
