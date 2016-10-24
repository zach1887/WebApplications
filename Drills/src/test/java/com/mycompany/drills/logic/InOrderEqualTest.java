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
public class InOrderEqualTest {
    InOrderEqual inorder = new InOrderEqual();
    public InOrderEqualTest() {
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
     Assert.assertTrue("Result not as expected",inorder.inOrderEqual(2, 5, 11, false));
     Assert.assertTrue("Result not as expected",inorder.inOrderEqual(2, 5, 11, true));
     Assert.assertTrue("Result not as expected",inorder.inOrderEqual(2, 5, 110, false));
     Assert.assertTrue("Result not as expected",inorder.inOrderEqual(2, 5, 110, true));
     Assert.assertTrue("Result not as expected",inorder.inOrderEqual(-2, -1, 11, false));
     Assert.assertTrue("Result not as expected",inorder.inOrderEqual(-2, 0, 11, true));
     }
     @Test
     public void Test2() {
     Assert.assertTrue("Result not as expected",inorder.inOrderEqual(5, 5, 11, true));
     Assert.assertTrue("Result not as expected",inorder.inOrderEqual(5, 11, 11, true));
     Assert.assertTrue("Result not as expected",inorder.inOrderEqual(5, 5, 5, true));
     Assert.assertTrue("Result not as expected",inorder.inOrderEqual(-5, -5, 11, true));
     Assert.assertTrue("Result not as expected",inorder.inOrderEqual(0, 1, 1, true));
     Assert.assertTrue("Result not as expected",inorder.inOrderEqual(0, 0, 9999, true));
     }
     @Test
     public void Test3() {
     Assert.assertFalse("Result not as expected",inorder.inOrderEqual(5, 5, 11, false));
     Assert.assertFalse("Result not as expected",inorder.inOrderEqual(5, 11, 11, false));
     Assert.assertFalse("Result not as expected",inorder.inOrderEqual(5, 5, 5, false));
     Assert.assertFalse("Result not as expected",inorder.inOrderEqual(-5, -5, 11, false));
     Assert.assertFalse("Result not as expected",inorder.inOrderEqual(0, 1, 1, false));
     Assert.assertFalse("Result not as expected",inorder.inOrderEqual(0, 0, 9999,false));
     }
     @Test
     public void Test4() {
     Assert.assertFalse("Result not as expected",inorder.inOrderEqual(5, 0, 11, false));
     Assert.assertFalse("Result not as expected",inorder.inOrderEqual(5, 0, 11, true));
     Assert.assertFalse("Result not as expected",inorder.inOrderEqual(5, 10, 0, false));
     Assert.assertFalse("Result not as expected",inorder.inOrderEqual(5, 10, 0, true));
     Assert.assertFalse("Result not as expected",inorder.inOrderEqual(10, 8, 2, false));
     Assert.assertFalse("Result not as expected",inorder.inOrderEqual(10, 8, 2, true));
     Assert.assertFalse("Result not as expected",inorder.inOrderEqual(10, 18, 2, false));
     Assert.assertFalse("Result not as expected",inorder.inOrderEqual(10, 18, 2, true));
     }
}
