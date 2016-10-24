/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.logic;

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
public class CanHazTableTest {
    CanHazTable cht = new CanHazTable();
    public CanHazTableTest() {
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
     Assert.assertEquals("Result not as expected", 2, cht.canHazTable(5, 10));
     }
     @Test
     public void Test2() {
     Assert.assertEquals("Result not as expected", 0, cht.canHazTable(5, 2));
     }
     @Test
     public void Test3() {
     Assert.assertEquals("Result not as expected", 1, cht.canHazTable(5, 5));
     }
     @Test
     public void Test4() {
     Assert.assertEquals("Result not as expected", 2, cht.canHazTable(10, 10));
     }
     @Test
     public void Test5() {
     Assert.assertEquals("Result not as expected", 0, cht.canHazTable(2, 2));
     }
     @Test
     public void Test6() {
     Assert.assertEquals("Result not as expected", 0, cht.canHazTable(10, 2));
     }
     @Test
     public void Test7() {
     Assert.assertEquals("Result not as expected", 0, cht.canHazTable(2, 10));
     }
     
}
