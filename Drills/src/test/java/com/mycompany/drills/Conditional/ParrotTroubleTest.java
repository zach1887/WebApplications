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
public class ParrotTroubleTest {
    ParrotTrouble pt = new ParrotTrouble();
   
   
    public ParrotTroubleTest() {
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
     
         Assert.assertTrue("Not true as expected", pt.parrotTrouble(true, 6));
     }
     @Test
     public void Test2() {
     
         Assert.assertFalse("Not true as expected", pt.parrotTrouble(true, 7));
     }
     @Test
     public void Test3() {
     
         Assert.assertFalse("Not true as expected", pt.parrotTrouble(false, 6));
     }
     @Test
     public void Test4() {
     
         Assert.assertFalse("Not true as expected", pt.parrotTrouble(false, 22));
     }
     @Test
     public void Test5() {
     
         Assert.assertTrue("Not true as expected", pt.parrotTrouble(true, 22));
     }
}
