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
public class SameFirstLastTest {
    SameFirstLast sfl = new SameFirstLast();
    public SameFirstLastTest() {
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
         int [] arr = {1,2,3};
         
         Assert.assertFalse("Result not as expected",sfl.sameFirstLast(arr));
 
     }
     @Test
     public void Test2() {
         int [] arr = {1,2,3,1};
         
         Assert.assertTrue("Result not as expected",sfl.sameFirstLast(arr));
 
     }
     @Test
     public void Test3() {
         int [] arr = {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1};
         
         Assert.assertTrue("Result not as expected",sfl.sameFirstLast(arr));
 
     }
     @Test
     public void Test4() {
         int [] arr = {1,2,1};
         
         Assert.assertTrue("Result not as expected",sfl.sameFirstLast(arr));
 
     }
     @Test
     public void Test5() {
         int [] arr = {0,0,0,0,0,0,0,0,0,0,0,0,1};
         
         Assert.assertFalse("Result not as expected",sfl.sameFirstLast(arr));
 
     }
     @Test
     public void Test6() {
         int [] arr = {};
         
         Assert.assertFalse("Result not as expected",sfl.sameFirstLast(arr));
 
     }
}
