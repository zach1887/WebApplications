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
public class RollDiceTest {
    RollDice rd = new RollDice();
    public RollDiceTest() {
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
    
     @Test
     public void Test1() {
     Assert.assertEquals("Result not as expected", 5, rd.rollDice(2, 3, true));
     Assert.assertEquals("Result not as expected", 6, rd.rollDice(2, 4, true));
     Assert.assertEquals("Result not as expected", 7, rd.rollDice(2, 5, true));
     Assert.assertEquals("Result not as expected", 8, rd.rollDice(2, 6, true));
     Assert.assertEquals("Result not as expected", 3, rd.rollDice(1, 2, true));
     Assert.assertEquals("Result not as expected", 5, rd.rollDice(3, 2, true));
     Assert.assertEquals("Result not as expected", 9, rd.rollDice(4, 5, true));
     Assert.assertEquals("Result not as expected", 10, rd.rollDice(6, 4, true));
     Assert.assertEquals("Result not as expected", 8, rd.rollDice(3, 5, true));
     Assert.assertEquals("Result not as expected", 9, rd.rollDice(3, 6, true));
     Assert.assertEquals("Result not as expected", 11, rd.rollDice(5, 6, true));
     }
     @Test
     public void Test2() {
     Assert.assertEquals("Result not as expected", 3, rd.rollDice(1, 1, true));
     Assert.assertEquals("Result not as expected", 5, rd.rollDice(2, 2, true));
     Assert.assertEquals("Result not as expected", 7, rd.rollDice(3, 3, true));
     Assert.assertEquals("Result not as expected", 9, rd.rollDice(4, 4, true));
     Assert.assertEquals("Result not as expected", 11, rd.rollDice(5, 5, true));
     Assert.assertEquals("Result not as expected", 7, rd.rollDice(6, 6, true));
     }
     @Test
     public void Test3() {
     Assert.assertEquals("Result not as expected", 2, rd.rollDice(1, 1, false));
     Assert.assertEquals("Result not as expected", 4, rd.rollDice(2, 2, false));
     Assert.assertEquals("Result not as expected", 6, rd.rollDice(3, 3, false));
     Assert.assertEquals("Result not as expected", 8, rd.rollDice(4, 4, false));
     Assert.assertEquals("Result not as expected", 10, rd.rollDice(5, 5, false));
     Assert.assertEquals("Result not as expected", 12, rd.rollDice(6, 6, false));
     }
}
