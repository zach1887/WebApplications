/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.MethodDrills.arrays;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class FirstLastSixTest {

    private FirstLastSix testObj;

    public FirstLastSixTest() {
    }

    @BeforeClass
    public static void setUpClass() {
 
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        testObj = new FirstLastSix();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void definitionTestA() {
        int[] testArray = {4, 2, 3, 4, 1, 6};
        boolean result = testObj.firstLastSix(testArray);
        
        Assert.assertTrue("Input{4,2,3,4,1,6} is not true as expected",result); 
    }
    
    @Test
    public void definitionTestB() {
        int[] testArray = {4, 6, 6, 6, 6, 4};
        boolean result = testObj.firstLastSix(testArray);
        
        Assert.assertFalse("Input{4,6,6,6,6,4} is not false as expected",result); 
    }
//    @Test
//    public void definitionTestC() {
//        int[] testArray = null;
//        boolean result = testObj.firstLastSix(testArray);
//        
//        Assert.assertFalse("null is not false as expected",result); 
//    }
//    
    @Test
    public void singleValueArray(){
        int[] testArray = {4};
         boolean result = testObj.firstLastSix(testArray);
         
         Assert.assertFalse("Input {4} us not false as expected.", result);
    }
}
