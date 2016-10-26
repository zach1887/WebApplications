/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Strings;

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
public class EndsWithLyTest {
    EndsWithLy endsLy = new EndsWithLy();
    public EndsWithLyTest() {
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
     Assert.assertTrue(endsLy.endsWithLy("oddly"));
     Assert.assertTrue(endsLy.endsWithLy("odly"));
     Assert.assertTrue(endsLy.endsWithLy("dly"));
     Assert.assertTrue(endsLy.endsWithLy("ly"));
     }
     @Test
     public void Test2() {
     Assert.assertFalse(endsLy.endsWithLy("y"));
     Assert.assertFalse(endsLy.endsWithLy(""));
     Assert.assertFalse(endsLy.endsWithLy("yl"));
     Assert.assertFalse(endsLy.endsWithLy("xxxxx"));
     }
     @Test
     public void Test3() {
     Assert.assertFalse(endsLy.endsWithLy("oddy"));
     Assert.assertFalse(endsLy.endsWithLy("dy"));
     Assert.assertFalse(endsLy.endsWithLy("xlx"));
     Assert.assertFalse(endsLy.endsWithLy("lylylylylylyylylylyl"));
     }
}
