/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.logic;

import com.mycompany.drills.logic.AnswerCell;
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
public class AnswerCellTest {
    
    AnswerCell ac = new AnswerCell();
    
    public AnswerCellTest() {
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
 
        Assert.assertTrue("Test 1 should return true.", ac.answerCell(false, false, false));
         // you're not asleep and it's not morning, so you will answer any call
    }
    @Test
    public void test2() {
  
        Assert.assertFalse("Test 2 should return false.", ac.answerCell(false, false, true));
          // you're asleep so the first two values don't matter
    }
    
    @Test
    public void test3() {
  
        Assert.assertFalse("Test 3 should return false.", ac.answerCell(true, false, false));
         // it's morning and it's not Mom, so you don't answer
        
    }
    
    @Test
    public void test4() {
  
        Assert.assertFalse("Test 4 should return false.", ac.answerCell(true, true, true));
          // you're asleep so the first two values don't matter
    }
    
    @Test
    public void test5() {
  
        Assert.assertTrue("Test 4 should return true.", ac.answerCell(true, true, false));
         // it's morning but it is Mom, so you don't answer
    }
 
}
