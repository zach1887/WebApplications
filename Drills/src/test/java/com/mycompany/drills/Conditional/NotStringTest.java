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
public class NotStringTest {
    NotString ns = new NotString();
    public NotStringTest() {
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
     Assert.assertEquals("not candy",ns.notString("candy"));
     Assert.assertEquals("not x",ns.notString("x"));
     Assert.assertEquals("not candy",ns.notString("not candy"));
     Assert.assertEquals("not",ns.notString("not"));
     Assert.assertEquals("not 1",ns.notString("not 1"));
     Assert.assertEquals("not xx",ns.notString("not xx"));
     Assert.assertEquals("not xx",ns.notString("xx"));
     Assert.assertEquals("not  xx",ns.notString(" xx"));
     Assert.assertEquals("not   xx",ns.notString("  xx"));
     Assert.assertEquals("not  ",ns.notString(" "));
     Assert.assertEquals("not   ",ns.notString("  "));
     }
}
