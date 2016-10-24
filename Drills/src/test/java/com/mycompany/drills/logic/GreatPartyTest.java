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
public class GreatPartyTest {
    GreatParty gpt = new GreatParty();
    
    public GreatPartyTest() {
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
         Assert.assertTrue("Result not as expected.", gpt.greatParty(70, true));
     }
     @Test
     public void Test2() {
         Assert.assertTrue("Result not as expected.", gpt.greatParty(50, false));
     }
     @Test
     public void Test3() {
         Assert.assertFalse("Result not as expected.", gpt.greatParty(30, false));
     }
     @Test
     public void Test4() {
         Assert.assertFalse("Result not as expected.", gpt.greatParty(30, true));
     }
     @Test
     public void Test5() {
         Assert.assertFalse("Result not as expected.", gpt.greatParty(80, false));
     }
}
